/**
 * NEDPersonBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.www.NEDPersonV3;

public class NEDPersonBase  implements java.io.Serializable {
    private java.lang.String uniqueidentifier;

    private gov.nih.www.NEDPersonV3.Name[] names;

    private gov.nih.www.NEDPersonV3.PhoneNumber phoneNumber;

    private gov.nih.www.NEDPersonV3.EmailAddress emailAddress;

    private java.lang.String NIHOrgAcronym;

    private java.lang.String NIHOUAcronym;

    private java.lang.String NIHOUName;

    private java.lang.String NIHSAC;

    private java.lang.String organizationalStatus;

    private gov.nih.www.NEDPersonV3.NIHSSO NIHSSO;

    private java.lang.String title;

    private gov.nih.www.NEDPersonV3.Address address;

    private java.lang.String directoryEntryEffectiveDate;

    public NEDPersonBase() {
    }

    public NEDPersonBase(
           java.lang.String uniqueidentifier,
           gov.nih.www.NEDPersonV3.Name[] names,
           gov.nih.www.NEDPersonV3.PhoneNumber phoneNumber,
           gov.nih.www.NEDPersonV3.EmailAddress emailAddress,
           java.lang.String NIHOrgAcronym,
           java.lang.String NIHOUAcronym,
           java.lang.String NIHOUName,
           java.lang.String NIHSAC,
           java.lang.String organizationalStatus,
           gov.nih.www.NEDPersonV3.NIHSSO NIHSSO,
           java.lang.String title,
           gov.nih.www.NEDPersonV3.Address address,
           java.lang.String directoryEntryEffectiveDate) {
           this.uniqueidentifier = uniqueidentifier;
           this.names = names;
           this.phoneNumber = phoneNumber;
           this.emailAddress = emailAddress;
           this.NIHOrgAcronym = NIHOrgAcronym;
           this.NIHOUAcronym = NIHOUAcronym;
           this.NIHOUName = NIHOUName;
           this.NIHSAC = NIHSAC;
           this.organizationalStatus = organizationalStatus;
           this.NIHSSO = NIHSSO;
           this.title = title;
           this.address = address;
           this.directoryEntryEffectiveDate = directoryEntryEffectiveDate;
    }


    /**
     * Gets the uniqueidentifier value for this NEDPersonBase.
     * 
     * @return uniqueidentifier
     */
    public java.lang.String getUniqueidentifier() {
        return uniqueidentifier;
    }


    /**
     * Sets the uniqueidentifier value for this NEDPersonBase.
     * 
     * @param uniqueidentifier
     */
    public void setUniqueidentifier(java.lang.String uniqueidentifier) {
        this.uniqueidentifier = uniqueidentifier;
    }


    /**
     * Gets the names value for this NEDPersonBase.
     * 
     * @return names
     */
    public gov.nih.www.NEDPersonV3.Name[] getNames() {
        return names;
    }


    /**
     * Sets the names value for this NEDPersonBase.
     * 
     * @param names
     */
    public void setNames(gov.nih.www.NEDPersonV3.Name[] names) {
        this.names = names;
    }


    /**
     * Gets the phoneNumber value for this NEDPersonBase.
     * 
     * @return phoneNumber
     */
    public gov.nih.www.NEDPersonV3.PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this NEDPersonBase.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(gov.nih.www.NEDPersonV3.PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the emailAddress value for this NEDPersonBase.
     * 
     * @return emailAddress
     */
    public gov.nih.www.NEDPersonV3.EmailAddress getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this NEDPersonBase.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(gov.nih.www.NEDPersonV3.EmailAddress emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the NIHOrgAcronym value for this NEDPersonBase.
     * 
     * @return NIHOrgAcronym
     */
    public java.lang.String getNIHOrgAcronym() {
        return NIHOrgAcronym;
    }


    /**
     * Sets the NIHOrgAcronym value for this NEDPersonBase.
     * 
     * @param NIHOrgAcronym
     */
    public void setNIHOrgAcronym(java.lang.String NIHOrgAcronym) {
        this.NIHOrgAcronym = NIHOrgAcronym;
    }


    /**
     * Gets the NIHOUAcronym value for this NEDPersonBase.
     * 
     * @return NIHOUAcronym
     */
    public java.lang.String getNIHOUAcronym() {
        return NIHOUAcronym;
    }


    /**
     * Sets the NIHOUAcronym value for this NEDPersonBase.
     * 
     * @param NIHOUAcronym
     */
    public void setNIHOUAcronym(java.lang.String NIHOUAcronym) {
        this.NIHOUAcronym = NIHOUAcronym;
    }


    /**
     * Gets the NIHOUName value for this NEDPersonBase.
     * 
     * @return NIHOUName
     */
    public java.lang.String getNIHOUName() {
        return NIHOUName;
    }


    /**
     * Sets the NIHOUName value for this NEDPersonBase.
     * 
     * @param NIHOUName
     */
    public void setNIHOUName(java.lang.String NIHOUName) {
        this.NIHOUName = NIHOUName;
    }


    /**
     * Gets the NIHSAC value for this NEDPersonBase.
     * 
     * @return NIHSAC
     */
    public java.lang.String getNIHSAC() {
        return NIHSAC;
    }


    /**
     * Sets the NIHSAC value for this NEDPersonBase.
     * 
     * @param NIHSAC
     */
    public void setNIHSAC(java.lang.String NIHSAC) {
        this.NIHSAC = NIHSAC;
    }


    /**
     * Gets the organizationalStatus value for this NEDPersonBase.
     * 
     * @return organizationalStatus
     */
    public java.lang.String getOrganizationalStatus() {
        return organizationalStatus;
    }


    /**
     * Sets the organizationalStatus value for this NEDPersonBase.
     * 
     * @param organizationalStatus
     */
    public void setOrganizationalStatus(java.lang.String organizationalStatus) {
        this.organizationalStatus = organizationalStatus;
    }


    /**
     * Gets the NIHSSO value for this NEDPersonBase.
     * 
     * @return NIHSSO
     */
    public gov.nih.www.NEDPersonV3.NIHSSO getNIHSSO() {
        return NIHSSO;
    }


    /**
     * Sets the NIHSSO value for this NEDPersonBase.
     * 
     * @param NIHSSO
     */
    public void setNIHSSO(gov.nih.www.NEDPersonV3.NIHSSO NIHSSO) {
        this.NIHSSO = NIHSSO;
    }


    /**
     * Gets the title value for this NEDPersonBase.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this NEDPersonBase.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the address value for this NEDPersonBase.
     * 
     * @return address
     */
    public gov.nih.www.NEDPersonV3.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this NEDPersonBase.
     * 
     * @param address
     */
    public void setAddress(gov.nih.www.NEDPersonV3.Address address) {
        this.address = address;
    }


    /**
     * Gets the directoryEntryEffectiveDate value for this NEDPersonBase.
     * 
     * @return directoryEntryEffectiveDate
     */
    public java.lang.String getDirectoryEntryEffectiveDate() {
        return directoryEntryEffectiveDate;
    }


    /**
     * Sets the directoryEntryEffectiveDate value for this NEDPersonBase.
     * 
     * @param directoryEntryEffectiveDate
     */
    public void setDirectoryEntryEffectiveDate(java.lang.String directoryEntryEffectiveDate) {
        this.directoryEntryEffectiveDate = directoryEntryEffectiveDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NEDPersonBase)) return false;
        NEDPersonBase other = (NEDPersonBase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uniqueidentifier==null && other.getUniqueidentifier()==null) || 
             (this.uniqueidentifier!=null &&
              this.uniqueidentifier.equals(other.getUniqueidentifier()))) &&
            ((this.names==null && other.getNames()==null) || 
             (this.names!=null &&
              java.util.Arrays.equals(this.names, other.getNames()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.NIHOrgAcronym==null && other.getNIHOrgAcronym()==null) || 
             (this.NIHOrgAcronym!=null &&
              this.NIHOrgAcronym.equals(other.getNIHOrgAcronym()))) &&
            ((this.NIHOUAcronym==null && other.getNIHOUAcronym()==null) || 
             (this.NIHOUAcronym!=null &&
              this.NIHOUAcronym.equals(other.getNIHOUAcronym()))) &&
            ((this.NIHOUName==null && other.getNIHOUName()==null) || 
             (this.NIHOUName!=null &&
              this.NIHOUName.equals(other.getNIHOUName()))) &&
            ((this.NIHSAC==null && other.getNIHSAC()==null) || 
             (this.NIHSAC!=null &&
              this.NIHSAC.equals(other.getNIHSAC()))) &&
            ((this.organizationalStatus==null && other.getOrganizationalStatus()==null) || 
             (this.organizationalStatus!=null &&
              this.organizationalStatus.equals(other.getOrganizationalStatus()))) &&
            ((this.NIHSSO==null && other.getNIHSSO()==null) || 
             (this.NIHSSO!=null &&
              this.NIHSSO.equals(other.getNIHSSO()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.directoryEntryEffectiveDate==null && other.getDirectoryEntryEffectiveDate()==null) || 
             (this.directoryEntryEffectiveDate!=null &&
              this.directoryEntryEffectiveDate.equals(other.getDirectoryEntryEffectiveDate())));
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
        if (getUniqueidentifier() != null) {
            _hashCode += getUniqueidentifier().hashCode();
        }
        if (getNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getNIHOrgAcronym() != null) {
            _hashCode += getNIHOrgAcronym().hashCode();
        }
        if (getNIHOUAcronym() != null) {
            _hashCode += getNIHOUAcronym().hashCode();
        }
        if (getNIHOUName() != null) {
            _hashCode += getNIHOUName().hashCode();
        }
        if (getNIHSAC() != null) {
            _hashCode += getNIHSAC().hashCode();
        }
        if (getOrganizationalStatus() != null) {
            _hashCode += getOrganizationalStatus().hashCode();
        }
        if (getNIHSSO() != null) {
            _hashCode += getNIHSSO().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getDirectoryEntryEffectiveDate() != null) {
            _hashCode += getDirectoryEntryEffectiveDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NEDPersonBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">NEDPersonBase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueidentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "Uniqueidentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("names");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "Names"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">Names"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "PhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">PhoneNumber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "EmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">EmailAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIHOrgAcronym");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "NIHOrgAcronym"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIHOUAcronym");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "NIHOUAcronym"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIHOUName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "NIHOUName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIHSAC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "NIHSAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "OrganizationalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIHSSO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "NIHSSO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">NIHSSO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">Address"));
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
