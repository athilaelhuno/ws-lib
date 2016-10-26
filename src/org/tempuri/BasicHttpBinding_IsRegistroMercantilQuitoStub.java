/**
 * BasicHttpBinding_IsRegistroMercantilQuitoStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class BasicHttpBinding_IsRegistroMercantilQuitoStub extends org.apache.axis.client.Stub implements org.tempuri.IsRegistroMercantilQuito {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[2];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConsultarTramitesInscripcion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "entrada"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Parametro.EntradaMetodo1"), org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.ParametroEntradaMetodo1.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.RetornoMetodo1"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoRetornoMetodo1.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "ConsultarTramitesInscripcionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConsultarTramitesCertificacion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "entrada"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Parametro.EntradaMetodo2"), org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.ParametroEntradaMetodo2.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.RetornoMetodo2"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoRetornoMetodo2.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "ConsultarTramitesCertificacionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

    }

    public BasicHttpBinding_IsRegistroMercantilQuitoStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BasicHttpBinding_IsRegistroMercantilQuitoStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_IsRegistroMercantilQuitoStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "ArrayOfRetorno.ActoInscrito");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoActoInscrito[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.ActoInscrito");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.ActoInscrito");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "ArrayOfRetorno.Bien");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoBien[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.Bien");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.Bien");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "ArrayOfRetorno.Compareciente");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoCompareciente[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.Compareciente");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.Compareciente");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "ArrayOfRetorno.Representante");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoRepresentante[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.Representante");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.Representante");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "ArrayOfRetorno.TramiteCertificacion");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoTramiteCertificacion[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.TramiteCertificacion");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.TramiteCertificacion");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "ArrayOfRetorno.TramiteRetorno");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoTramiteRetorno[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.TramiteRetorno");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.TramiteRetorno");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Parametro.EntradaMetodo1");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.ParametroEntradaMetodo1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Parametro.EntradaMetodo2");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.ParametroEntradaMetodo2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.ActoInscrito");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoActoInscrito.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.Bien");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoBien.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.Compareciente");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoCompareciente.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.Representante");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoRepresentante.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.RetornoMetodo1");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoRetornoMetodo1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.RetornoMetodo2");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoRetornoMetodo2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.TramiteCertificacion");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoTramiteCertificacion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.TramiteRetorno");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoTramiteRetorno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

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

    public org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoRetornoMetodo1 consultarTramitesInscripcion(org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.ParametroEntradaMetodo1 entrada) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IsRegistroMercantilQuito/ConsultarTramitesInscripcion");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "ConsultarTramitesInscripcion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {entrada});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoRetornoMetodo1) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoRetornoMetodo1) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoRetornoMetodo1.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoRetornoMetodo2 consultarTramitesCertificacion(org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.ParametroEntradaMetodo2 entrada) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IsRegistroMercantilQuito/ConsultarTramitesCertificacion");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "ConsultarTramitesCertificacion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {entrada});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoRetornoMetodo2) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoRetornoMetodo2) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoRetornoMetodo2.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
