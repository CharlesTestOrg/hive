/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.ql.plan.api;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
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
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Operator implements org.apache.thrift.TBase<Operator, Operator._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Operator");

  private static final org.apache.thrift.protocol.TField OPERATOR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("operatorId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField OPERATOR_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("operatorType", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField OPERATOR_ATTRIBUTES_FIELD_DESC = new org.apache.thrift.protocol.TField("operatorAttributes", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField OPERATOR_COUNTERS_FIELD_DESC = new org.apache.thrift.protocol.TField("operatorCounters", org.apache.thrift.protocol.TType.MAP, (short)4);
  private static final org.apache.thrift.protocol.TField DONE_FIELD_DESC = new org.apache.thrift.protocol.TField("done", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField STARTED_FIELD_DESC = new org.apache.thrift.protocol.TField("started", org.apache.thrift.protocol.TType.BOOL, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new OperatorStandardSchemeFactory());
    schemes.put(TupleScheme.class, new OperatorTupleSchemeFactory());
  }

  private String operatorId; // required
  private OperatorType operatorType; // required
  private Map<String,String> operatorAttributes; // required
  private Map<String,Long> operatorCounters; // required
  private boolean done; // required
  private boolean started; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OPERATOR_ID((short)1, "operatorId"),
    /**
     * 
     * @see OperatorType
     */
    OPERATOR_TYPE((short)2, "operatorType"),
    OPERATOR_ATTRIBUTES((short)3, "operatorAttributes"),
    OPERATOR_COUNTERS((short)4, "operatorCounters"),
    DONE((short)5, "done"),
    STARTED((short)6, "started");

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
        case 1: // OPERATOR_ID
          return OPERATOR_ID;
        case 2: // OPERATOR_TYPE
          return OPERATOR_TYPE;
        case 3: // OPERATOR_ATTRIBUTES
          return OPERATOR_ATTRIBUTES;
        case 4: // OPERATOR_COUNTERS
          return OPERATOR_COUNTERS;
        case 5: // DONE
          return DONE;
        case 6: // STARTED
          return STARTED;
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
  private static final int __DONE_ISSET_ID = 0;
  private static final int __STARTED_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OPERATOR_ID, new org.apache.thrift.meta_data.FieldMetaData("operatorId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OPERATOR_TYPE, new org.apache.thrift.meta_data.FieldMetaData("operatorType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, OperatorType.class)));
    tmpMap.put(_Fields.OPERATOR_ATTRIBUTES, new org.apache.thrift.meta_data.FieldMetaData("operatorAttributes", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.OPERATOR_COUNTERS, new org.apache.thrift.meta_data.FieldMetaData("operatorCounters", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.DONE, new org.apache.thrift.meta_data.FieldMetaData("done", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.STARTED, new org.apache.thrift.meta_data.FieldMetaData("started", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Operator.class, metaDataMap);
  }

  public Operator() {
  }

  public Operator(
    String operatorId,
    OperatorType operatorType,
    Map<String,String> operatorAttributes,
    Map<String,Long> operatorCounters,
    boolean done,
    boolean started)
  {
    this();
    this.operatorId = operatorId;
    this.operatorType = operatorType;
    this.operatorAttributes = operatorAttributes;
    this.operatorCounters = operatorCounters;
    this.done = done;
    setDoneIsSet(true);
    this.started = started;
    setStartedIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Operator(Operator other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetOperatorId()) {
      this.operatorId = other.operatorId;
    }
    if (other.isSetOperatorType()) {
      this.operatorType = other.operatorType;
    }
    if (other.isSetOperatorAttributes()) {
      Map<String,String> __this__operatorAttributes = new HashMap<String,String>();
      for (Map.Entry<String, String> other_element : other.operatorAttributes.entrySet()) {

        String other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        String __this__operatorAttributes_copy_key = other_element_key;

        String __this__operatorAttributes_copy_value = other_element_value;

        __this__operatorAttributes.put(__this__operatorAttributes_copy_key, __this__operatorAttributes_copy_value);
      }
      this.operatorAttributes = __this__operatorAttributes;
    }
    if (other.isSetOperatorCounters()) {
      Map<String,Long> __this__operatorCounters = new HashMap<String,Long>();
      for (Map.Entry<String, Long> other_element : other.operatorCounters.entrySet()) {

        String other_element_key = other_element.getKey();
        Long other_element_value = other_element.getValue();

        String __this__operatorCounters_copy_key = other_element_key;

        Long __this__operatorCounters_copy_value = other_element_value;

        __this__operatorCounters.put(__this__operatorCounters_copy_key, __this__operatorCounters_copy_value);
      }
      this.operatorCounters = __this__operatorCounters;
    }
    this.done = other.done;
    this.started = other.started;
  }

  public Operator deepCopy() {
    return new Operator(this);
  }

  @Override
  public void clear() {
    this.operatorId = null;
    this.operatorType = null;
    this.operatorAttributes = null;
    this.operatorCounters = null;
    setDoneIsSet(false);
    this.done = false;
    setStartedIsSet(false);
    this.started = false;
  }

  public String getOperatorId() {
    return this.operatorId;
  }

  public void setOperatorId(String operatorId) {
    this.operatorId = operatorId;
  }

  public void unsetOperatorId() {
    this.operatorId = null;
  }

  /** Returns true if field operatorId is set (has been assigned a value) and false otherwise */
  public boolean isSetOperatorId() {
    return this.operatorId != null;
  }

  public void setOperatorIdIsSet(boolean value) {
    if (!value) {
      this.operatorId = null;
    }
  }

  /**
   * 
   * @see OperatorType
   */
  public OperatorType getOperatorType() {
    return this.operatorType;
  }

  /**
   * 
   * @see OperatorType
   */
  public void setOperatorType(OperatorType operatorType) {
    this.operatorType = operatorType;
  }

  public void unsetOperatorType() {
    this.operatorType = null;
  }

  /** Returns true if field operatorType is set (has been assigned a value) and false otherwise */
  public boolean isSetOperatorType() {
    return this.operatorType != null;
  }

  public void setOperatorTypeIsSet(boolean value) {
    if (!value) {
      this.operatorType = null;
    }
  }

  public int getOperatorAttributesSize() {
    return (this.operatorAttributes == null) ? 0 : this.operatorAttributes.size();
  }

  public void putToOperatorAttributes(String key, String val) {
    if (this.operatorAttributes == null) {
      this.operatorAttributes = new HashMap<String,String>();
    }
    this.operatorAttributes.put(key, val);
  }

  public Map<String,String> getOperatorAttributes() {
    return this.operatorAttributes;
  }

  public void setOperatorAttributes(Map<String,String> operatorAttributes) {
    this.operatorAttributes = operatorAttributes;
  }

  public void unsetOperatorAttributes() {
    this.operatorAttributes = null;
  }

  /** Returns true if field operatorAttributes is set (has been assigned a value) and false otherwise */
  public boolean isSetOperatorAttributes() {
    return this.operatorAttributes != null;
  }

  public void setOperatorAttributesIsSet(boolean value) {
    if (!value) {
      this.operatorAttributes = null;
    }
  }

  public int getOperatorCountersSize() {
    return (this.operatorCounters == null) ? 0 : this.operatorCounters.size();
  }

  public void putToOperatorCounters(String key, long val) {
    if (this.operatorCounters == null) {
      this.operatorCounters = new HashMap<String,Long>();
    }
    this.operatorCounters.put(key, val);
  }

  public Map<String,Long> getOperatorCounters() {
    return this.operatorCounters;
  }

  public void setOperatorCounters(Map<String,Long> operatorCounters) {
    this.operatorCounters = operatorCounters;
  }

  public void unsetOperatorCounters() {
    this.operatorCounters = null;
  }

  /** Returns true if field operatorCounters is set (has been assigned a value) and false otherwise */
  public boolean isSetOperatorCounters() {
    return this.operatorCounters != null;
  }

  public void setOperatorCountersIsSet(boolean value) {
    if (!value) {
      this.operatorCounters = null;
    }
  }

  public boolean isDone() {
    return this.done;
  }

  public void setDone(boolean done) {
    this.done = done;
    setDoneIsSet(true);
  }

  public void unsetDone() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DONE_ISSET_ID);
  }

  /** Returns true if field done is set (has been assigned a value) and false otherwise */
  public boolean isSetDone() {
    return EncodingUtils.testBit(__isset_bitfield, __DONE_ISSET_ID);
  }

  public void setDoneIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DONE_ISSET_ID, value);
  }

  public boolean isStarted() {
    return this.started;
  }

  public void setStarted(boolean started) {
    this.started = started;
    setStartedIsSet(true);
  }

  public void unsetStarted() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STARTED_ISSET_ID);
  }

  /** Returns true if field started is set (has been assigned a value) and false otherwise */
  public boolean isSetStarted() {
    return EncodingUtils.testBit(__isset_bitfield, __STARTED_ISSET_ID);
  }

  public void setStartedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STARTED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OPERATOR_ID:
      if (value == null) {
        unsetOperatorId();
      } else {
        setOperatorId((String)value);
      }
      break;

    case OPERATOR_TYPE:
      if (value == null) {
        unsetOperatorType();
      } else {
        setOperatorType((OperatorType)value);
      }
      break;

    case OPERATOR_ATTRIBUTES:
      if (value == null) {
        unsetOperatorAttributes();
      } else {
        setOperatorAttributes((Map<String,String>)value);
      }
      break;

    case OPERATOR_COUNTERS:
      if (value == null) {
        unsetOperatorCounters();
      } else {
        setOperatorCounters((Map<String,Long>)value);
      }
      break;

    case DONE:
      if (value == null) {
        unsetDone();
      } else {
        setDone((Boolean)value);
      }
      break;

    case STARTED:
      if (value == null) {
        unsetStarted();
      } else {
        setStarted((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OPERATOR_ID:
      return getOperatorId();

    case OPERATOR_TYPE:
      return getOperatorType();

    case OPERATOR_ATTRIBUTES:
      return getOperatorAttributes();

    case OPERATOR_COUNTERS:
      return getOperatorCounters();

    case DONE:
      return Boolean.valueOf(isDone());

    case STARTED:
      return Boolean.valueOf(isStarted());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OPERATOR_ID:
      return isSetOperatorId();
    case OPERATOR_TYPE:
      return isSetOperatorType();
    case OPERATOR_ATTRIBUTES:
      return isSetOperatorAttributes();
    case OPERATOR_COUNTERS:
      return isSetOperatorCounters();
    case DONE:
      return isSetDone();
    case STARTED:
      return isSetStarted();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Operator)
      return this.equals((Operator)that);
    return false;
  }

  public boolean equals(Operator that) {
    if (that == null)
      return false;

    boolean this_present_operatorId = true && this.isSetOperatorId();
    boolean that_present_operatorId = true && that.isSetOperatorId();
    if (this_present_operatorId || that_present_operatorId) {
      if (!(this_present_operatorId && that_present_operatorId))
        return false;
      if (!this.operatorId.equals(that.operatorId))
        return false;
    }

    boolean this_present_operatorType = true && this.isSetOperatorType();
    boolean that_present_operatorType = true && that.isSetOperatorType();
    if (this_present_operatorType || that_present_operatorType) {
      if (!(this_present_operatorType && that_present_operatorType))
        return false;
      if (!this.operatorType.equals(that.operatorType))
        return false;
    }

    boolean this_present_operatorAttributes = true && this.isSetOperatorAttributes();
    boolean that_present_operatorAttributes = true && that.isSetOperatorAttributes();
    if (this_present_operatorAttributes || that_present_operatorAttributes) {
      if (!(this_present_operatorAttributes && that_present_operatorAttributes))
        return false;
      if (!this.operatorAttributes.equals(that.operatorAttributes))
        return false;
    }

    boolean this_present_operatorCounters = true && this.isSetOperatorCounters();
    boolean that_present_operatorCounters = true && that.isSetOperatorCounters();
    if (this_present_operatorCounters || that_present_operatorCounters) {
      if (!(this_present_operatorCounters && that_present_operatorCounters))
        return false;
      if (!this.operatorCounters.equals(that.operatorCounters))
        return false;
    }

    boolean this_present_done = true;
    boolean that_present_done = true;
    if (this_present_done || that_present_done) {
      if (!(this_present_done && that_present_done))
        return false;
      if (this.done != that.done)
        return false;
    }

    boolean this_present_started = true;
    boolean that_present_started = true;
    if (this_present_started || that_present_started) {
      if (!(this_present_started && that_present_started))
        return false;
      if (this.started != that.started)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_operatorId = true && (isSetOperatorId());
    builder.append(present_operatorId);
    if (present_operatorId)
      builder.append(operatorId);

    boolean present_operatorType = true && (isSetOperatorType());
    builder.append(present_operatorType);
    if (present_operatorType)
      builder.append(operatorType.getValue());

    boolean present_operatorAttributes = true && (isSetOperatorAttributes());
    builder.append(present_operatorAttributes);
    if (present_operatorAttributes)
      builder.append(operatorAttributes);

    boolean present_operatorCounters = true && (isSetOperatorCounters());
    builder.append(present_operatorCounters);
    if (present_operatorCounters)
      builder.append(operatorCounters);

    boolean present_done = true;
    builder.append(present_done);
    if (present_done)
      builder.append(done);

    boolean present_started = true;
    builder.append(present_started);
    if (present_started)
      builder.append(started);

    return builder.toHashCode();
  }

  public int compareTo(Operator other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Operator typedOther = (Operator)other;

    lastComparison = Boolean.valueOf(isSetOperatorId()).compareTo(typedOther.isSetOperatorId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperatorId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operatorId, typedOther.operatorId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOperatorType()).compareTo(typedOther.isSetOperatorType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperatorType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operatorType, typedOther.operatorType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOperatorAttributes()).compareTo(typedOther.isSetOperatorAttributes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperatorAttributes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operatorAttributes, typedOther.operatorAttributes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOperatorCounters()).compareTo(typedOther.isSetOperatorCounters());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperatorCounters()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operatorCounters, typedOther.operatorCounters);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDone()).compareTo(typedOther.isSetDone());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDone()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.done, typedOther.done);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStarted()).compareTo(typedOther.isSetStarted());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStarted()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.started, typedOther.started);
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
    StringBuilder sb = new StringBuilder("Operator(");
    boolean first = true;

    sb.append("operatorId:");
    if (this.operatorId == null) {
      sb.append("null");
    } else {
      sb.append(this.operatorId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("operatorType:");
    if (this.operatorType == null) {
      sb.append("null");
    } else {
      sb.append(this.operatorType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("operatorAttributes:");
    if (this.operatorAttributes == null) {
      sb.append("null");
    } else {
      sb.append(this.operatorAttributes);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("operatorCounters:");
    if (this.operatorCounters == null) {
      sb.append("null");
    } else {
      sb.append(this.operatorCounters);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("done:");
    sb.append(this.done);
    first = false;
    if (!first) sb.append(", ");
    sb.append("started:");
    sb.append(this.started);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class OperatorStandardSchemeFactory implements SchemeFactory {
    public OperatorStandardScheme getScheme() {
      return new OperatorStandardScheme();
    }
  }

  private static class OperatorStandardScheme extends StandardScheme<Operator> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Operator struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OPERATOR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.operatorId = iprot.readString();
              struct.setOperatorIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OPERATOR_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.operatorType = OperatorType.findByValue(iprot.readI32());
              struct.setOperatorTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OPERATOR_ATTRIBUTES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map24 = iprot.readMapBegin();
                struct.operatorAttributes = new HashMap<String,String>(2*_map24.size);
                for (int _i25 = 0; _i25 < _map24.size; ++_i25)
                {
                  String _key26; // required
                  String _val27; // required
                  _key26 = iprot.readString();
                  _val27 = iprot.readString();
                  struct.operatorAttributes.put(_key26, _val27);
                }
                iprot.readMapEnd();
              }
              struct.setOperatorAttributesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // OPERATOR_COUNTERS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map28 = iprot.readMapBegin();
                struct.operatorCounters = new HashMap<String,Long>(2*_map28.size);
                for (int _i29 = 0; _i29 < _map28.size; ++_i29)
                {
                  String _key30; // required
                  long _val31; // required
                  _key30 = iprot.readString();
                  _val31 = iprot.readI64();
                  struct.operatorCounters.put(_key30, _val31);
                }
                iprot.readMapEnd();
              }
              struct.setOperatorCountersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DONE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.done = iprot.readBool();
              struct.setDoneIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // STARTED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.started = iprot.readBool();
              struct.setStartedIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Operator struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.operatorId != null) {
        oprot.writeFieldBegin(OPERATOR_ID_FIELD_DESC);
        oprot.writeString(struct.operatorId);
        oprot.writeFieldEnd();
      }
      if (struct.operatorType != null) {
        oprot.writeFieldBegin(OPERATOR_TYPE_FIELD_DESC);
        oprot.writeI32(struct.operatorType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.operatorAttributes != null) {
        oprot.writeFieldBegin(OPERATOR_ATTRIBUTES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.operatorAttributes.size()));
          for (Map.Entry<String, String> _iter32 : struct.operatorAttributes.entrySet())
          {
            oprot.writeString(_iter32.getKey());
            oprot.writeString(_iter32.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.operatorCounters != null) {
        oprot.writeFieldBegin(OPERATOR_COUNTERS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I64, struct.operatorCounters.size()));
          for (Map.Entry<String, Long> _iter33 : struct.operatorCounters.entrySet())
          {
            oprot.writeString(_iter33.getKey());
            oprot.writeI64(_iter33.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(DONE_FIELD_DESC);
      oprot.writeBool(struct.done);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(STARTED_FIELD_DESC);
      oprot.writeBool(struct.started);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class OperatorTupleSchemeFactory implements SchemeFactory {
    public OperatorTupleScheme getScheme() {
      return new OperatorTupleScheme();
    }
  }

  private static class OperatorTupleScheme extends TupleScheme<Operator> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Operator struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOperatorId()) {
        optionals.set(0);
      }
      if (struct.isSetOperatorType()) {
        optionals.set(1);
      }
      if (struct.isSetOperatorAttributes()) {
        optionals.set(2);
      }
      if (struct.isSetOperatorCounters()) {
        optionals.set(3);
      }
      if (struct.isSetDone()) {
        optionals.set(4);
      }
      if (struct.isSetStarted()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetOperatorId()) {
        oprot.writeString(struct.operatorId);
      }
      if (struct.isSetOperatorType()) {
        oprot.writeI32(struct.operatorType.getValue());
      }
      if (struct.isSetOperatorAttributes()) {
        {
          oprot.writeI32(struct.operatorAttributes.size());
          for (Map.Entry<String, String> _iter34 : struct.operatorAttributes.entrySet())
          {
            oprot.writeString(_iter34.getKey());
            oprot.writeString(_iter34.getValue());
          }
        }
      }
      if (struct.isSetOperatorCounters()) {
        {
          oprot.writeI32(struct.operatorCounters.size());
          for (Map.Entry<String, Long> _iter35 : struct.operatorCounters.entrySet())
          {
            oprot.writeString(_iter35.getKey());
            oprot.writeI64(_iter35.getValue());
          }
        }
      }
      if (struct.isSetDone()) {
        oprot.writeBool(struct.done);
      }
      if (struct.isSetStarted()) {
        oprot.writeBool(struct.started);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Operator struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.operatorId = iprot.readString();
        struct.setOperatorIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.operatorType = OperatorType.findByValue(iprot.readI32());
        struct.setOperatorTypeIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map36 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.operatorAttributes = new HashMap<String,String>(2*_map36.size);
          for (int _i37 = 0; _i37 < _map36.size; ++_i37)
          {
            String _key38; // required
            String _val39; // required
            _key38 = iprot.readString();
            _val39 = iprot.readString();
            struct.operatorAttributes.put(_key38, _val39);
          }
        }
        struct.setOperatorAttributesIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TMap _map40 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.operatorCounters = new HashMap<String,Long>(2*_map40.size);
          for (int _i41 = 0; _i41 < _map40.size; ++_i41)
          {
            String _key42; // required
            long _val43; // required
            _key42 = iprot.readString();
            _val43 = iprot.readI64();
            struct.operatorCounters.put(_key42, _val43);
          }
        }
        struct.setOperatorCountersIsSet(true);
      }
      if (incoming.get(4)) {
        struct.done = iprot.readBool();
        struct.setDoneIsSet(true);
      }
      if (incoming.get(5)) {
        struct.started = iprot.readBool();
        struct.setStartedIsSet(true);
      }
    }
  }

}

