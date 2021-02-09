/**
 * Name.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.www.NEDPersonV3;

public class Name  implements java.io.Serializable {
    private java.lang.String formattedName;

    private java.lang.String generationQualifier;

    private java.lang.String givenName;

    private java.lang.String middleName;

    private java.lang.String mixCaseSurname;

    private java.lang.String personalTitle;

    private java.lang.String suffixQualifier;

    private java.lang.String surname;

    private gov.nih.www.NEDPersonV3.NameType nameType;  // attribute

    public Name() {
    }

    public Name(
           java.lang.String formattedName,
           java.lang.String generationQualifier,
           java.lang.String givenName,
           java.lang.String middleName,
           java.lang.String mixCaseSurname,
           java.lang.String personalTitle,
           java.lang.String suffixQualifier,
           java.lang.String surname,
           gov.nih.www.NEDPersonV3.NameType nameType) {
           this.formattedName = formattedName;
           this.generationQualifier = generationQualifier;
           this.givenName = givenName;
           this.middleName = middleName;
           this.mixCaseSurname = mixCaseSurname;
           this.personalTitle = personalTitle;
           this.suffixQualifier = suffixQualifier;
           this.surname = surname;
           this.nameType = nameType;
    }


    /**
     * Gets the formattedName value for this Name.
     * 
     * @return formattedName
     */
    public java.lang.String getFormattedName() {
        return formattedName;
    }


    /**
     * Sets the formattedName value for this Name.
     * 
     * @param formattedName
     */
    public void setFormattedName(java.lang.String formattedName) {
        this.formattedName = formattedName;
    }


    /**
     * Gets the generationQualifier value for this Name.
     * 
     * @return generationQualifier
     */
    public java.lang.String getGenerationQualifier() {
        return generationQualifier;
    }


    /**
     * Sets the generationQualifier value for this Name.
     * 
     * @param generationQualifier
     */
    public void setGenerationQualifier(java.lang.String generationQualifier) {
        this.generationQualifier = generationQualifier;
    }


    /**
     * Gets the givenName value for this Name.
     * 
     * @return givenName
     */
    public java.lang.String getGivenName() {
        return givenName;
    }


    /**
     * Sets the givenName value for this Name.
     * 
     * @param givenName
     */
    public void setGivenName(java.lang.String givenName) {
        this.givenName = givenName;
    }


    /**
     * Gets the middleName value for this Name.
     * 
     * @return middleName
     */
    public java.lang.String getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this Name.
     * 
     * @param middleName
     */
    public void setMiddleName(java.lang.String middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the mixCaseSurname value for this Name.
     * 
     * @return mixCaseSurname
     */
    public java.lang.String getMixCaseSurname() {
        return mixCaseSurname;
    }


    /**
     * Sets the mixCaseSurname value for this Name.
     * 
     * @param mixCaseSurname
     */
    public void setMixCaseSurname(java.lang.String mixCaseSurname) {
        this.mixCaseSurname = mixCaseSurname;
    }


    /**
     * Gets the personalTitle value for this Name.
     * 
     * @return personalTitle
     */
    public java.lang.String getPersonalTitle() {
        return personalTitle;
    }


    /**
     * Sets the personalTitle value for this Name.
     * 
     * @param personalTitle
     */
    public void setPersonalTitle(java.lang.String personalTitle) {
        this.personalTitle = personalTitle;
    }


    /**
     * Gets the suffixQualifier value for this Name.
     * 
     * @return suffixQualifier
     */
    public java.lang.String getSuffixQualifier() {
        return suffixQualifier;
    }


    /**
     * Sets the suffixQualifier value for this Name.
     * 
     * @param suffixQualifier
     */
    public void setSuffixQualifier(java.lang.String suffixQualifier) {
        this.suffixQualifier = suffixQualifier;
    }


    /**
     * Gets the surname value for this Name.
     * 
     * @return surname
     */
    public java.lang.String getSurname() {
        return surname;
    }


    /**
     * Sets the surname value for this Name.
     * 
     * @param surname
     */
    public void setSurname(java.lang.String surname) {
        this.surname = surname;
    }


    /**
     * Gets the nameType value for this Name.
     * 
     * @return nameType
     */
    public gov.nih.www.NEDPersonV3.NameType getNameType() {
        return nameType;
    }


    /**
     * Sets the nameType value for this Name.
     * 
     * @param nameType
     */
    public void setNameType(gov.nih.www.NEDPersonV3.NameType nameType) {
        this.nameType = nameType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Name)) return false;
        Name other = (Name) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.formattedName==null && other.getFormattedName()==null) || 
             (this.formattedName!=null &&
              this.formattedName.equals(other.getFormattedName()))) &&
            ((this.generationQualifier==null && other.getGenerationQualifier()==null) || 
             (this.generationQualifier!=null &&
              this.generationQualifier.equals(other.getGenerationQualifier()))) &&
            ((this.givenName==null && other.getGivenName()==null) || 
             (this.givenName!=null &&
              this.givenName.equals(other.getGivenName()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.mixCaseSurname==null && other.getMixCaseSurname()==null) || 
             (this.mixCaseSurname!=null &&
              this.mixCaseSurname.equals(other.getMixCaseSurname()))) &&
            ((this.personalTitle==null && other.getPersonalTitle()==null) || 
             (this.personalTitle!=null &&
              this.personalTitle.equals(other.getPersonalTitle()))) &&
            ((this.suffixQualifier==null && other.getSuffixQualifier()==null) || 
             (this.suffixQualifier!=null &&
              this.suffixQualifier.equals(other.getSuffixQualifier()))) &&
            ((this.surname==null && other.getSurname()==null) || 
             (this.surname!=null &&
              this.surname.equals(other.getSurname()))) &&
            ((this.nameType==null && other.getNameType()==null) || 
             (this.nameType!=null &&
              this.nameType.equals(other.getNameType())));
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
        if (getFormattedName() != null) {
            _hashCode += getFormattedName().hashCode();
        }
        if (getGenerationQualifier() != null) {
            _hashCode += getGenerationQualifier().hashCode();
        }
        if (getGivenName() != null) {
            _hashCode += getGivenName().hashCode();
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
        }
        if (getMixCaseSurname() != null) {
            _hashCode += getMixCaseSurname().hashCode();
        }
        if (getPersonalTitle() != null) {
            _hashCode += getPersonalTitle().hashCode();
        }
        if (getSuffixQualifier() != null) {
            _hashCode += getSuffixQualifier().hashCode();
        }
        if (getSurname() != null) {
            _hashCode += getSurname().hashCode();
        }
        if (getNameType() != null) {
            _hashCode += getNameType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Name.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">Name"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("nameType");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "NameType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">NameType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formattedName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "FormattedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generationQualifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "GenerationQualifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("givenName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "GivenName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "MiddleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mixCaseSurname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "MixCaseSurname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "PersonalTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suffixQualifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "SuffixQualifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "Surname"));
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
