/**
 * Parm_List.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tibco.www.schemas.Utility1.NEDPerson.Schemas.Schema_xsd;

public class Parm_List  implements java.io.Serializable {
    private java.lang.String IC_or_SAC;

    private com.tibco.www.schemas.Utility1.NEDPerson.Schemas.Schema_xsd.OrganizationalStat organizationalStat;

    private java.lang.Boolean returnNIHIDOnly;

    public Parm_List() {
    }

    public Parm_List(
           java.lang.String IC_or_SAC,
           com.tibco.www.schemas.Utility1.NEDPerson.Schemas.Schema_xsd.OrganizationalStat organizationalStat,
           java.lang.Boolean returnNIHIDOnly) {
           this.IC_or_SAC = IC_or_SAC;
           this.organizationalStat = organizationalStat;
           this.returnNIHIDOnly = returnNIHIDOnly;
    }


    /**
     * Gets the IC_or_SAC value for this Parm_List.
     * 
     * @return IC_or_SAC
     */
    public java.lang.String getIC_or_SAC() {
        return IC_or_SAC;
    }


    /**
     * Sets the IC_or_SAC value for this Parm_List.
     * 
     * @param IC_or_SAC
     */
    public void setIC_or_SAC(java.lang.String IC_or_SAC) {
        this.IC_or_SAC = IC_or_SAC;
    }


    /**
     * Gets the organizationalStat value for this Parm_List.
     * 
     * @return organizationalStat
     */
    public com.tibco.www.schemas.Utility1.NEDPerson.Schemas.Schema_xsd.OrganizationalStat getOrganizationalStat() {
        return organizationalStat;
    }


    /**
     * Sets the organizationalStat value for this Parm_List.
     * 
     * @param organizationalStat
     */
    public void setOrganizationalStat(com.tibco.www.schemas.Utility1.NEDPerson.Schemas.Schema_xsd.OrganizationalStat organizationalStat) {
        this.organizationalStat = organizationalStat;
    }


    /**
     * Gets the returnNIHIDOnly value for this Parm_List.
     * 
     * @return returnNIHIDOnly
     */
    public java.lang.Boolean getReturnNIHIDOnly() {
        return returnNIHIDOnly;
    }


    /**
     * Sets the returnNIHIDOnly value for this Parm_List.
     * 
     * @param returnNIHIDOnly
     */
    public void setReturnNIHIDOnly(java.lang.Boolean returnNIHIDOnly) {
        this.returnNIHIDOnly = returnNIHIDOnly;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Parm_List)) return false;
        Parm_List other = (Parm_List) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IC_or_SAC==null && other.getIC_or_SAC()==null) || 
             (this.IC_or_SAC!=null &&
              this.IC_or_SAC.equals(other.getIC_or_SAC()))) &&
            ((this.organizationalStat==null && other.getOrganizationalStat()==null) || 
             (this.organizationalStat!=null &&
              this.organizationalStat.equals(other.getOrganizationalStat()))) &&
            ((this.returnNIHIDOnly==null && other.getReturnNIHIDOnly()==null) || 
             (this.returnNIHIDOnly!=null &&
              this.returnNIHIDOnly.equals(other.getReturnNIHIDOnly())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIC_or_SAC() != null) {
            _hashCode += getIC_or_SAC().hashCode();
        }
        if (getOrganizationalStat() != null) {
            _hashCode += getOrganizationalStat().hashCode();
        }
        if (getReturnNIHIDOnly() != null) {
            _hashCode += getReturnNIHIDOnly().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Parm_List.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.tibco.com/schemas/Utility1/NEDPerson/Schemas/Schema.xsd", ">Parm_List"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IC_or_SAC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/Utility1/NEDPerson/Schemas/Schema.xsd", "IC_or_SAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationalStat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/Utility1/NEDPerson/Schemas/Schema.xsd", "OrganizationalStat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.tibco.com/schemas/Utility1/NEDPerson/Schemas/Schema.xsd", ">OrganizationalStat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnNIHIDOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tibco.com/schemas/Utility1/NEDPerson/Schemas/Schema.xsd", "ReturnNIHIDOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
