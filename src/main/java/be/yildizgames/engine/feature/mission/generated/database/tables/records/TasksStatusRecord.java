/*
 * This file is generated by jOOQ.
*/
package be.yildizgames.engine.feature.mission.generated.database.tables.records;


import be.yildizgames.engine.feature.mission.generated.database.tables.TasksStatus;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


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
public class TasksStatusRecord extends UpdatableRecordImpl<TasksStatusRecord> implements Record5<Integer, Integer, Short, Integer, String> {

    private static final long serialVersionUID = 416706427;

    /**
     * Setter for <code>PUBLIC.TASKS_STATUS.TST_ID</code>.
     */
    public void setTstId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.TASKS_STATUS.TST_ID</code>.
     */
    public Integer getTstId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>PUBLIC.TASKS_STATUS.TSK_ID</code>.
     */
    public void setTskId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.TASKS_STATUS.TSK_ID</code>.
     */
    public Integer getTskId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>PUBLIC.TASKS_STATUS.PLY_ID</code>.
     */
    public void setPlyId(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.TASKS_STATUS.PLY_ID</code>.
     */
    public Short getPlyId() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>PUBLIC.TASKS_STATUS.MIS_ID</code>.
     */
    public void setMisId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.TASKS_STATUS.MIS_ID</code>.
     */
    public Integer getMisId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>PUBLIC.TASKS_STATUS.STATUS</code>.
     */
    public void setStatus(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>PUBLIC.TASKS_STATUS.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Short, Integer, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Short, Integer, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TasksStatus.TASKS_STATUS.TST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TasksStatus.TASKS_STATUS.TSK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return TasksStatus.TASKS_STATUS.PLY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TasksStatus.TASKS_STATUS.MIS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TasksStatus.TASKS_STATUS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getTstId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getTskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getPlyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getMisId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getTstId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getTskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getPlyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getMisId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TasksStatusRecord value1(Integer value) {
        setTstId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TasksStatusRecord value2(Integer value) {
        setTskId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TasksStatusRecord value3(Short value) {
        setPlyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TasksStatusRecord value4(Integer value) {
        setMisId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TasksStatusRecord value5(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TasksStatusRecord values(Integer value1, Integer value2, Short value3, Integer value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TasksStatusRecord
     */
    public TasksStatusRecord() {
        super(TasksStatus.TASKS_STATUS);
    }

    /**
     * Create a detached, initialised TasksStatusRecord
     */
    public TasksStatusRecord(Integer tstId, Integer tskId, Short plyId, Integer misId, String status) {
        super(TasksStatus.TASKS_STATUS);

        set(0, tstId);
        set(1, tskId);
        set(2, plyId);
        set(3, misId);
        set(4, status);
    }
}
