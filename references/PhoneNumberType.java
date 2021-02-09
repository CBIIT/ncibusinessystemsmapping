/**
 * PhoneNumberType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.www.NEDPersonV3;

public class PhoneNumberType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PhoneNumberType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Mobile = "Mobile";
    public static final java.lang.String _Office = "Office";
    public static final java.lang.String _Fax = "Fax";
    public static final java.lang.String _Pager = "Pager";
    public static final java.lang.String _TTY = "TTY";
    public static final java.lang.String _HomeFax = "HomeFax";
    public static final java.lang.String _Home = "Home";
    public static final java.lang.String _PersonalMobile = "PersonalMobile";
    public static final java.lang.String _Company = "Company";
    public static final PhoneNumberType Mobile = new PhoneNumberType(_Mobile);
    public static final PhoneNumberType Office = new PhoneNumberType(_Office);
    public static final PhoneNumberType Fax = new PhoneNumberType(_Fax);
    public static final PhoneNumberType Pager = new PhoneNumberType(_Pager);
    public static final PhoneNumberType TTY = new PhoneNumberType(_TTY);
    public static final PhoneNumberType HomeFax = new PhoneNumberType(_HomeFax);
    public static final PhoneNumberType Home = new PhoneNumberType(_Home);
    public static final PhoneNumberType PersonalMobile = new PhoneNumberType(_PersonalMobile);
    public static final PhoneNumberType Company = new PhoneNumberType(_Company);
    public java.lang.String getValue() { return _value_;}
    public static PhoneNumberType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PhoneNumberType enumeration = (PhoneNumberType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PhoneNumberType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PhoneNumberType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">PhoneNumberType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
