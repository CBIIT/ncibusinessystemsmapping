/**
 * EmailAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.www.NEDPersonV3;

public class EmailAddress  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;

    private gov.nih.www.NEDPersonV3.EmailAddressType emailAddressType;  // attribute

    public EmailAddress() {
    }

    // Simple Types must have a String constructor
    public EmailAddress(java.lang.String _value) {
        this._value = _value;
    }
    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the _value value for this EmailAddress.
     * 
     * @return _value
     */
    public java.lang.String get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this EmailAddress.
     * 
     * @param _value
     */
    public void set_value(java.lang.String _value) {
        this._value = _value;
    }


    /**
     * Gets the emailAddressType value for this EmailAddress.
     * 
     * @return emailAddressType
     */
    public gov.nih.www.NEDPersonV3.EmailAddressType getEmailAddressType() {
        return emailAddressType;
    }


    /**
     * Sets the emailAddressType value for this EmailAddress.
     * 
     * @param emailAddressType
     */
    public void setEmailAddressType(gov.nih.www.NEDPersonV3.EmailAddressType emailAddressType) {
        this.emailAddressType = emailAddressType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmailAddress)) return false;
        EmailAddress other = (EmailAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._value==null && other.get_value()==null) || 
             (this._value!=null &&
              this._value.equals(other.get_value()))) &&
            ((this.emailAddressType==null && other.getEmailAddressType()==null) || 
             (this.emailAddressType!=null &&
              this.emailAddressType.equals(other.getEmailAddressType())));
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
        if (get_value() != null) {
            _hashCode += get_value().hashCode();
        }
        if (getEmailAddressType() != null) {
            _hashCode += getEmailAddressType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmailAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">EmailAddress"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("emailAddressType");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "EmailAddressType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">EmailAddressType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
