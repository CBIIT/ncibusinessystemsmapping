package com.example.xmlns._1343670296756;

public class PortTypeProxy implements com.example.xmlns._1343670296756.PortType {
  private String _endpoint = null;
  private com.example.xmlns._1343670296756.PortType portType = null;
  
  public PortTypeProxy() {
    _initPortTypeProxy();
  }
  
  public PortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initPortTypeProxy();
  }
  
  private void _initPortTypeProxy() {
    try {
      portType = (new com.example.xmlns._1343670296756.NEDPersonV3ServiceagentLocator()).getPortTypeEndpoint0();
      if (portType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)portType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)portType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (portType != null)
      ((javax.xml.rpc.Stub)portType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.example.xmlns._1343670296756.PortType getPortType() {
    if (portType == null)
      _initPortTypeProxy();
    return portType;
  }
  
  public gov.nih.www.NEDPersonV3.PersonRecord byNIHId(com.example.xmlns.unique._default.namespace.NIHID.NIHID part1) throws java.rmi.RemoteException{
    if (portType == null)
      _initPortTypeProxy();
    return portType.byNIHId(part1);
  }
  
  public gov.nih.www.NEDPersonV3.PersonRecord byADaccount(com.example.xmlns.unique._default.namespace._1161262663564.PersonId part1) throws java.rmi.RemoteException{
    if (portType == null)
      _initPortTypeProxy();
    return portType.byADaccount(part1);
  }
  
  public gov.nih.www.NEDPersonV3.PersonRecordBase bySAC(com.tibco.www.schemas.Utility1.NEDPerson.Schemas.Schema_xsd.Parm_List part2) throws java.rmi.RemoteException{
    if (portType == null)
      _initPortTypeProxy();
    return portType.bySAC(part2);
  }
  
  public gov.nih.www.NEDPersonV3.PersonRecord[] byNIHidMultiple(java.lang.String[] part1) throws java.rmi.RemoteException{
    if (portType == null)
      _initPortTypeProxy();
    return portType.byNIHidMultiple(part1);
  }
  
  public void hCheck(javax.xml.rpc.holders.StringHolder part1) throws java.rmi.RemoteException{
    if (portType == null)
      _initPortTypeProxy();
    portType.hCheck(part1);
  }
  
  public gov.nih.www.NEDPersonV3.NEDPersonWithPI byNIHidWithPI(com.example.xmlns.unique._default.namespace.NIHID.NIHID part1) throws java.rmi.RemoteException{
    if (portType == null)
      _initPortTypeProxy();
    return portType.byNIHidWithPI(part1);
  }
  
  public gov.nih.www.NEDPersonV3.PersonRecordBase byIC(com.tibco.www.schemas.Utility1.NEDPerson.Schemas.Schema_xsd.Parm_List part1) throws java.rmi.RemoteException{
    if (portType == null)
      _initPortTypeProxy();
    return portType.byIC(part1);
  }
  
  public gov.nih.www.NEDPersonV3.PersonRecordBase byName(com.example.xmlns.unique._default.namespace._1161970036324.FullName part1) throws java.rmi.RemoteException{
    if (portType == null)
      _initPortTypeProxy();
    return portType.byName(part1);
  }
  
  
}