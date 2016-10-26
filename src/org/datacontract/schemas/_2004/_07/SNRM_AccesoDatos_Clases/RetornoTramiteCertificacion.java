/**
 * RetornoTramiteCertificacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases;

public class RetornoTramiteCertificacion  implements java.io.Serializable {
    private java.lang.String fechaFacturacion;

    private java.lang.String nombreSolicitante;

    private java.lang.String numeroTramiteCertificaciones;

    private java.lang.String tipoTramite;

    private java.lang.String anio;

    public RetornoTramiteCertificacion() {
    }

    public RetornoTramiteCertificacion(
           java.lang.String fechaFacturacion,
           java.lang.String nombreSolicitante,
           java.lang.String numeroTramiteCertificaciones,
           java.lang.String tipoTramite,
           java.lang.String anio) {
           this.fechaFacturacion = fechaFacturacion;
           this.nombreSolicitante = nombreSolicitante;
           this.numeroTramiteCertificaciones = numeroTramiteCertificaciones;
           this.tipoTramite = tipoTramite;
           this.anio = anio;
    }


    /**
     * Gets the fechaFacturacion value for this RetornoTramiteCertificacion.
     * 
     * @return fechaFacturacion
     */
    public java.lang.String getFechaFacturacion() {
        return fechaFacturacion;
    }


    /**
     * Sets the fechaFacturacion value for this RetornoTramiteCertificacion.
     * 
     * @param fechaFacturacion
     */
    public void setFechaFacturacion(java.lang.String fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }


    /**
     * Gets the nombreSolicitante value for this RetornoTramiteCertificacion.
     * 
     * @return nombreSolicitante
     */
    public java.lang.String getNombreSolicitante() {
        return nombreSolicitante;
    }


    /**
     * Sets the nombreSolicitante value for this RetornoTramiteCertificacion.
     * 
     * @param nombreSolicitante
     */
    public void setNombreSolicitante(java.lang.String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }


    /**
     * Gets the numeroTramiteCertificaciones value for this RetornoTramiteCertificacion.
     * 
     * @return numeroTramiteCertificaciones
     */
    public java.lang.String getNumeroTramiteCertificaciones() {
        return numeroTramiteCertificaciones;
    }


    /**
     * Sets the numeroTramiteCertificaciones value for this RetornoTramiteCertificacion.
     * 
     * @param numeroTramiteCertificaciones
     */
    public void setNumeroTramiteCertificaciones(java.lang.String numeroTramiteCertificaciones) {
        this.numeroTramiteCertificaciones = numeroTramiteCertificaciones;
    }


    /**
     * Gets the tipoTramite value for this RetornoTramiteCertificacion.
     * 
     * @return tipoTramite
     */
    public java.lang.String getTipoTramite() {
        return tipoTramite;
    }


    /**
     * Sets the tipoTramite value for this RetornoTramiteCertificacion.
     * 
     * @param tipoTramite
     */
    public void setTipoTramite(java.lang.String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }


    /**
     * Gets the anio value for this RetornoTramiteCertificacion.
     * 
     * @return anio
     */
    public java.lang.String getAnio() {
        return anio;
    }


    /**
     * Sets the anio value for this RetornoTramiteCertificacion.
     * 
     * @param anio
     */
    public void setAnio(java.lang.String anio) {
        this.anio = anio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetornoTramiteCertificacion)) return false;
        RetornoTramiteCertificacion other = (RetornoTramiteCertificacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fechaFacturacion==null && other.getFechaFacturacion()==null) || 
             (this.fechaFacturacion!=null &&
              this.fechaFacturacion.equals(other.getFechaFacturacion()))) &&
            ((this.nombreSolicitante==null && other.getNombreSolicitante()==null) || 
             (this.nombreSolicitante!=null &&
              this.nombreSolicitante.equals(other.getNombreSolicitante()))) &&
            ((this.numeroTramiteCertificaciones==null && other.getNumeroTramiteCertificaciones()==null) || 
             (this.numeroTramiteCertificaciones!=null &&
              this.numeroTramiteCertificaciones.equals(other.getNumeroTramiteCertificaciones()))) &&
            ((this.tipoTramite==null && other.getTipoTramite()==null) || 
             (this.tipoTramite!=null &&
              this.tipoTramite.equals(other.getTipoTramite()))) &&
            ((this.anio==null && other.getAnio()==null) || 
             (this.anio!=null &&
              this.anio.equals(other.getAnio())));
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
        if (getFechaFacturacion() != null) {
            _hashCode += getFechaFacturacion().hashCode();
        }
        if (getNombreSolicitante() != null) {
            _hashCode += getNombreSolicitante().hashCode();
        }
        if (getNumeroTramiteCertificaciones() != null) {
            _hashCode += getNumeroTramiteCertificaciones().hashCode();
        }
        if (getTipoTramite() != null) {
            _hashCode += getTipoTramite().hashCode();
        }
        if (getAnio() != null) {
            _hashCode += getAnio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetornoTramiteCertificacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.TramiteCertificacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaFacturacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "FechaFacturacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreSolicitante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "NombreSolicitante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroTramiteCertificaciones");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "NumeroTramiteCertificaciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoTramite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "TipoTramite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "anio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
