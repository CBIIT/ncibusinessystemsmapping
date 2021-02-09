/**
 * OrganizationalStat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tibco.www.schemas.Utility1.NEDPerson.Schemas.Schema_xsd;

public class OrganizationalStat implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OrganizationalStat(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _All = "All";
    public static final java.lang.String _Employee = "Employee";
    public static final java.lang.String _Contractor = "Contractor";
    public static final java.lang.String _Tenant = "Tenant";
    public static final java.lang.String _Fellow = "Fellow";
    public static final java.lang.String _Guest = "Guest";
    public static final java.lang.String _Volunteer = "Volunteer";
    public static final OrganizationalStat All = new OrganizationalStat(_All);
    public static final OrganizationalStat Employee = new OrganizationalStat(_Employee);
    public static final OrganizationalStat Contractor = new OrganizationalStat(_Contractor);
    public static final OrganizationalStat Tenant = new OrganizationalStat(_Tenant);
    public static final OrganizationalStat Fellow = new OrganizationalStat(_Fellow);
    public static final OrganizationalStat Guest = new OrganizationalStat(_Guest);
    public static final OrganizationalStat Volunteer = new OrganizationalStat(_Volunteer);
    public java.lang.String getValue() { return _value_;}
    public static OrganizationalStat fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OrganizationalStat enumeration = (OrganizationalStat)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OrganizationalStat fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OrganizationalStat.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.tibco.com/schemas/Utility1/NEDPerson/Schemas/Schema.xsd", ">OrganizationalStat"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
