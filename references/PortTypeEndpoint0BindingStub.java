/**
 * PortTypeEndpoint0BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.xmlns._1343670296756;

public class PortTypeEndpoint0BindingStub extends org.apache.axis.client.Stub implements com.example.xmlns._1343670296756.PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[8];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ByNIHId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.example.com/unique/default/namespace/NIHID", "NIH-ID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xmlns.example.com/unique/default/namespace/NIHID", ">NIH-ID"), com.example.xmlns.unique._default.namespace.NIHID.NIHID.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">PersonRecord"));
        oper.setReturnClass(gov.nih.www.NEDPersonV3.PersonRecord.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "PersonRecord"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ByADaccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.example.com/unique/default/namespace/1161262663564", "PersonId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xmlns.example.com/unique/default/namespace/1161262663564", ">PersonId"), com.example.xmlns.unique._default.namespace._1161262663564.PersonId.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">PersonRecord"));
        oper.setReturnClass(gov.nih.www.NEDPersonV3.PersonRecord.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "PersonRecord"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BySAC");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.tibco.com/schemas/Utility1/NEDPerson/Schemas/Schema.xsd", "Parm_List"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.tibco.com/schemas/Utility1/NEDPerson/Schemas/Schema.xsd", ">Parm_List"), com.tibco.www.schemas.Utility1.NEDPerson.Schemas.Schema_xsd.Parm_List.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">PersonRecordBase"));
        oper.setReturnClass(gov.nih.www.NEDPersonV3.PersonRecordBase.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "PersonRecordBase"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ByNIHidMultiple");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.tibco.com/schemas/Utility1/NEDPerson/Schemas/Schema.xsd", "NIHidMultiple"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.tibco.com/schemas/Utility1/NEDPerson/Schemas/Schema.xsd", ">NIHidMultiple"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">PersonsRecord"));
        oper.setReturnClass(gov.nih.www.NEDPersonV3.PersonRecord[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "PersonsRecord"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("hCheck");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.tibco.com/schemas/Utility1/NEDPerson/Schemas/Schema.xsd", "Text"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ByNIHidWithPI");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.example.com/unique/default/namespace/NIHID", "NIH-ID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xmlns.example.com/unique/default/namespace/NIHID", ">NIH-ID"), com.example.xmlns.unique._default.namespace.NIHID.NIHID.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">NEDPersonWithPI"));
        oper.setReturnClass(gov.nih.www.NEDPersonV3.NEDPersonWithPI.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "NEDPersonWithPI"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ByIC");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.tibco.com/schemas/Utility1/NEDPerson/Schemas/Schema.xsd", "Parm_List"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.tibco.com/schemas/Utility1/NEDPerson/Schemas/Schema.xsd", ">Parm_List"), com.tibco.www.schemas.Utility1.NEDPerson.Schemas.Schema_xsd.Parm_List.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">PersonRecordBase"));
        oper.setReturnClass(gov.nih.www.NEDPersonV3.PersonRecordBase.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "PersonRecordBase"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ByName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.example.com/unique/default/namespace/1161970036324", "FullName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xmlns.example.com/unique/default/namespace/1161970036324", ">FullName"), com.example.xmlns.unique._default.namespace._1161970036324.FullName.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">PersonRecordBase"));
        oper.setReturnClass(gov.nih.www.NEDPersonV3.PersonRecordBase.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "PersonRecordBase"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

    }

    public PortTypeEndpoint0BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public PortTypeEndpoint0BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PortTypeEndpoint0BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">Address");
            cachedSerQNames.add(qName);
            cls = gov.nih.www.NEDPersonV3.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">Addresses");
            cachedSerQNames.add(qName);
            cls = gov.nih.www.NEDPersonV3.Address[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "Address");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">AddressType");
            cachedSerQNames.add(qName);
            cls = gov.nih.www.NEDPersonV3.AddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">EmailAddress");
            cachedSerQNames.add(qName);
            cls = gov.nih.www.NEDPersonV3.EmailAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">EmailAddresses");
            cachedSerQNames.add(qName);
            cls = gov.nih.www.NEDPersonV3.EmailAddress[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "EmailAddress");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">EmailAddressType");
            cachedSerQNames.add(qName);
            cls = gov.nih.www.NEDPersonV3.EmailAddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">Name");
            cachedSerQNames.add(qName);
            cls = gov.nih.www.NEDPersonV3.Name.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">Names");
            cachedSerQNames.add(qName);
            cls = gov.nih.www.NEDPersonV3.Name[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "Name");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">NameType");
            cachedSerQNames.add(qName);
            cls = gov.nih.www.NEDPersonV3.NameType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">NEDPerson");
            cachedSerQNames.add(qName);
            cls = gov.nih.www.NEDPersonV3.NEDPerson.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">NEDPersonBase");
            cachedSerQNames.add(qName);
            cls = gov.nih.www.NEDPersonV3.NEDPersonBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">NEDPersonWithPI");
            cachedSerQNames.add(qName);
            cls = gov.nih.www.NEDPersonV3.NEDPersonWithPI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">NIHBadge");
            cachedSerQNames.add(qName);
            cls = gov.nih.www.NEDPersonV3.NIHBadge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">NIHPrivacy");
            cachedSerQNames.add(qName);
            cls = gov.nih.www.NEDPersonV3.NIHPrivacy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">NIHSSO");
            cachedSerQNames.add(qName);
            cls = gov.nih.www.NEDPersonV3.NIHSSO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">PersonRecord");
            cachedSerQNames.add(qName);
            cls = gov.nih.www.NEDPersonV3.PersonRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">PersonRecordBase");
            cachedSerQNames.add(qName);
            cls = gov.nih.www.NEDPersonV3.PersonRecordBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">PersonsRecord");
            cachedSerQNames.add(qName);
            cls = gov.nih.www.NEDPersonV3.PersonRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "PersonRecord");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">PhoneNumber");
            cachedSerQNames.add(qName);
            cls = gov.nih.www.NEDPersonV3.PhoneNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">PhoneNumbers");
            cachedSerQNames.add(qName);
            cls = gov.nih.www.NEDPersonV3.PhoneNumber[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", "PhoneNumber");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">PhoneNumberType");
            cachedSerQNames.add(qName);
            cls = gov.nih.www.NEDPersonV3.PhoneNumberType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.nih.gov/NEDPersonV3", ">TrackingData");
            cachedSerQNames.add(qName);
            cls = gov.nih.www.NEDPersonV3.TrackingData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.tibco.com/schemas/Utility1/NEDPerson/Schemas/Schema.xsd", ">NIHidMultiple");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.tibco.com/schemas/Utility1/NEDPerson/Schemas/Schema.xsd", "NIHID");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.tibco.com/schemas/Utility1/NEDPerson/Schemas/Schema.xsd", ">OrganizationalStat");
            cachedSerQNames.add(qName);
            cls = com.tibco.www.schemas.Utility1.NEDPerson.Schemas.Schema_xsd.OrganizationalStat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.tibco.com/schemas/Utility1/NEDPerson/Schemas/Schema.xsd", ">Parm_List");
            cachedSerQNames.add(qName);
            cls = com.tibco.www.schemas.Utility1.NEDPerson.Schemas.Schema_xsd.Parm_List.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.example.com/unique/default/namespace/1161262663564", ">PersonId");
            cachedSerQNames.add(qName);
            cls = com.example.xmlns.unique._default.namespace._1161262663564.PersonId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.example.com/unique/default/namespace/1161970036324", ">FullName");
            cachedSerQNames.add(qName);
            cls = com.example.xmlns.unique._default.namespace._1161970036324.FullName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.example.com/unique/default/namespace/NIHID", ">NIH-ID");
            cachedSerQNames.add(qName);
            cls = com.example.xmlns.unique._default.namespace.NIHID.NIHID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public gov.nih.www.NEDPersonV3.PersonRecord byNIHId(com.example.xmlns.unique._default.namespace.NIHID.NIHID part1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/NEDPerson/NEDPersonV3/NEDPersonV3.serviceagent/PortTypeEndpoint0/ByNIHId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ByNIHId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {part1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gov.nih.www.NEDPersonV3.PersonRecord) _resp;
            } catch (java.lang.Exception _exception) {
                return (gov.nih.www.NEDPersonV3.PersonRecord) org.apache.axis.utils.JavaUtils.convert(_resp, gov.nih.www.NEDPersonV3.PersonRecord.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public gov.nih.www.NEDPersonV3.PersonRecord byADaccount(com.example.xmlns.unique._default.namespace._1161262663564.PersonId part1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/NEDPerson/NEDPersonV3/NEDPersonV3.serviceagent/PortTypeEndpoint0/ByADaccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ByADaccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {part1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gov.nih.www.NEDPersonV3.PersonRecord) _resp;
            } catch (java.lang.Exception _exception) {
                return (gov.nih.www.NEDPersonV3.PersonRecord) org.apache.axis.utils.JavaUtils.convert(_resp, gov.nih.www.NEDPersonV3.PersonRecord.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public gov.nih.www.NEDPersonV3.PersonRecordBase bySAC(com.tibco.www.schemas.Utility1.NEDPerson.Schemas.Schema_xsd.Parm_List part2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/NEDPerson/NEDPersonV3/NEDPersonV3.serviceagent/PortTypeEndpoint0/BySAC");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BySAC"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {part2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gov.nih.www.NEDPersonV3.PersonRecordBase) _resp;
            } catch (java.lang.Exception _exception) {
                return (gov.nih.www.NEDPersonV3.PersonRecordBase) org.apache.axis.utils.JavaUtils.convert(_resp, gov.nih.www.NEDPersonV3.PersonRecordBase.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public gov.nih.www.NEDPersonV3.PersonRecord[] byNIHidMultiple(java.lang.String[] part1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/NEDPerson/NEDPersonV3/NEDPersonV3.serviceagent/PortTypeEndpoint0/ByNIHidMultiple");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ByNIHidMultiple"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {part1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gov.nih.www.NEDPersonV3.PersonRecord[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (gov.nih.www.NEDPersonV3.PersonRecord[]) org.apache.axis.utils.JavaUtils.convert(_resp, gov.nih.www.NEDPersonV3.PersonRecord[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void hCheck(javax.xml.rpc.holders.StringHolder part1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/NEDPerson/NEDPersonV3/NEDPersonV3.serviceagent/PortTypeEndpoint0/hCheck");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "hCheck"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {part1.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                part1.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://www.tibco.com/schemas/Utility1/NEDPerson/Schemas/Schema.xsd", "Text"));
            } catch (java.lang.Exception _exception) {
                part1.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.tibco.com/schemas/Utility1/NEDPerson/Schemas/Schema.xsd", "Text")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public gov.nih.www.NEDPersonV3.NEDPersonWithPI byNIHidWithPI(com.example.xmlns.unique._default.namespace.NIHID.NIHID part1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/NEDPerson/NEDPersonV3/NEDPersonV3.serviceagent/PortTypeEndpoint0/ByNIHidWithPI");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ByNIHidWithPI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {part1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gov.nih.www.NEDPersonV3.NEDPersonWithPI) _resp;
            } catch (java.lang.Exception _exception) {
                return (gov.nih.www.NEDPersonV3.NEDPersonWithPI) org.apache.axis.utils.JavaUtils.convert(_resp, gov.nih.www.NEDPersonV3.NEDPersonWithPI.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public gov.nih.www.NEDPersonV3.PersonRecordBase byIC(com.tibco.www.schemas.Utility1.NEDPerson.Schemas.Schema_xsd.Parm_List part1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/NEDPerson/NEDPersonV3/NEDPersonV3.serviceagent/PortTypeEndpoint0/ByIC");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ByIC"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {part1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gov.nih.www.NEDPersonV3.PersonRecordBase) _resp;
            } catch (java.lang.Exception _exception) {
                return (gov.nih.www.NEDPersonV3.PersonRecordBase) org.apache.axis.utils.JavaUtils.convert(_resp, gov.nih.www.NEDPersonV3.PersonRecordBase.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public gov.nih.www.NEDPersonV3.PersonRecordBase byName(com.example.xmlns.unique._default.namespace._1161970036324.FullName part1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/NEDPerson/NEDPersonV3/NEDPersonV3.serviceagent/PortTypeEndpoint0/ByName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ByName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {part1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gov.nih.www.NEDPersonV3.PersonRecordBase) _resp;
            } catch (java.lang.Exception _exception) {
                return (gov.nih.www.NEDPersonV3.PersonRecordBase) org.apache.axis.utils.JavaUtils.convert(_resp, gov.nih.www.NEDPersonV3.PersonRecordBase.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
