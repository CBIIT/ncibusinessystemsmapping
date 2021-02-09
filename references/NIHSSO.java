/**
 * NIHSSO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.www.NEDPersonV3;

public class NIHSSO  implements java.io.Serializable {
    private java.lang.String SSODomain;

    private java.lang.String SSOUsername;

    public NIHSSO() {
    }

    public NIHSSO(
           java.lang.String SSODomain,
           java.lang.String SSOUsername) {
           this.SSODomain = SSODomain;
           this.SSOUsername = SSOUsername;
    }


    /**
     * Gets the SSODomain value for this NIHSSO.
     * 
     * @return SSODomain
     */
    public java.lang.String getSSODomain() {
        return SSODomain;
    }


    /**
     * Sets the SSODomain value for this NIHSSO.
     * 
     * @param SSODomain
     */
    public void setSSODomain(java.lang.String SSODomain) {
        this.SSODomain = SSODomain;
    }


    /**
     * Gets the SSOUsername value for this NIHSSO.
     * 
     * @return SSOUsername
     */
    public java.lang.String getSSOUsername() {
        return SSOUsername;
    }


    /**
     * Sets the SSOUsername value for this NIHSSO.
     * 
     * @param SSOUsername
     */
    public void setSSOUsername(java.lang.String SSOUsername) {
        this.SSOUsername = SSOUsername;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NIHSSO)) return false;
        NIHSSO other = (NIHSSO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SSODomain==null && other.getSSODomain()==null) || 
             (this.SSODomain!=null &&
              this.SSODomain.equals(other.getSSODomain()))) &&
            ((this.SSOUsername==null && other.getSSOUsername()==null) || 
             (this.SSOUsername!=null &&
              this.SSOUsername.equals(other.getSSOUsername())));
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
        if (getSSODomain() != null) {
            _hashCode += getSSODomain().hashCode();
        }
        if (getSSOUsername() != null) {
            _hashCode += getSSOUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NIHSSO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">NIHSSO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSODomain");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "SSODomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSOUsername");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "SSOUsername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
