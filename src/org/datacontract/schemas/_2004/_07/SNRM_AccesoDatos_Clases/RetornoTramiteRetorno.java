/**
 * RetornoTramiteRetorno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases;

public class RetornoTramiteRetorno  implements java.io.Serializable {
    private java.lang.String numeroTramite;

    private java.lang.String tramiteId;

    private org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoActoInscrito[] listaActosInscritos;

    public RetornoTramiteRetorno() {
    }

    public RetornoTramiteRetorno(
           java.lang.String numeroTramite,
           java.lang.String tramiteId,
           org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoActoInscrito[] listaActosInscritos) {
           this.numeroTramite = numeroTramite;
           this.tramiteId = tramiteId;
           this.listaActosInscritos = listaActosInscritos;
    }


    /**
     * Gets the numeroTramite value for this RetornoTramiteRetorno.
     * 
     * @return numeroTramite
     */
    public java.lang.String getNumeroTramite() {
        return numeroTramite;
    }


    /**
     * Sets the numeroTramite value for this RetornoTramiteRetorno.
     * 
     * @param numeroTramite
     */
    public void setNumeroTramite(java.lang.String numeroTramite) {
        this.numeroTramite = numeroTramite;
    }


    /**
     * Gets the tramiteId value for this RetornoTramiteRetorno.
     * 
     * @return tramiteId
     */
    public java.lang.String getTramiteId() {
        return tramiteId;
    }


    /**
     * Sets the tramiteId value for this RetornoTramiteRetorno.
     * 
     * @param tramiteId
     */
    public void setTramiteId(java.lang.String tramiteId) {
        this.tramiteId = tramiteId;
    }


    /**
     * Gets the listaActosInscritos value for this RetornoTramiteRetorno.
     * 
     * @return listaActosInscritos
     */
    public org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoActoInscrito[] getListaActosInscritos() {
        return listaActosInscritos;
    }


    /**
     * Sets the listaActosInscritos value for this RetornoTramiteRetorno.
     * 
     * @param listaActosInscritos
     */
    public void setListaActosInscritos(org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoActoInscrito[] listaActosInscritos) {
        this.listaActosInscritos = listaActosInscritos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetornoTramiteRetorno)) return false;
        RetornoTramiteRetorno other = (RetornoTramiteRetorno) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroTramite==null && other.getNumeroTramite()==null) || 
             (this.numeroTramite!=null &&
              this.numeroTramite.equals(other.getNumeroTramite()))) &&
            ((this.tramiteId==null && other.getTramiteId()==null) || 
             (this.tramiteId!=null &&
              this.tramiteId.equals(other.getTramiteId()))) &&
            ((this.listaActosInscritos==null && other.getListaActosInscritos()==null) || 
             (this.listaActosInscritos!=null &&
              java.util.Arrays.equals(this.listaActosInscritos, other.getListaActosInscritos())));
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
        if (getNumeroTramite() != null) {
            _hashCode += getNumeroTramite().hashCode();
        }
        if (getTramiteId() != null) {
            _hashCode += getTramiteId().hashCode();
        }
        if (getListaActosInscritos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaActosInscritos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaActosInscritos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetornoTramiteRetorno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.TramiteRetorno"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroTramite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "NumeroTramite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tramiteId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "TramiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaActosInscritos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "listaActosInscritos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.ActoInscrito"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.ActoInscrito"));
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
