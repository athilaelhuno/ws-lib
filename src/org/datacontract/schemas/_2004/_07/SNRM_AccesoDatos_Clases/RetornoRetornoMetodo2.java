/**
 * RetornoRetornoMetodo2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases;

public class RetornoRetornoMetodo2  implements java.io.Serializable {
    private java.lang.String codigoMensaje;

    private java.lang.String descripcionMensaje;

    private org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoTramiteCertificacion[] listaTramitesCertificaciones;

    public RetornoRetornoMetodo2() {
    }

    public RetornoRetornoMetodo2(
           java.lang.String codigoMensaje,
           java.lang.String descripcionMensaje,
           org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoTramiteCertificacion[] listaTramitesCertificaciones) {
           this.codigoMensaje = codigoMensaje;
           this.descripcionMensaje = descripcionMensaje;
           this.listaTramitesCertificaciones = listaTramitesCertificaciones;
    }


    /**
     * Gets the codigoMensaje value for this RetornoRetornoMetodo2.
     * 
     * @return codigoMensaje
     */
    public java.lang.String getCodigoMensaje() {
        return codigoMensaje;
    }


    /**
     * Sets the codigoMensaje value for this RetornoRetornoMetodo2.
     * 
     * @param codigoMensaje
     */
    public void setCodigoMensaje(java.lang.String codigoMensaje) {
        this.codigoMensaje = codigoMensaje;
    }


    /**
     * Gets the descripcionMensaje value for this RetornoRetornoMetodo2.
     * 
     * @return descripcionMensaje
     */
    public java.lang.String getDescripcionMensaje() {
        return descripcionMensaje;
    }


    /**
     * Sets the descripcionMensaje value for this RetornoRetornoMetodo2.
     * 
     * @param descripcionMensaje
     */
    public void setDescripcionMensaje(java.lang.String descripcionMensaje) {
        this.descripcionMensaje = descripcionMensaje;
    }


    /**
     * Gets the listaTramitesCertificaciones value for this RetornoRetornoMetodo2.
     * 
     * @return listaTramitesCertificaciones
     */
    public org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoTramiteCertificacion[] getListaTramitesCertificaciones() {
        return listaTramitesCertificaciones;
    }


    /**
     * Sets the listaTramitesCertificaciones value for this RetornoRetornoMetodo2.
     * 
     * @param listaTramitesCertificaciones
     */
    public void setListaTramitesCertificaciones(org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoTramiteCertificacion[] listaTramitesCertificaciones) {
        this.listaTramitesCertificaciones = listaTramitesCertificaciones;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetornoRetornoMetodo2)) return false;
        RetornoRetornoMetodo2 other = (RetornoRetornoMetodo2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoMensaje==null && other.getCodigoMensaje()==null) || 
             (this.codigoMensaje!=null &&
              this.codigoMensaje.equals(other.getCodigoMensaje()))) &&
            ((this.descripcionMensaje==null && other.getDescripcionMensaje()==null) || 
             (this.descripcionMensaje!=null &&
              this.descripcionMensaje.equals(other.getDescripcionMensaje()))) &&
            ((this.listaTramitesCertificaciones==null && other.getListaTramitesCertificaciones()==null) || 
             (this.listaTramitesCertificaciones!=null &&
              java.util.Arrays.equals(this.listaTramitesCertificaciones, other.getListaTramitesCertificaciones())));
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
        if (getCodigoMensaje() != null) {
            _hashCode += getCodigoMensaje().hashCode();
        }
        if (getDescripcionMensaje() != null) {
            _hashCode += getDescripcionMensaje().hashCode();
        }
        if (getListaTramitesCertificaciones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaTramitesCertificaciones());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaTramitesCertificaciones(), i);
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
        new org.apache.axis.description.TypeDesc(RetornoRetornoMetodo2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.RetornoMetodo2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoMensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "codigoMensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionMensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "descripcionMensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaTramitesCertificaciones");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "listaTramitesCertificaciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.TramiteCertificacion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.TramiteCertificacion"));
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
