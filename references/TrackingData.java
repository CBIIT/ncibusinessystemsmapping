/**
 * TrackingData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.www.NEDPersonV3;

public class TrackingData  implements java.io.Serializable {
    private java.lang.String createTimeStamp;

    private java.lang.String creatorsName;

    private java.lang.String directoryEntryEffectiveDate;

    private java.lang.String modifiersName;

    private java.lang.String modifyTimeStamp;

    private java.lang.String uniqueIDQuality;

    private java.lang.String uniqueIDValidationTimeStamp;

    private java.lang.String uniqueIDValidator;

    public TrackingData() {
    }

    public TrackingData(
           java.lang.String createTimeStamp,
           java.lang.String creatorsName,
           java.lang.String directoryEntryEffectiveDate,
           java.lang.String modifiersName,
           java.lang.String modifyTimeStamp,
           java.lang.String uniqueIDQuality,
           java.lang.String uniqueIDValidationTimeStamp,
           java.lang.String uniqueIDValidator) {
           this.createTimeStamp = createTimeStamp;
           this.creatorsName = creatorsName;
           this.directoryEntryEffectiveDate = directoryEntryEffectiveDate;
           this.modifiersName = modifiersName;
           this.modifyTimeStamp = modifyTimeStamp;
           this.uniqueIDQuality = uniqueIDQuality;
           this.uniqueIDValidationTimeStamp = uniqueIDValidationTimeStamp;
           this.uniqueIDValidator = uniqueIDValidator;
    }


    /**
     * Gets the createTimeStamp value for this TrackingData.
     * 
     * @return createTimeStamp
     */
    public java.lang.String getCreateTimeStamp() {
        return createTimeStamp;
    }


    /**
     * Sets the createTimeStamp value for this TrackingData.
     * 
     * @param createTimeStamp
     */
    public void setCreateTimeStamp(java.lang.String createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
    }


    /**
     * Gets the creatorsName value for this TrackingData.
     * 
     * @return creatorsName
     */
    public java.lang.String getCreatorsName() {
        return creatorsName;
    }


    /**
     * Sets the creatorsName value for this TrackingData.
     * 
     * @param creatorsName
     */
    public void setCreatorsName(java.lang.String creatorsName) {
        this.creatorsName = creatorsName;
    }


    /**
     * Gets the directoryEntryEffectiveDate value for this TrackingData.
     * 
     * @return directoryEntryEffectiveDate
     */
    public java.lang.String getDirectoryEntryEffectiveDate() {
        return directoryEntryEffectiveDate;
    }


    /**
     * Sets the directoryEntryEffectiveDate value for this TrackingData.
     * 
     * @param directoryEntryEffectiveDate
     */
    public void setDirectoryEntryEffectiveDate(java.lang.String directoryEntryEffectiveDate) {
        this.directoryEntryEffectiveDate = directoryEntryEffectiveDate;
    }


    /**
     * Gets the modifiersName value for this TrackingData.
     * 
     * @return modifiersName
     */
    public java.lang.String getModifiersName() {
        return modifiersName;
    }


    /**
     * Sets the modifiersName value for this TrackingData.
     * 
     * @param modifiersName
     */
    public void setModifiersName(java.lang.String modifiersName) {
        this.modifiersName = modifiersName;
    }


    /**
     * Gets the modifyTimeStamp value for this TrackingData.
     * 
     * @return modifyTimeStamp
     */
    public java.lang.String getModifyTimeStamp() {
        return modifyTimeStamp;
    }


    /**
     * Sets the modifyTimeStamp value for this TrackingData.
     * 
     * @param modifyTimeStamp
     */
    public void setModifyTimeStamp(java.lang.String modifyTimeStamp) {
        this.modifyTimeStamp = modifyTimeStamp;
    }


    /**
     * Gets the uniqueIDQuality value for this TrackingData.
     * 
     * @return uniqueIDQuality
     */
    public java.lang.String getUniqueIDQuality() {
        return uniqueIDQuality;
    }


    /**
     * Sets the uniqueIDQuality value for this TrackingData.
     * 
     * @param uniqueIDQuality
     */
    public void setUniqueIDQuality(java.lang.String uniqueIDQuality) {
        this.uniqueIDQuality = uniqueIDQuality;
    }


    /**
     * Gets the uniqueIDValidationTimeStamp value for this TrackingData.
     * 
     * @return uniqueIDValidationTimeStamp
     */
    public java.lang.String getUniqueIDValidationTimeStamp() {
        return uniqueIDValidationTimeStamp;
    }


    /**
     * Sets the uniqueIDValidationTimeStamp value for this TrackingData.
     * 
     * @param uniqueIDValidationTimeStamp
     */
    public void setUniqueIDValidationTimeStamp(java.lang.String uniqueIDValidationTimeStamp) {
        this.uniqueIDValidationTimeStamp = uniqueIDValidationTimeStamp;
    }


    /**
     * Gets the uniqueIDValidator value for this TrackingData.
     * 
     * @return uniqueIDValidator
     */
    public java.lang.String getUniqueIDValidator() {
        return uniqueIDValidator;
    }


    /**
     * Sets the uniqueIDValidator value for this TrackingData.
     * 
     * @param uniqueIDValidator
     */
    public void setUniqueIDValidator(java.lang.String uniqueIDValidator) {
        this.uniqueIDValidator = uniqueIDValidator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrackingData)) return false;
        TrackingData other = (TrackingData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createTimeStamp==null && other.getCreateTimeStamp()==null) || 
             (this.createTimeStamp!=null &&
              this.createTimeStamp.equals(other.getCreateTimeStamp()))) &&
            ((this.creatorsName==null && other.getCreatorsName()==null) || 
             (this.creatorsName!=null &&
              this.creatorsName.equals(other.getCreatorsName()))) &&
            ((this.directoryEntryEffectiveDate==null && other.getDirectoryEntryEffectiveDate()==null) || 
             (this.directoryEntryEffectiveDate!=null &&
              this.directoryEntryEffectiveDate.equals(other.getDirectoryEntryEffectiveDate()))) &&
            ((this.modifiersName==null && other.getModifiersName()==null) || 
             (this.modifiersName!=null &&
              this.modifiersName.equals(other.getModifiersName()))) &&
            ((this.modifyTimeStamp==null && other.getModifyTimeStamp()==null) || 
             (this.modifyTimeStamp!=null &&
              this.modifyTimeStamp.equals(other.getModifyTimeStamp()))) &&
            ((this.uniqueIDQuality==null && other.getUniqueIDQuality()==null) || 
             (this.uniqueIDQuality!=null &&
              this.uniqueIDQuality.equals(other.getUniqueIDQuality()))) &&
            ((this.uniqueIDValidationTimeStamp==null && other.getUniqueIDValidationTimeStamp()==null) || 
             (this.uniqueIDValidationTimeStamp!=null &&
              this.uniqueIDValidationTimeStamp.equals(other.getUniqueIDValidationTimeStamp()))) &&
            ((this.uniqueIDValidator==null && other.getUniqueIDValidator()==null) || 
             (this.uniqueIDValidator!=null &&
              this.uniqueIDValidator.equals(other.getUniqueIDValidator())));
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
        if (getCreateTimeStamp() != null) {
            _hashCode += getCreateTimeStamp().hashCode();
        }
        if (getCreatorsName() != null) {
            _hashCode += getCreatorsName().hashCode();
        }
        if (getDirectoryEntryEffectiveDate() != null) {
            _hashCode += getDirectoryEntryEffectiveDate().hashCode();
        }
        if (getModifiersName() != null) {
            _hashCode += getModifiersName().hashCode();
        }
        if (getModifyTimeStamp() != null) {
            _hashCode += getModifyTimeStamp().hashCode();
        }
        if (getUniqueIDQuality() != null) {
            _hashCode += getUniqueIDQuality().hashCode();
        }
        if (getUniqueIDValidationTimeStamp() != null) {
            _hashCode += getUniqueIDValidationTimeStamp().hashCode();
        }
        if (getUniqueIDValidator() != null) {
            _hashCode += getUniqueIDValidator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrackingData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">TrackingData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createTimeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "CreateTimeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorsName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "CreatorsName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directoryEntryEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "DirectoryEntryEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiersName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "ModifiersName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyTimeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "ModifyTimeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueIDQuality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "UniqueIDQuality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueIDValidationTimeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "UniqueIDValidationTimeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueIDValidator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "UniqueIDValidator"));
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
