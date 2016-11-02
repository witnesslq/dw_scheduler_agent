/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ajk.dw.scheduler.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;

import java.nio.ByteBuffer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TriggerBean implements org.apache.thrift.TBase<TriggerBean, TriggerBean._Fields>, java.io.Serializable, Cloneable, Comparable<TriggerBean> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TriggerBean");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)-1);
  private static final org.apache.thrift.protocol.TField JOB_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("jobId", org.apache.thrift.protocol.TType.I32, (short)-2);
  private static final org.apache.thrift.protocol.TField SCHEDULER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("schedulerId", org.apache.thrift.protocol.TType.I32, (short)-3);
  private static final org.apache.thrift.protocol.TField JOB_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("jobName", org.apache.thrift.protocol.TType.STRING, (short)-4);
  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.STRING, (short)-5);
  private static final org.apache.thrift.protocol.TField NEXT_FIRE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("nextFireTime", org.apache.thrift.protocol.TType.STRING, (short)-6);
  private static final org.apache.thrift.protocol.TField PREVIOUS_FIRE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("previousFireTime", org.apache.thrift.protocol.TType.STRING, (short)-7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TriggerBeanStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TriggerBeanTupleSchemeFactory());
  }

  private String name; // optional
  private int jobId; // required
  private int schedulerId; // required
  private String jobName; // optional
  private String state; // optional
  private String nextFireTime; // optional
  private String previousFireTime; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)-1, "name"),
    JOB_ID((short)-2, "jobId"),
    SCHEDULER_ID((short)-3, "schedulerId"),
    JOB_NAME((short)-4, "jobName"),
    STATE((short)-5, "state"),
    NEXT_FIRE_TIME((short)-6, "nextFireTime"),
    PREVIOUS_FIRE_TIME((short)-7, "previousFireTime");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case -1: // NAME
          return NAME;
        case -2: // JOB_ID
          return JOB_ID;
        case -3: // SCHEDULER_ID
          return SCHEDULER_ID;
        case -4: // JOB_NAME
          return JOB_NAME;
        case -5: // STATE
          return STATE;
        case -6: // NEXT_FIRE_TIME
          return NEXT_FIRE_TIME;
        case -7: // PREVIOUS_FIRE_TIME
          return PREVIOUS_FIRE_TIME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __JOBID_ISSET_ID = 0;
  private static final int __SCHEDULERID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.NAME,_Fields.JOB_NAME,_Fields.STATE,_Fields.NEXT_FIRE_TIME,_Fields.PREVIOUS_FIRE_TIME};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.JOB_ID, new org.apache.thrift.meta_data.FieldMetaData("jobId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SCHEDULER_ID, new org.apache.thrift.meta_data.FieldMetaData("schedulerId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.JOB_NAME, new org.apache.thrift.meta_data.FieldMetaData("jobName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("state", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NEXT_FIRE_TIME, new org.apache.thrift.meta_data.FieldMetaData("nextFireTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PREVIOUS_FIRE_TIME, new org.apache.thrift.meta_data.FieldMetaData("previousFireTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TriggerBean.class, metaDataMap);
  }

  public TriggerBean() {
  }

  public TriggerBean(
    int jobId,
    int schedulerId)
  {
    this();
    this.jobId = jobId;
    setJobIdIsSet(true);
    this.schedulerId = schedulerId;
    setSchedulerIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TriggerBean(TriggerBean other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.jobId = other.jobId;
    this.schedulerId = other.schedulerId;
    if (other.isSetJobName()) {
      this.jobName = other.jobName;
    }
    if (other.isSetState()) {
      this.state = other.state;
    }
    if (other.isSetNextFireTime()) {
      this.nextFireTime = other.nextFireTime;
    }
    if (other.isSetPreviousFireTime()) {
      this.previousFireTime = other.previousFireTime;
    }
  }

  public TriggerBean deepCopy() {
    return new TriggerBean(this);
  }

  @Override
  public void clear() {
    this.name = null;
    setJobIdIsSet(false);
    this.jobId = 0;
    setSchedulerIdIsSet(false);
    this.schedulerId = 0;
    this.jobName = null;
    this.state = null;
    this.nextFireTime = null;
    this.previousFireTime = null;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public int getJobId() {
    return this.jobId;
  }

  public void setJobId(int jobId) {
    this.jobId = jobId;
    setJobIdIsSet(true);
  }

  public void unsetJobId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __JOBID_ISSET_ID);
  }

  /** Returns true if field jobId is set (has been assigned a value) and false otherwise */
  public boolean isSetJobId() {
    return EncodingUtils.testBit(__isset_bitfield, __JOBID_ISSET_ID);
  }

  public void setJobIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __JOBID_ISSET_ID, value);
  }

  public int getSchedulerId() {
    return this.schedulerId;
  }

  public void setSchedulerId(int schedulerId) {
    this.schedulerId = schedulerId;
    setSchedulerIdIsSet(true);
  }

  public void unsetSchedulerId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SCHEDULERID_ISSET_ID);
  }

  /** Returns true if field schedulerId is set (has been assigned a value) and false otherwise */
  public boolean isSetSchedulerId() {
    return EncodingUtils.testBit(__isset_bitfield, __SCHEDULERID_ISSET_ID);
  }

  public void setSchedulerIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SCHEDULERID_ISSET_ID, value);
  }

  public String getJobName() {
    return this.jobName;
  }

  public void setJobName(String jobName) {
    this.jobName = jobName;
  }

  public void unsetJobName() {
    this.jobName = null;
  }

  /** Returns true if field jobName is set (has been assigned a value) and false otherwise */
  public boolean isSetJobName() {
    return this.jobName != null;
  }

  public void setJobNameIsSet(boolean value) {
    if (!value) {
      this.jobName = null;
    }
  }

  public String getState() {
    return this.state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public void unsetState() {
    this.state = null;
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return this.state != null;
  }

  public void setStateIsSet(boolean value) {
    if (!value) {
      this.state = null;
    }
  }

  public String getNextFireTime() {
    return this.nextFireTime;
  }

  public void setNextFireTime(String nextFireTime) {
    this.nextFireTime = nextFireTime;
  }

  public void unsetNextFireTime() {
    this.nextFireTime = null;
  }

  /** Returns true if field nextFireTime is set (has been assigned a value) and false otherwise */
  public boolean isSetNextFireTime() {
    return this.nextFireTime != null;
  }

  public void setNextFireTimeIsSet(boolean value) {
    if (!value) {
      this.nextFireTime = null;
    }
  }

  public String getPreviousFireTime() {
    return this.previousFireTime;
  }

  public void setPreviousFireTime(String previousFireTime) {
    this.previousFireTime = previousFireTime;
  }

  public void unsetPreviousFireTime() {
    this.previousFireTime = null;
  }

  /** Returns true if field previousFireTime is set (has been assigned a value) and false otherwise */
  public boolean isSetPreviousFireTime() {
    return this.previousFireTime != null;
  }

  public void setPreviousFireTimeIsSet(boolean value) {
    if (!value) {
      this.previousFireTime = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case JOB_ID:
      if (value == null) {
        unsetJobId();
      } else {
        setJobId((Integer)value);
      }
      break;

    case SCHEDULER_ID:
      if (value == null) {
        unsetSchedulerId();
      } else {
        setSchedulerId((Integer)value);
      }
      break;

    case JOB_NAME:
      if (value == null) {
        unsetJobName();
      } else {
        setJobName((String)value);
      }
      break;

    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((String)value);
      }
      break;

    case NEXT_FIRE_TIME:
      if (value == null) {
        unsetNextFireTime();
      } else {
        setNextFireTime((String)value);
      }
      break;

    case PREVIOUS_FIRE_TIME:
      if (value == null) {
        unsetPreviousFireTime();
      } else {
        setPreviousFireTime((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case JOB_ID:
      return Integer.valueOf(getJobId());

    case SCHEDULER_ID:
      return Integer.valueOf(getSchedulerId());

    case JOB_NAME:
      return getJobName();

    case STATE:
      return getState();

    case NEXT_FIRE_TIME:
      return getNextFireTime();

    case PREVIOUS_FIRE_TIME:
      return getPreviousFireTime();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case JOB_ID:
      return isSetJobId();
    case SCHEDULER_ID:
      return isSetSchedulerId();
    case JOB_NAME:
      return isSetJobName();
    case STATE:
      return isSetState();
    case NEXT_FIRE_TIME:
      return isSetNextFireTime();
    case PREVIOUS_FIRE_TIME:
      return isSetPreviousFireTime();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TriggerBean)
      return this.equals((TriggerBean)that);
    return false;
  }

  public boolean equals(TriggerBean that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_jobId = true;
    boolean that_present_jobId = true;
    if (this_present_jobId || that_present_jobId) {
      if (!(this_present_jobId && that_present_jobId))
        return false;
      if (this.jobId != that.jobId)
        return false;
    }

    boolean this_present_schedulerId = true;
    boolean that_present_schedulerId = true;
    if (this_present_schedulerId || that_present_schedulerId) {
      if (!(this_present_schedulerId && that_present_schedulerId))
        return false;
      if (this.schedulerId != that.schedulerId)
        return false;
    }

    boolean this_present_jobName = true && this.isSetJobName();
    boolean that_present_jobName = true && that.isSetJobName();
    if (this_present_jobName || that_present_jobName) {
      if (!(this_present_jobName && that_present_jobName))
        return false;
      if (!this.jobName.equals(that.jobName))
        return false;
    }

    boolean this_present_state = true && this.isSetState();
    boolean that_present_state = true && that.isSetState();
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (!this.state.equals(that.state))
        return false;
    }

    boolean this_present_nextFireTime = true && this.isSetNextFireTime();
    boolean that_present_nextFireTime = true && that.isSetNextFireTime();
    if (this_present_nextFireTime || that_present_nextFireTime) {
      if (!(this_present_nextFireTime && that_present_nextFireTime))
        return false;
      if (!this.nextFireTime.equals(that.nextFireTime))
        return false;
    }

    boolean this_present_previousFireTime = true && this.isSetPreviousFireTime();
    boolean that_present_previousFireTime = true && that.isSetPreviousFireTime();
    if (this_present_previousFireTime || that_present_previousFireTime) {
      if (!(this_present_previousFireTime && that_present_previousFireTime))
        return false;
      if (!this.previousFireTime.equals(that.previousFireTime))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_name = true && (isSetName());
    builder.append(present_name);
    if (present_name)
      builder.append(name);

    boolean present_jobId = true;
    builder.append(present_jobId);
    if (present_jobId)
      builder.append(jobId);

    boolean present_schedulerId = true;
    builder.append(present_schedulerId);
    if (present_schedulerId)
      builder.append(schedulerId);

    boolean present_jobName = true && (isSetJobName());
    builder.append(present_jobName);
    if (present_jobName)
      builder.append(jobName);

    boolean present_state = true && (isSetState());
    builder.append(present_state);
    if (present_state)
      builder.append(state);

    boolean present_nextFireTime = true && (isSetNextFireTime());
    builder.append(present_nextFireTime);
    if (present_nextFireTime)
      builder.append(nextFireTime);

    boolean present_previousFireTime = true && (isSetPreviousFireTime());
    builder.append(present_previousFireTime);
    if (present_previousFireTime)
      builder.append(previousFireTime);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(TriggerBean other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJobId()).compareTo(other.isSetJobId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobId, other.jobId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSchedulerId()).compareTo(other.isSetSchedulerId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSchedulerId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.schedulerId, other.schedulerId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJobName()).compareTo(other.isSetJobName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobName, other.jobName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetState()).compareTo(other.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state, other.state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNextFireTime()).compareTo(other.isSetNextFireTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNextFireTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nextFireTime, other.nextFireTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPreviousFireTime()).compareTo(other.isSetPreviousFireTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPreviousFireTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.previousFireTime, other.previousFireTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TriggerBean(");
    boolean first = true;

    if (isSetName()) {
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("jobId:");
    sb.append(this.jobId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("schedulerId:");
    sb.append(this.schedulerId);
    first = false;
    if (isSetJobName()) {
      if (!first) sb.append(", ");
      sb.append("jobName:");
      if (this.jobName == null) {
        sb.append("null");
      } else {
        sb.append(this.jobName);
      }
      first = false;
    }
    if (isSetState()) {
      if (!first) sb.append(", ");
      sb.append("state:");
      if (this.state == null) {
        sb.append("null");
      } else {
        sb.append(this.state);
      }
      first = false;
    }
    if (isSetNextFireTime()) {
      if (!first) sb.append(", ");
      sb.append("nextFireTime:");
      if (this.nextFireTime == null) {
        sb.append("null");
      } else {
        sb.append(this.nextFireTime);
      }
      first = false;
    }
    if (isSetPreviousFireTime()) {
      if (!first) sb.append(", ");
      sb.append("previousFireTime:");
      if (this.previousFireTime == null) {
        sb.append("null");
      } else {
        sb.append(this.previousFireTime);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetJobId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'jobId' is unset! Struct:" + toString());
    }

    if (!isSetSchedulerId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'schedulerId' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TriggerBeanStandardSchemeFactory implements SchemeFactory {
    public TriggerBeanStandardScheme getScheme() {
      return new TriggerBeanStandardScheme();
    }
  }

  private static class TriggerBeanStandardScheme extends StandardScheme<TriggerBean> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TriggerBean struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case -1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case -2: // JOB_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.jobId = iprot.readI32();
              struct.setJobIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case -3: // SCHEDULER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.schedulerId = iprot.readI32();
              struct.setSchedulerIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case -4: // JOB_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.jobName = iprot.readString();
              struct.setJobNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case -5: // STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.state = iprot.readString();
              struct.setStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case -6: // NEXT_FIRE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.nextFireTime = iprot.readString();
              struct.setNextFireTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case -7: // PREVIOUS_FIRE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.previousFireTime = iprot.readString();
              struct.setPreviousFireTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TriggerBean struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.previousFireTime != null) {
        if (struct.isSetPreviousFireTime()) {
          oprot.writeFieldBegin(PREVIOUS_FIRE_TIME_FIELD_DESC);
          oprot.writeString(struct.previousFireTime);
          oprot.writeFieldEnd();
        }
      }
      if (struct.nextFireTime != null) {
        if (struct.isSetNextFireTime()) {
          oprot.writeFieldBegin(NEXT_FIRE_TIME_FIELD_DESC);
          oprot.writeString(struct.nextFireTime);
          oprot.writeFieldEnd();
        }
      }
      if (struct.state != null) {
        if (struct.isSetState()) {
          oprot.writeFieldBegin(STATE_FIELD_DESC);
          oprot.writeString(struct.state);
          oprot.writeFieldEnd();
        }
      }
      if (struct.jobName != null) {
        if (struct.isSetJobName()) {
          oprot.writeFieldBegin(JOB_NAME_FIELD_DESC);
          oprot.writeString(struct.jobName);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(SCHEDULER_ID_FIELD_DESC);
      oprot.writeI32(struct.schedulerId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(JOB_ID_FIELD_DESC);
      oprot.writeI32(struct.jobId);
      oprot.writeFieldEnd();
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TriggerBeanTupleSchemeFactory implements SchemeFactory {
    public TriggerBeanTupleScheme getScheme() {
      return new TriggerBeanTupleScheme();
    }
  }

  private static class TriggerBeanTupleScheme extends TupleScheme<TriggerBean> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TriggerBean struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.jobId);
      oprot.writeI32(struct.schedulerId);
      BitSet optionals = new BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetJobName()) {
        optionals.set(1);
      }
      if (struct.isSetState()) {
        optionals.set(2);
      }
      if (struct.isSetNextFireTime()) {
        optionals.set(3);
      }
      if (struct.isSetPreviousFireTime()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetJobName()) {
        oprot.writeString(struct.jobName);
      }
      if (struct.isSetState()) {
        oprot.writeString(struct.state);
      }
      if (struct.isSetNextFireTime()) {
        oprot.writeString(struct.nextFireTime);
      }
      if (struct.isSetPreviousFireTime()) {
        oprot.writeString(struct.previousFireTime);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TriggerBean struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.jobId = iprot.readI32();
      struct.setJobIdIsSet(true);
      struct.schedulerId = iprot.readI32();
      struct.setSchedulerIdIsSet(true);
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.jobName = iprot.readString();
        struct.setJobNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.state = iprot.readString();
        struct.setStateIsSet(true);
      }
      if (incoming.get(3)) {
        struct.nextFireTime = iprot.readString();
        struct.setNextFireTimeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.previousFireTime = iprot.readString();
        struct.setPreviousFireTimeIsSet(true);
      }
    }
  }

}

