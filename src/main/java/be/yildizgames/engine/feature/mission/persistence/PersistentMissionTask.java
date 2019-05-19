/*
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *
 *  Copyright (c) 2019 Grégory Van den Borre
 *
 *  More infos available: https://engine.yildiz-games.be
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 *  documentation files (the "Software"), to deal in the Software without restriction, including without
 *  limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 *  of the Software, and to permit persons to whom the Software is furnished to do so,
 *  subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all copies or substantial
 *  portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 *  WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 *  OR COPYRIGHT  HOLDERS BE LIABLE FOR ANY CLAIM,
 *  DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE  SOFTWARE.
 *
 */

package be.yildizgames.engine.feature.mission.persistence;

import be.yildizgames.common.model.PlayerId;
import be.yildizgames.engine.feature.mission.MissionId;
import be.yildizgames.engine.feature.mission.MissionManager;
import be.yildizgames.engine.feature.mission.generated.database.tables.TasksStatus;
import be.yildizgames.engine.feature.mission.task.TaskId;
import be.yildizgames.module.database.data.PersistentData;
import org.jooq.DSLContext;
import org.jooq.conf.Settings;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Grégory Van den Borre
 */
public class PersistentMissionTask implements PersistentData<PersistentMissionTask.PlayerTaskStatus, PersistentMissionTask.PlayerTaskStatus, PersistentMissionTask.PlayerTaskStatus> {

    private static final TasksStatus TABLE = TasksStatus.TASKS_STATUS;

    private List<PlayerTaskStatus> tasks = new ArrayList<>();

    public PersistentMissionTask(Connection c, MissionManager manager) {
        super();
        try(DSLContext dsl = this.getDSL(c)) {
            Optional.ofNullable(dsl.selectFrom(TABLE))
                    .ifPresent(data -> data.forEach(
                            value -> tasks.add(new PlayerTaskStatus(
                                            TaskId.valueOf(value.getTskId().intValue()),
                                            PlayerId.valueOf(value.getPlyId().intValue()),
                                            MissionId.valueOf(value.getMisId().intValue()),
                                            value.getStatus()
                                            ))));
            this.tasks
                    .forEach(task -> manager.updateTaskStatus(task.id, task.mission, task.player, task.status));

        }
    }

    private DSLContext getDSL(Connection c) {
        Settings settings = new Settings();
        settings.setExecuteLogging(false);
        return DSL.using(c, settings);
    }

    @Override
    public PlayerTaskStatus save(PlayerTaskStatus data, Connection c) {
        try(DSLContext dsl = this.getDSL(c)) {
            dsl.insertInto(TABLE)
                    .set(TABLE.TSK_ID, (int) data.id.value)
                    .set(TABLE.PLY_ID, (short) data.player.value)
                    .set(TABLE.MIS_ID, data.mission.value)
                    .set(TABLE.STATUS, data.status)
                    .execute();
        }
        return data;
    }

    @Override
    public void update(PlayerTaskStatus data, Connection c) {

    }

    public static class PlayerTaskStatus {

        private final TaskId id;

        private final PlayerId player;

        private final MissionId mission;

        private final String status;


        public PlayerTaskStatus(TaskId id, PlayerId player, MissionId mission, String status) {
            super();
            this.id = id;
            this.player = player;
            this.mission = mission;
            this.status = status;
        }
    }

}
