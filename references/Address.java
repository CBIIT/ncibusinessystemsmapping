/**
 * Address.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.www.NEDPersonV3;

public class Address  implements java.io.Serializable {
    private java.lang.String buildingName;

    private java.lang.String country;

    private java.lang.String formattedAddress;

    private java.lang.String locality;

    private java.lang.String mailStop;

    private java.lang.String postalCode;

    private java.lang.String roomNumber;

    private java.lang.String site;

    private java.lang.String state;

    private java.lang.String street;

    private gov.nih.www.NEDPersonV3.AddressType addressType;  // attribute

    public Address() {
    }

    public Address(
           java.lang.String buildingName,
           java.lang.String country,
           java.lang.String formattedAddress,
           java.lang.String locality,
           java.lang.String mailStop,
           java.lang.String postalCode,
           java.lang.String roomNumber,
           java.lang.String site,
           java.lang.String state,
           java.lang.String street,
           gov.nih.www.NEDPersonV3.AddressType addressType) {
           this.buildingName = buildingName;
           this.country = country;
           this.formattedAddress = formattedAddress;
           this.locality = locality;
           this.mailStop = mailStop;
           this.postalCode = postalCode;
           this.roomNumber = roomNumber;
           this.site = site;
           this.state = state;
           this.street = street;
           this.addressType = addressType;
    }


    /**
     * Gets the buildingName value for this Address.
     * 
     * @return buildingName
     */
    public java.lang.String getBuildingName() {
        return buildingName;
    }


    /**
     * Sets the buildingName value for this Address.
     * 
     * @param buildingName
     */
    public void setBuildingName(java.lang.String buildingName) {
        this.buildingName = buildingName;
    }


    /**
     * Gets the country value for this Address.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Address.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the formattedAddress value for this Address.
     * 
     * @return formattedAddress
     */
    public java.lang.String getFormattedAddress() {
        return formattedAddress;
    }


    /**
     * Sets the formattedAddress value for this Address.
     * 
     * @param formattedAddress
     */
    public void setFormattedAddress(java.lang.String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }


    /**
     * Gets the locality value for this Address.
     * 
     * @return locality
     */
    public java.lang.String getLocality() {
        return locality;
    }


    /**
     * Sets the locality value for this Address.
     * 
     * @param locality
     */
    public void setLocality(java.lang.String locality) {
        this.locality = locality;
    }


    /**
     * Gets the mailStop value for this Address.
     * 
     * @return mailStop
     */
    public java.lang.String getMailStop() {
        return mailStop;
    }


    /**
     * Sets the mailStop value for this Address.
     * 
     * @param mailStop
     */
    public void setMailStop(java.lang.String mailStop) {
        this.mailStop = mailStop;
    }


    /**
     * Gets the postalCode value for this Address.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this Address.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the roomNumber value for this Address.
     * 
     * @return roomNumber
     */
    public java.lang.String getRoomNumber() {
        return roomNumber;
    }


    /**
     * Sets the roomNumber value for this Address.
     * 
     * @param roomNumber
     */
    public void setRoomNumber(java.lang.String roomNumber) {
        this.roomNumber = roomNumber;
    }


    /**
     * Gets the site value for this Address.
     * 
     * @return site
     */
    public java.lang.String getSite() {
        return site;
    }


    /**
     * Sets the site value for this Address.
     * 
     * @param site
     */
    public void setSite(java.lang.String site) {
        this.site = site;
    }


    /**
     * Gets the state value for this Address.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Address.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the street value for this Address.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this Address.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the addressType value for this Address.
     * 
     * @return addressType
     */
    public gov.nih.www.NEDPersonV3.AddressType getAddressType() {
        return addressType;
    }


    /**
     * Sets the addressType value for this Address.
     * 
     * @param addressType
     */
    public void setAddressType(gov.nih.www.NEDPersonV3.AddressType addressType) {
        this.addressType = addressType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Address)) return false;
        Address other = (Address) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.buildingName==null && other.getBuildingName()==null) || 
             (this.buildingName!=null &&
              this.buildingName.equals(other.getBuildingName()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.formattedAddress==null && other.getFormattedAddress()==null) || 
             (this.formattedAddress!=null &&
              this.formattedAddress.equals(other.getFormattedAddress()))) &&
            ((this.locality==null && other.getLocality()==null) || 
             (this.locality!=null &&
              this.locality.equals(other.getLocality()))) &&
            ((this.mailStop==null && other.getMailStop()==null) || 
             (this.mailStop!=null &&
              this.mailStop.equals(other.getMailStop()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.roomNumber==null && other.getRoomNumber()==null) || 
             (this.roomNumber!=null &&
              this.roomNumber.equals(other.getRoomNumber()))) &&
            ((this.site==null && other.getSite()==null) || 
             (this.site!=null &&
              this.site.equals(other.getSite()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.addressType==null && other.getAddressType()==null) || 
             (this.addressType!=null &&
              this.addressType.equals(other.getAddressType())));
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
        if (getBuildingName() != null) {
            _hashCode += getBuildingName().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getFormattedAddress() != null) {
            _hashCode += getFormattedAddress().hashCode();
        }
        if (getLocality() != null) {
            _hashCode += getLocality().hashCode();
        }
        if (getMailStop() != null) {
            _hashCode += getMailStop().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getRoomNumber() != null) {
            _hashCode += getRoomNumber().hashCode();
        }
        if (getSite() != null) {
            _hashCode += getSite().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getAddressType() != null) {
            _hashCode += getAddressType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Address.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">Address"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("addressType");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "AddressType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">AddressType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildingName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "BuildingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formattedAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "FormattedAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "Locality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailStop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "MailStop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roomNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "RoomNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("site");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "Site"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "Street"));
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
