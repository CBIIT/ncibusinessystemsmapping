/**
 * PersonRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.www.NEDPersonV3;

public class PersonRecord  implements java.io.Serializable {
    private java.lang.String numberOfRecords;

    private gov.nih.www.NEDPersonV3.NEDPerson NEDPerson;

    public PersonRecord() {
    }

    public PersonRecord(
           java.lang.String numberOfRecords,
           gov.nih.www.NEDPersonV3.NEDPerson NEDPerson) {
           this.numberOfRecords = numberOfRecords;
           this.NEDPerson = NEDPerson;
    }


    /**
     * Gets the numberOfRecords value for this PersonRecord.
     * 
     * @return numberOfRecords
     */
    public java.lang.String getNumberOfRecords() {
        return numberOfRecords;
    }


    /**
     * Sets the numberOfRecords value for this PersonRecord.
     * 
     * @param numberOfRecords
     */
    public void setNumberOfRecords(java.lang.String numberOfRecords) {
        this.numberOfRecords = numberOfRecords;
    }


    /**
     * Gets the NEDPerson value for this PersonRecord.
     * 
     * @return NEDPerson
     */
    public gov.nih.www.NEDPersonV3.NEDPerson getNEDPerson() {
        return NEDPerson;
    }


    /**
     * Sets the NEDPerson value for this PersonRecord.
     * 
     * @param NEDPerson
     */
    public void setNEDPerson(gov.nih.www.NEDPersonV3.NEDPerson NEDPerson) {
        this.NEDPerson = NEDPerson;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonRecord)) return false;
        PersonRecord other = (PersonRecord) obj;
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
            ((this.NEDPerson==null && other.getNEDPerson()==null) || 
             (this.NEDPerson!=null &&
              this.NEDPerson.equals(other.getNEDPerson())));
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
        if (getNEDPerson() != null) {
            _hashCode += getNEDPerson().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">PersonRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "NumberOfRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NEDPerson");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "NEDPerson"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">NEDPerson"));
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
