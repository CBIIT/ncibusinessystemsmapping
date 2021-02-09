/**
 * PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.xmlns._1343670296756;

public interface PortType extends java.rmi.Remote {
    public gov.nih.www.NEDPersonV3.PersonRecord byNIHId(com.example.xmlns.unique._default.namespace.NIHID.NIHID part1) throws java.rmi.RemoteException;
    public gov.nih.www.NEDPersonV3.PersonRecord byADaccount(com.example.xmlns.unique._default.namespace._1161262663564.PersonId part1) throws java.rmi.RemoteException;
    public gov.nih.www.NEDPersonV3.PersonRecordBase bySAC(com.tibco.www.schemas.Utility1.NEDPerson.Schemas.Schema_xsd.Parm_List part2) throws java.rmi.RemoteException;
    public gov.nih.www.NEDPersonV3.PersonRecord[] byNIHidMultiple(java.lang.String[] part1) throws java.rmi.RemoteException;
    public void hCheck(javax.xml.rpc.holders.StringHolder part1) throws java.rmi.RemoteException;
    public gov.nih.www.NEDPersonV3.NEDPersonWithPI byNIHidWithPI(com.example.xmlns.unique._default.namespace.NIHID.NIHID part1) throws java.rmi.RemoteException;
    public gov.nih.www.NEDPersonV3.PersonRecordBase byIC(com.tibco.www.schemas.Utility1.NEDPerson.Schemas.Schema_xsd.Parm_List part1) throws java.rmi.RemoteException;
    public gov.nih.www.NEDPersonV3.PersonRecordBase byName(com.example.xmlns.unique._default.namespace._1161970036324.FullName part1) throws java.rmi.RemoteException;
}
