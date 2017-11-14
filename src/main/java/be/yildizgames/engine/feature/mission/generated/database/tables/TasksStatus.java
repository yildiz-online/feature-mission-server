/*
 * This file is generated by jOOQ.
*/
package be.yildizgames.engine.feature.mission.generated.database.tables;


import be.yildizgames.engine.feature.mission.generated.database.Indexes;
import be.yildizgames.engine.feature.mission.generated.database.Keys;
import be.yildizgames.engine.feature.mission.generated.database.Public;
import be.yildizgames.engine.feature.mission.generated.database.tables.records.TasksStatusRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TasksStatus extends TableImpl<TasksStatusRecord> {

    private static final long serialVersionUID = -1120733370;

    /**
     * The reference instance of <code>PUBLIC.TASKS_STATUS</code>
     */
    public static final TasksStatus TASKS_STATUS = new TasksStatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TasksStatusRecord> getRecordType() {
        return TasksStatusRecord.class;
    }

    /**
     * The column <code>PUBLIC.TASKS_STATUS.TST_ID</code>.
     */
    public final TableField<TasksStatusRecord, Integer> TST_ID = createField("TST_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>PUBLIC.TASKS_STATUS.TSK_ID</code>.
     */
    public final TableField<TasksStatusRecord, Integer> TSK_ID = createField("TSK_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>PUBLIC.TASKS_STATUS.PLY_ID</code>.
     */
    public final TableField<TasksStatusRecord, Short> PLY_ID = createField("PLY_ID", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>PUBLIC.TASKS_STATUS.MIS_ID</code>.
     */
    public final TableField<TasksStatusRecord, Integer> MIS_ID = createField("MIS_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>PUBLIC.TASKS_STATUS.STATUS</code>.
     */
    public final TableField<TasksStatusRecord, String> STATUS = createField("STATUS", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>PUBLIC.TASKS_STATUS</code> table reference
     */
    public TasksStatus() {
        this(DSL.name("TASKS_STATUS"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.TASKS_STATUS</code> table reference
     */
    public TasksStatus(String alias) {
        this(DSL.name(alias), TASKS_STATUS);
    }

    /**
     * Create an aliased <code>PUBLIC.TASKS_STATUS</code> table reference
     */
    public TasksStatus(Name alias) {
        this(alias, TASKS_STATUS);
    }

    private TasksStatus(Name alias, Table<TasksStatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private TasksStatus(Name alias, Table<TasksStatusRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PRIMARY_KEY_DA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TasksStatusRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TASKS_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TasksStatusRecord> getPrimaryKey() {
        return Keys.PK_TASKS_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TasksStatusRecord>> getKeys() {
        return Arrays.<UniqueKey<TasksStatusRecord>>asList(Keys.PK_TASKS_STATUS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TasksStatus as(String alias) {
        return new TasksStatus(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TasksStatus as(Name alias) {
        return new TasksStatus(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TasksStatus rename(String name) {
        return new TasksStatus(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TasksStatus rename(Name name) {
        return new TasksStatus(name, null);
    }
}
