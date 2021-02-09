/**
 * NEDPerson.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.www.NEDPersonV3;

public class NEDPerson  implements java.io.Serializable {
    private gov.nih.www.NEDPersonV3.Address[] addresses;

    private java.lang.String description;

    private gov.nih.www.NEDPersonV3.EmailAddress[] emailAddresses;

    private java.lang.String managerID;

    private gov.nih.www.NEDPersonV3.NIHBadge NIHBadge;

    private java.lang.String NIHDUPUID;

    private java.lang.String NIHDirEntryNoPrint;

    private java.lang.String NIHDirEntryUnlist;

    private java.lang.String NIHIPD;

    private java.lang.String NIHLibraryAuth;

    private java.lang.String NIHOUAcronym;

    private java.lang.String NIHOUName;

    private java.lang.String NIHOrgAcronym;

    private java.lang.String NIHOrgName;

    private java.lang.String NIHOrgPath;

    private java.lang.String NIHSAC;

    private gov.nih.www.NEDPersonV3.NIHSSO NIHSSO;

    /* Summer Student at the NIH? */
    private java.lang.String NIHSummerStatus;

    private gov.nih.www.NEDPersonV3.Name[] names;

    private java.lang.String organizationalStatus;

    private gov.nih.www.NEDPersonV3.PhoneNumber[] phoneNumbers;

    private java.lang.String secretaryID;

    private java.lang.String title;

    private gov.nih.www.NEDPersonV3.TrackingData trackingData;

    private java.lang.String uniqueidentifier;

    public NEDPerson() {
    }

    public NEDPerson(
           gov.nih.www.NEDPersonV3.Address[] addresses,
           java.lang.String description,
           gov.nih.www.NEDPersonV3.EmailAddress[] emailAddresses,
           java.lang.String managerID,
           gov.nih.www.NEDPersonV3.NIHBadge NIHBadge,
           java.lang.String NIHDUPUID,
           java.lang.String NIHDirEntryNoPrint,
           java.lang.String NIHDirEntryUnlist,
           java.lang.String NIHIPD,
           java.lang.String NIHLibraryAuth,
           java.lang.String NIHOUAcronym,
           java.lang.String NIHOUName,
           java.lang.String NIHOrgAcronym,
           java.lang.String NIHOrgName,
           java.lang.String NIHOrgPath,
           java.lang.String NIHSAC,
           gov.nih.www.NEDPersonV3.NIHSSO NIHSSO,
           java.lang.String NIHSummerStatus,
           gov.nih.www.NEDPersonV3.Name[] names,
           java.lang.String organizationalStatus,
           gov.nih.www.NEDPersonV3.PhoneNumber[] phoneNumbers,
           java.lang.String secretaryID,
           java.lang.String title,
           gov.nih.www.NEDPersonV3.TrackingData trackingData,
           java.lang.String uniqueidentifier) {
           this.addresses = addresses;
           this.description = description;
           this.emailAddresses = emailAddresses;
           this.managerID = managerID;
           this.NIHBadge = NIHBadge;
           this.NIHDUPUID = NIHDUPUID;
           this.NIHDirEntryNoPrint = NIHDirEntryNoPrint;
           this.NIHDirEntryUnlist = NIHDirEntryUnlist;
           this.NIHIPD = NIHIPD;
           this.NIHLibraryAuth = NIHLibraryAuth;
           this.NIHOUAcronym = NIHOUAcronym;
           this.NIHOUName = NIHOUName;
           this.NIHOrgAcronym = NIHOrgAcronym;
           this.NIHOrgName = NIHOrgName;
           this.NIHOrgPath = NIHOrgPath;
           this.NIHSAC = NIHSAC;
           this.NIHSSO = NIHSSO;
           this.NIHSummerStatus = NIHSummerStatus;
           this.names = names;
           this.organizationalStatus = organizationalStatus;
           this.phoneNumbers = phoneNumbers;
           this.secretaryID = secretaryID;
           this.title = title;
           this.trackingData = trackingData;
           this.uniqueidentifier = uniqueidentifier;
    }


    /**
     * Gets the addresses value for this NEDPerson.
     * 
     * @return addresses
     */
    public gov.nih.www.NEDPersonV3.Address[] getAddresses() {
        return addresses;
    }


    /**
     * Sets the addresses value for this NEDPerson.
     * 
     * @param addresses
     */
    public void setAddresses(gov.nih.www.NEDPersonV3.Address[] addresses) {
        this.addresses = addresses;
    }


    /**
     * Gets the description value for this NEDPerson.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this NEDPerson.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the emailAddresses value for this NEDPerson.
     * 
     * @return emailAddresses
     */
    public gov.nih.www.NEDPersonV3.EmailAddress[] getEmailAddresses() {
        return emailAddresses;
    }


    /**
     * Sets the emailAddresses value for this NEDPerson.
     * 
     * @param emailAddresses
     */
    public void setEmailAddresses(gov.nih.www.NEDPersonV3.EmailAddress[] emailAddresses) {
        this.emailAddresses = emailAddresses;
    }


    /**
     * Gets the managerID value for this NEDPerson.
     * 
     * @return managerID
     */
    public java.lang.String getManagerID() {
        return managerID;
    }


    /**
     * Sets the managerID value for this NEDPerson.
     * 
     * @param managerID
     */
    public void setManagerID(java.lang.String managerID) {
        this.managerID = managerID;
    }


    /**
     * Gets the NIHBadge value for this NEDPerson.
     * 
     * @return NIHBadge
     */
    public gov.nih.www.NEDPersonV3.NIHBadge getNIHBadge() {
        return NIHBadge;
    }


    /**
     * Sets the NIHBadge value for this NEDPerson.
     * 
     * @param NIHBadge
     */
    public void setNIHBadge(gov.nih.www.NEDPersonV3.NIHBadge NIHBadge) {
        this.NIHBadge = NIHBadge;
    }


    /**
     * Gets the NIHDUPUID value for this NEDPerson.
     * 
     * @return NIHDUPUID
     */
    public java.lang.String getNIHDUPUID() {
        return NIHDUPUID;
    }


    /**
     * Sets the NIHDUPUID value for this NEDPerson.
     * 
     * @param NIHDUPUID
     */
    public void setNIHDUPUID(java.lang.String NIHDUPUID) {
        this.NIHDUPUID = NIHDUPUID;
    }


    /**
     * Gets the NIHDirEntryNoPrint value for this NEDPerson.
     * 
     * @return NIHDirEntryNoPrint
     */
    public java.lang.String getNIHDirEntryNoPrint() {
        return NIHDirEntryNoPrint;
    }


    /**
     * Sets the NIHDirEntryNoPrint value for this NEDPerson.
     * 
     * @param NIHDirEntryNoPrint
     */
    public void setNIHDirEntryNoPrint(java.lang.String NIHDirEntryNoPrint) {
        this.NIHDirEntryNoPrint = NIHDirEntryNoPrint;
    }


    /**
     * Gets the NIHDirEntryUnlist value for this NEDPerson.
     * 
     * @return NIHDirEntryUnlist
     */
    public java.lang.String getNIHDirEntryUnlist() {
        return NIHDirEntryUnlist;
    }


    /**
     * Sets the NIHDirEntryUnlist value for this NEDPerson.
     * 
     * @param NIHDirEntryUnlist
     */
    public void setNIHDirEntryUnlist(java.lang.String NIHDirEntryUnlist) {
        this.NIHDirEntryUnlist = NIHDirEntryUnlist;
    }


    /**
     * Gets the NIHIPD value for this NEDPerson.
     * 
     * @return NIHIPD
     */
    public java.lang.String getNIHIPD() {
        return NIHIPD;
    }


    /**
     * Sets the NIHIPD value for this NEDPerson.
     * 
     * @param NIHIPD
     */
    public void setNIHIPD(java.lang.String NIHIPD) {
        this.NIHIPD = NIHIPD;
    }


    /**
     * Gets the NIHLibraryAuth value for this NEDPerson.
     * 
     * @return NIHLibraryAuth
     */
    public java.lang.String getNIHLibraryAuth() {
        return NIHLibraryAuth;
    }


    /**
     * Sets the NIHLibraryAuth value for this NEDPerson.
     * 
     * @param NIHLibraryAuth
     */
    public void setNIHLibraryAuth(java.lang.String NIHLibraryAuth) {
        this.NIHLibraryAuth = NIHLibraryAuth;
    }


    /**
     * Gets the NIHOUAcronym value for this NEDPerson.
     * 
     * @return NIHOUAcronym
     */
    public java.lang.String getNIHOUAcronym() {
        return NIHOUAcronym;
    }


    /**
     * Sets the NIHOUAcronym value for this NEDPerson.
     * 
     * @param NIHOUAcronym
     */
    public void setNIHOUAcronym(java.lang.String NIHOUAcronym) {
        this.NIHOUAcronym = NIHOUAcronym;
    }


    /**
     * Gets the NIHOUName value for this NEDPerson.
     * 
     * @return NIHOUName
     */
    public java.lang.String getNIHOUName() {
        return NIHOUName;
    }


    /**
     * Sets the NIHOUName value for this NEDPerson.
     * 
     * @param NIHOUName
     */
    public void setNIHOUName(java.lang.String NIHOUName) {
        this.NIHOUName = NIHOUName;
    }


    /**
     * Gets the NIHOrgAcronym value for this NEDPerson.
     * 
     * @return NIHOrgAcronym
     */
    public java.lang.String getNIHOrgAcronym() {
        return NIHOrgAcronym;
    }


    /**
     * Sets the NIHOrgAcronym value for this NEDPerson.
     * 
     * @param NIHOrgAcronym
     */
    public void setNIHOrgAcronym(java.lang.String NIHOrgAcronym) {
        this.NIHOrgAcronym = NIHOrgAcronym;
    }


    /**
     * Gets the NIHOrgName value for this NEDPerson.
     * 
     * @return NIHOrgName
     */
    public java.lang.String getNIHOrgName() {
        return NIHOrgName;
    }


    /**
     * Sets the NIHOrgName value for this NEDPerson.
     * 
     * @param NIHOrgName
     */
    public void setNIHOrgName(java.lang.String NIHOrgName) {
        this.NIHOrgName = NIHOrgName;
    }


    /**
     * Gets the NIHOrgPath value for this NEDPerson.
     * 
     * @return NIHOrgPath
     */
    public java.lang.String getNIHOrgPath() {
        return NIHOrgPath;
    }


    /**
     * Sets the NIHOrgPath value for this NEDPerson.
     * 
     * @param NIHOrgPath
     */
    public void setNIHOrgPath(java.lang.String NIHOrgPath) {
        this.NIHOrgPath = NIHOrgPath;
    }


    /**
     * Gets the NIHSAC value for this NEDPerson.
     * 
     * @return NIHSAC
     */
    public java.lang.String getNIHSAC() {
        return NIHSAC;
    }


    /**
     * Sets the NIHSAC value for this NEDPerson.
     * 
     * @param NIHSAC
     */
    public void setNIHSAC(java.lang.String NIHSAC) {
        this.NIHSAC = NIHSAC;
    }


    /**
     * Gets the NIHSSO value for this NEDPerson.
     * 
     * @return NIHSSO
     */
    public gov.nih.www.NEDPersonV3.NIHSSO getNIHSSO() {
        return NIHSSO;
    }


    /**
     * Sets the NIHSSO value for this NEDPerson.
     * 
     * @param NIHSSO
     */
    public void setNIHSSO(gov.nih.www.NEDPersonV3.NIHSSO NIHSSO) {
        this.NIHSSO = NIHSSO;
    }


    /**
     * Gets the NIHSummerStatus value for this NEDPerson.
     * 
     * @return NIHSummerStatus   * Summer Student at the NIH?
     */
    public java.lang.String getNIHSummerStatus() {
        return NIHSummerStatus;
    }


    /**
     * Sets the NIHSummerStatus value for this NEDPerson.
     * 
     * @param NIHSummerStatus   * Summer Student at the NIH?
     */
    public void setNIHSummerStatus(java.lang.String NIHSummerStatus) {
        this.NIHSummerStatus = NIHSummerStatus;
    }


    /**
     * Gets the names value for this NEDPerson.
     * 
     * @return names
     */
    public gov.nih.www.NEDPersonV3.Name[] getNames() {
        return names;
    }


    /**
     * Sets the names value for this NEDPerson.
     * 
     * @param names
     */
    public void setNames(gov.nih.www.NEDPersonV3.Name[] names) {
        this.names = names;
    }


    /**
     * Gets the organizationalStatus value for this NEDPerson.
     * 
     * @return organizationalStatus
     */
    public java.lang.String getOrganizationalStatus() {
        return organizationalStatus;
    }


    /**
     * Sets the organizationalStatus value for this NEDPerson.
     * 
     * @param organizationalStatus
     */
    public void setOrganizationalStatus(java.lang.String organizationalStatus) {
        this.organizationalStatus = organizationalStatus;
    }


    /**
     * Gets the phoneNumbers value for this NEDPerson.
     * 
     * @return phoneNumbers
     */
    public gov.nih.www.NEDPersonV3.PhoneNumber[] getPhoneNumbers() {
        return phoneNumbers;
    }


    /**
     * Sets the phoneNumbers value for this NEDPerson.
     * 
     * @param phoneNumbers
     */
    public void setPhoneNumbers(gov.nih.www.NEDPersonV3.PhoneNumber[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }


    /**
     * Gets the secretaryID value for this NEDPerson.
     * 
     * @return secretaryID
     */
    public java.lang.String getSecretaryID() {
        return secretaryID;
    }


    /**
     * Sets the secretaryID value for this NEDPerson.
     * 
     * @param secretaryID
     */
    public void setSecretaryID(java.lang.String secretaryID) {
        this.secretaryID = secretaryID;
    }


    /**
     * Gets the title value for this NEDPerson.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this NEDPerson.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the trackingData value for this NEDPerson.
     * 
     * @return trackingData
     */
    public gov.nih.www.NEDPersonV3.TrackingData getTrackingData() {
        return trackingData;
    }


    /**
     * Sets the trackingData value for this NEDPerson.
     * 
     * @param trackingData
     */
    public void setTrackingData(gov.nih.www.NEDPersonV3.TrackingData trackingData) {
        this.trackingData = trackingData;
    }


    /**
     * Gets the uniqueidentifier value for this NEDPerson.
     * 
     * @return uniqueidentifier
     */
    public java.lang.String getUniqueidentifier() {
        return uniqueidentifier;
    }


    /**
     * Sets the uniqueidentifier value for this NEDPerson.
     * 
     * @param uniqueidentifier
     */
    public void setUniqueidentifier(java.lang.String uniqueidentifier) {
        this.uniqueidentifier = uniqueidentifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NEDPerson)) return false;
        NEDPerson other = (NEDPerson) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addresses==null && other.getAddresses()==null) || 
             (this.addresses!=null &&
              java.util.Arrays.equals(this.addresses, other.getAddresses()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.emailAddresses==null && other.getEmailAddresses()==null) || 
             (this.emailAddresses!=null &&
              java.util.Arrays.equals(this.emailAddresses, other.getEmailAddresses()))) &&
            ((this.managerID==null && other.getManagerID()==null) || 
             (this.managerID!=null &&
              this.managerID.equals(other.getManagerID()))) &&
            ((this.NIHBadge==null && other.getNIHBadge()==null) || 
             (this.NIHBadge!=null &&
              this.NIHBadge.equals(other.getNIHBadge()))) &&
            ((this.NIHDUPUID==null && other.getNIHDUPUID()==null) || 
             (this.NIHDUPUID!=null &&
              this.NIHDUPUID.equals(other.getNIHDUPUID()))) &&
            ((this.NIHDirEntryNoPrint==null && other.getNIHDirEntryNoPrint()==null) || 
             (this.NIHDirEntryNoPrint!=null &&
              this.NIHDirEntryNoPrint.equals(other.getNIHDirEntryNoPrint()))) &&
            ((this.NIHDirEntryUnlist==null && other.getNIHDirEntryUnlist()==null) || 
             (this.NIHDirEntryUnlist!=null &&
              this.NIHDirEntryUnlist.equals(other.getNIHDirEntryUnlist()))) &&
            ((this.NIHIPD==null && other.getNIHIPD()==null) || 
             (this.NIHIPD!=null &&
              this.NIHIPD.equals(other.getNIHIPD()))) &&
            ((this.NIHLibraryAuth==null && other.getNIHLibraryAuth()==null) || 
             (this.NIHLibraryAuth!=null &&
              this.NIHLibraryAuth.equals(other.getNIHLibraryAuth()))) &&
            ((this.NIHOUAcronym==null && other.getNIHOUAcronym()==null) || 
             (this.NIHOUAcronym!=null &&
              this.NIHOUAcronym.equals(other.getNIHOUAcronym()))) &&
            ((this.NIHOUName==null && other.getNIHOUName()==null) || 
             (this.NIHOUName!=null &&
              this.NIHOUName.equals(other.getNIHOUName()))) &&
            ((this.NIHOrgAcronym==null && other.getNIHOrgAcronym()==null) || 
             (this.NIHOrgAcronym!=null &&
              this.NIHOrgAcronym.equals(other.getNIHOrgAcronym()))) &&
            ((this.NIHOrgName==null && other.getNIHOrgName()==null) || 
             (this.NIHOrgName!=null &&
              this.NIHOrgName.equals(other.getNIHOrgName()))) &&
            ((this.NIHOrgPath==null && other.getNIHOrgPath()==null) || 
             (this.NIHOrgPath!=null &&
              this.NIHOrgPath.equals(other.getNIHOrgPath()))) &&
            ((this.NIHSAC==null && other.getNIHSAC()==null) || 
             (this.NIHSAC!=null &&
              this.NIHSAC.equals(other.getNIHSAC()))) &&
            ((this.NIHSSO==null && other.getNIHSSO()==null) || 
             (this.NIHSSO!=null &&
              this.NIHSSO.equals(other.getNIHSSO()))) &&
            ((this.NIHSummerStatus==null && other.getNIHSummerStatus()==null) || 
             (this.NIHSummerStatus!=null &&
              this.NIHSummerStatus.equals(other.getNIHSummerStatus()))) &&
            ((this.names==null && other.getNames()==null) || 
             (this.names!=null &&
              java.util.Arrays.equals(this.names, other.getNames()))) &&
            ((this.organizationalStatus==null && other.getOrganizationalStatus()==null) || 
             (this.organizationalStatus!=null &&
              this.organizationalStatus.equals(other.getOrganizationalStatus()))) &&
            ((this.phoneNumbers==null && other.getPhoneNumbers()==null) || 
             (this.phoneNumbers!=null &&
              java.util.Arrays.equals(this.phoneNumbers, other.getPhoneNumbers()))) &&
            ((this.secretaryID==null && other.getSecretaryID()==null) || 
             (this.secretaryID!=null &&
              this.secretaryID.equals(other.getSecretaryID()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.trackingData==null && other.getTrackingData()==null) || 
             (this.trackingData!=null &&
              this.trackingData.equals(other.getTrackingData()))) &&
            ((this.uniqueidentifier==null && other.getUniqueidentifier()==null) || 
             (this.uniqueidentifier!=null &&
              this.uniqueidentifier.equals(other.getUniqueidentifier())));
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
        if (getAddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEmailAddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmailAddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmailAddresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManagerID() != null) {
            _hashCode += getManagerID().hashCode();
        }
        if (getNIHBadge() != null) {
            _hashCode += getNIHBadge().hashCode();
        }
        if (getNIHDUPUID() != null) {
            _hashCode += getNIHDUPUID().hashCode();
        }
        if (getNIHDirEntryNoPrint() != null) {
            _hashCode += getNIHDirEntryNoPrint().hashCode();
        }
        if (getNIHDirEntryUnlist() != null) {
            _hashCode += getNIHDirEntryUnlist().hashCode();
        }
        if (getNIHIPD() != null) {
            _hashCode += getNIHIPD().hashCode();
        }
        if (getNIHLibraryAuth() != null) {
            _hashCode += getNIHLibraryAuth().hashCode();
        }
        if (getNIHOUAcronym() != null) {
            _hashCode += getNIHOUAcronym().hashCode();
        }
        if (getNIHOUName() != null) {
            _hashCode += getNIHOUName().hashCode();
        }
        if (getNIHOrgAcronym() != null) {
            _hashCode += getNIHOrgAcronym().hashCode();
        }
        if (getNIHOrgName() != null) {
            _hashCode += getNIHOrgName().hashCode();
        }
        if (getNIHOrgPath() != null) {
            _hashCode += getNIHOrgPath().hashCode();
        }
        if (getNIHSAC() != null) {
            _hashCode += getNIHSAC().hashCode();
        }
        if (getNIHSSO() != null) {
            _hashCode += getNIHSSO().hashCode();
        }
        if (getNIHSummerStatus() != null) {
            _hashCode += getNIHSummerStatus().hashCode();
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
        if (getOrganizationalStatus() != null) {
            _hashCode += getOrganizationalStatus().hashCode();
        }
        if (getPhoneNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhoneNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhoneNumbers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSecretaryID() != null) {
            _hashCode += getSecretaryID().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getTrackingData() != null) {
            _hashCode += getTrackingData().hashCode();
        }
        if (getUniqueidentifier() != null) {
            _hashCode += getUniqueidentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NEDPerson.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">NEDPerson"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addresses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "Addresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">Addresses"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddresses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "EmailAddresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">EmailAddresses"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "ManagerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIHBadge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "NIHBadge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">NIHBadge"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIHDUPUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "NIHDUPUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIHDirEntryNoPrint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "NIHDirEntryNoPrint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIHDirEntryUnlist");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "NIHDirEntryUnlist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIHIPD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "NIHIPD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIHLibraryAuth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "NIHLibraryAuth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("NIHOrgAcronym");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "NIHOrgAcronym"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIHOrgName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "NIHOrgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIHOrgPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "NIHOrgPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIHSAC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "NIHSAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("NIHSummerStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "NIHSummerStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("organizationalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "OrganizationalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "PhoneNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">PhoneNumbers"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secretaryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "SecretaryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("trackingData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "TrackingData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">TrackingData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueidentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "Uniqueidentifier"));
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
