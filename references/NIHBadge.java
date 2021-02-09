/**
 * NIHBadge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.www.NEDPersonV3;

public class NIHBadge  implements java.io.Serializable {
    private java.lang.String badgeExprationDate;

    private java.lang.String badgeIssueReason;

    private java.lang.String badgeRequestDate;

    private java.lang.String badgeTitle;

    public NIHBadge() {
    }

    public NIHBadge(
           java.lang.String badgeExprationDate,
           java.lang.String badgeIssueReason,
           java.lang.String badgeRequestDate,
           java.lang.String badgeTitle) {
           this.badgeExprationDate = badgeExprationDate;
           this.badgeIssueReason = badgeIssueReason;
           this.badgeRequestDate = badgeRequestDate;
           this.badgeTitle = badgeTitle;
    }


    /**
     * Gets the badgeExprationDate value for this NIHBadge.
     * 
     * @return badgeExprationDate
     */
    public java.lang.String getBadgeExprationDate() {
        return badgeExprationDate;
    }


    /**
     * Sets the badgeExprationDate value for this NIHBadge.
     * 
     * @param badgeExprationDate
     */
    public void setBadgeExprationDate(java.lang.String badgeExprationDate) {
        this.badgeExprationDate = badgeExprationDate;
    }


    /**
     * Gets the badgeIssueReason value for this NIHBadge.
     * 
     * @return badgeIssueReason
     */
    public java.lang.String getBadgeIssueReason() {
        return badgeIssueReason;
    }


    /**
     * Sets the badgeIssueReason value for this NIHBadge.
     * 
     * @param badgeIssueReason
     */
    public void setBadgeIssueReason(java.lang.String badgeIssueReason) {
        this.badgeIssueReason = badgeIssueReason;
    }


    /**
     * Gets the badgeRequestDate value for this NIHBadge.
     * 
     * @return badgeRequestDate
     */
    public java.lang.String getBadgeRequestDate() {
        return badgeRequestDate;
    }


    /**
     * Sets the badgeRequestDate value for this NIHBadge.
     * 
     * @param badgeRequestDate
     */
    public void setBadgeRequestDate(java.lang.String badgeRequestDate) {
        this.badgeRequestDate = badgeRequestDate;
    }


    /**
     * Gets the badgeTitle value for this NIHBadge.
     * 
     * @return badgeTitle
     */
    public java.lang.String getBadgeTitle() {
        return badgeTitle;
    }


    /**
     * Sets the badgeTitle value for this NIHBadge.
     * 
     * @param badgeTitle
     */
    public void setBadgeTitle(java.lang.String badgeTitle) {
        this.badgeTitle = badgeTitle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NIHBadge)) return false;
        NIHBadge other = (NIHBadge) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.badgeExprationDate==null && other.getBadgeExprationDate()==null) || 
             (this.badgeExprationDate!=null &&
              this.badgeExprationDate.equals(other.getBadgeExprationDate()))) &&
            ((this.badgeIssueReason==null && other.getBadgeIssueReason()==null) || 
             (this.badgeIssueReason!=null &&
              this.badgeIssueReason.equals(other.getBadgeIssueReason()))) &&
            ((this.badgeRequestDate==null && other.getBadgeRequestDate()==null) || 
             (this.badgeRequestDate!=null &&
              this.badgeRequestDate.equals(other.getBadgeRequestDate()))) &&
            ((this.badgeTitle==null && other.getBadgeTitle()==null) || 
             (this.badgeTitle!=null &&
              this.badgeTitle.equals(other.getBadgeTitle())));
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
        if (getBadgeExprationDate() != null) {
            _hashCode += getBadgeExprationDate().hashCode();
        }
        if (getBadgeIssueReason() != null) {
            _hashCode += getBadgeIssueReason().hashCode();
        }
        if (getBadgeRequestDate() != null) {
            _hashCode += getBadgeRequestDate().hashCode();
        }
        if (getBadgeTitle() != null) {
            _hashCode += getBadgeTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NIHBadge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">NIHBadge"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("badgeExprationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "BadgeExprationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("badgeIssueReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "BadgeIssueReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("badgeRequestDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "BadgeRequestDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("badgeTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "BadgeTitle"));
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
