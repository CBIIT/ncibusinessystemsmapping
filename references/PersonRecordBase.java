/**
 * PersonRecordBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.www.NEDPersonV3;

public class PersonRecordBase  implements java.io.Serializable {
    private java.lang.String numberOfRecords;

    private gov.nih.www.NEDPersonV3.NEDPersonBase[] NEDPersonBase;

    public PersonRecordBase() {
    }

    public PersonRecordBase(
           java.lang.String numberOfRecords,
           gov.nih.www.NEDPersonV3.NEDPersonBase[] NEDPersonBase) {
           this.numberOfRecords = numberOfRecords;
           this.NEDPersonBase = NEDPersonBase;
    }


    /**
     * Gets the numberOfRecords value for this PersonRecordBase.
     * 
     * @return numberOfRecords
     */
    public java.lang.String getNumberOfRecords() {
        return numberOfRecords;
    }


    /**
     * Sets the numberOfRecords value for this PersonRecordBase.
     * 
     * @param numberOfRecords
     */
    public void setNumberOfRecords(java.lang.String numberOfRecords) {
        this.numberOfRecords = numberOfRecords;
    }


    /**
     * Gets the NEDPersonBase value for this PersonRecordBase.
     * 
     * @return NEDPersonBase
     */
    public gov.nih.www.NEDPersonV3.NEDPersonBase[] getNEDPersonBase() {
        return NEDPersonBase;
    }


    /**
     * Sets the NEDPersonBase value for this PersonRecordBase.
     * 
     * @param NEDPersonBase
     */
    public void setNEDPersonBase(gov.nih.www.NEDPersonV3.NEDPersonBase[] NEDPersonBase) {
        this.NEDPersonBase = NEDPersonBase;
    }

    public gov.nih.www.NEDPersonV3.NEDPersonBase getNEDPersonBase(int i) {
        return this.NEDPersonBase[i];
    }

    public void setNEDPersonBase(int i, gov.nih.www.NEDPersonV3.NEDPersonBase _value) {
        this.NEDPersonBase[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonRecordBase)) return false;
        PersonRecordBase other = (PersonRecordBase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numberOfRecords==null && other.getNumberOfRecords()==null) || 
             (this.numberOfRecords!=null &&
              this.numberOfRecords.equals(other.getNumberOfRecords()))) &&
            ((this.NEDPersonBase==null && other.getNEDPersonBase()==null) || 
             (this.NEDPersonBase!=null &&
              java.util.Arrays.equals(this.NEDPersonBase, other.getNEDPersonBase())));
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
        if (getNumberOfRecords() != null) {
            _hashCode += getNumberOfRecords().hashCode();
        }
        if (getNEDPersonBase() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNEDPersonBase());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNEDPersonBase(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonRecordBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">PersonRecordBase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "NumberOfRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NEDPersonBase");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "NEDPersonBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "NEDPersonBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
