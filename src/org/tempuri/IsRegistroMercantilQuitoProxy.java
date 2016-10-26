package org.tempuri;

public class IsRegistroMercantilQuitoProxy implements org.tempuri.IsRegistroMercantilQuito {
  private String _endpoint = null;
  private org.tempuri.IsRegistroMercantilQuito isRegistroMercantilQuito = null;
  
  public IsRegistroMercantilQuitoProxy() {
    _initIsRegistroMercantilQuitoProxy();
  }
  
  public IsRegistroMercantilQuitoProxy(String endpoint) {
    _endpoint = endpoint;
    _initIsRegistroMercantilQuitoProxy();
  }
  
  private void _initIsRegistroMercantilQuitoProxy() {
    try {
      isRegistroMercantilQuito = (new org.tempuri.SRegistroMercantilQuitoLocator()).getBasicHttpBinding_IsRegistroMercantilQuito();
      if (isRegistroMercantilQuito != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)isRegistroMercantilQuito)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)isRegistroMercantilQuito)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (isRegistroMercantilQuito != null)
      ((javax.xml.rpc.Stub)isRegistroMercantilQuito)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.IsRegistroMercantilQuito getIsRegistroMercantilQuito() {
    if (isRegistroMercantilQuito == null)
      _initIsRegistroMercantilQuitoProxy();
    return isRegistroMercantilQuito;
  }
  
  public org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoRetornoMetodo1 consultarTramitesInscripcion(org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.ParametroEntradaMetodo1 entrada) throws java.rmi.RemoteException{
    if (isRegistroMercantilQuito == null)
      _initIsRegistroMercantilQuitoProxy();
    return isRegistroMercantilQuito.consultarTramitesInscripcion(entrada);
  }
  
  public org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoRetornoMetodo2 consultarTramitesCertificacion(org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.ParametroEntradaMetodo2 entrada) throws java.rmi.RemoteException{
    if (isRegistroMercantilQuito == null)
      _initIsRegistroMercantilQuitoProxy();
    return isRegistroMercantilQuito.consultarTramitesCertificacion(entrada);
  }
  
  
}