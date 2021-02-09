/**
 * NEDPersonWithPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.www.NEDPersonV3;

public class NEDPersonWithPI  implements java.io.Serializable {
    private gov.nih.www.NEDPersonV3.NEDPerson NEDPerson;

    private gov.nih.www.NEDPersonV3.NIHPrivacy NIHPrivacy;

    public NEDPersonWithPI() {
    }

    public NEDPersonWithPI(
           gov.nih.www.NEDPersonV3.NEDPerson NEDPerson,
           gov.nih.www.NEDPersonV3.NIHPrivacy NIHPrivacy) {
           this.NEDPerson = NEDPerson;
           this.NIHPrivacy = NIHPrivacy;
    }


    /**
     * Gets the NEDPerson value for this NEDPersonWithPI.
     * 
     * @return NEDPerson
     */
    public gov.nih.www.NEDPersonV3.NEDPerson getNEDPerson() {
        return NEDPerson;
    }


    /**
     * Sets the NEDPerson value for this NEDPersonWithPI.
     * 
     * @param NEDPerson
     */
    public void setNEDPerson(gov.nih.www.NEDPersonV3.NEDPerson NEDPerson) {
        this.NEDPerson = NEDPerson;
    }


    /**
     * Gets the NIHPrivacy value for this NEDPersonWithPI.
     * 
     * @return NIHPrivacy
     */
    public gov.nih.www.NEDPersonV3.NIHPrivacy getNIHPrivacy() {
        return NIHPrivacy;
    }


    /**
     * Sets the NIHPrivacy value for this NEDPersonWithPI.
     * 
     * @param NIHPrivacy
     */
    public void setNIHPrivacy(gov.nih.www.NEDPersonV3.NIHPrivacy NIHPrivacy) {
        this.NIHPrivacy = NIHPrivacy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NEDPersonWithPI)) return false;
        NEDPersonWithPI other = (NEDPersonWithPI) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.NEDPerson==null && other.getNEDPerson()==null) || 
             (this.NEDPerson!=null &&
              this.NEDPerson.equals(other.getNEDPerson()))) &&
            ((this.NIHPrivacy==null && other.getNIHPrivacy()==null) || 
             (this.NIHPrivacy!=null &&
              this.NIHPrivacy.equals(other.getNIHPrivacy())));
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
        if (getNEDPerson() != null) {
            _hashCode += getNEDPerson().hashCode();
        }
        if (getNIHPrivacy() != null) {
            _hashCode += getNIHPrivacy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NEDPersonWithPI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">NEDPersonWithPI"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NEDPerson");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "NEDPerson"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">NEDPerson"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIHPrivacy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "NIHPrivacy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">NIHPrivacy"));
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
