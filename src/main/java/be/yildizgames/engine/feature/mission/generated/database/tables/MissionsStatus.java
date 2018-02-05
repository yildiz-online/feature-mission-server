/*
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *
 *  Copyright (c) 2018 Grégory Van den Borre
 *
 *  More infos available: https://www.yildiz-games.be
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

/*
 * This file is generated by jOOQ.
*/
package be.yildizgames.engine.feature.mission.generated.database.tables;


import be.yildizgames.engine.feature.mission.generated.database.Indexes;
import be.yildizgames.engine.feature.mission.generated.database.Keys;
import be.yildizgames.engine.feature.mission.generated.database.Public;
import be.yildizgames.engine.feature.mission.generated.database.tables.records.MissionsStatusRecord;
import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
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
public class MissionsStatus extends TableImpl<MissionsStatusRecord> {

    private static final long serialVersionUID = 1263494495;

    /**
     * The reference instance of <code>PUBLIC.MISSIONS_STATUS</code>
     */
    public static final MissionsStatus MISSIONS_STATUS = new MissionsStatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MissionsStatusRecord> getRecordType() {
        return MissionsStatusRecord.class;
    }

    /**
     * The column <code>PUBLIC.MISSIONS_STATUS.MST_ID</code>.
     */
    public final TableField<MissionsStatusRecord, Integer> MST_ID = createField("MST_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>PUBLIC.MISSIONS_STATUS.MIS_ID</code>.
     */
    public final TableField<MissionsStatusRecord, Integer> MIS_ID = createField("MIS_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>PUBLIC.MISSIONS_STATUS.PLY_ID</code>.
     */
    public final TableField<MissionsStatusRecord, Short> PLY_ID = createField("PLY_ID", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>PUBLIC.MISSIONS_STATUS.STATUS</code>.
     */
    public final TableField<MissionsStatusRecord, Byte> STATUS = createField("STATUS", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * Create a <code>PUBLIC.MISSIONS_STATUS</code> table reference
     */
    public MissionsStatus() {
        this(DSL.name("MISSIONS_STATUS"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.MISSIONS_STATUS</code> table reference
     */
    public MissionsStatus(String alias) {
        this(DSL.name(alias), MISSIONS_STATUS);
    }

    /**
     * Create an aliased <code>PUBLIC.MISSIONS_STATUS</code> table reference
     */
    public MissionsStatus(Name alias) {
        this(alias, MISSIONS_STATUS);
    }

    private MissionsStatus(Name alias, Table<MissionsStatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private MissionsStatus(Name alias, Table<MissionsStatusRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.PRIMARY_KEY_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MissionsStatusRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MISSIONS_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MissionsStatusRecord> getPrimaryKey() {
        return Keys.PK_MISSIONS_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MissionsStatusRecord>> getKeys() {
        return Arrays.<UniqueKey<MissionsStatusRecord>>asList(Keys.PK_MISSIONS_STATUS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MissionsStatus as(String alias) {
        return new MissionsStatus(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MissionsStatus as(Name alias) {
        return new MissionsStatus(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MissionsStatus rename(String name) {
        return new MissionsStatus(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MissionsStatus rename(Name name) {
        return new MissionsStatus(name, null);
    }
}
