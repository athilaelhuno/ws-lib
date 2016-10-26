/**
 * ParametroEntradaMetodo2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases;

public class ParametroEntradaMetodo2  implements java.io.Serializable {
    private java.lang.Integer anio;

    private java.lang.Integer numeroTramite;

    public ParametroEntradaMetodo2() {
    }

    public ParametroEntradaMetodo2(
           java.lang.Integer anio,
           java.lang.Integer numeroTramite) {
           this.anio = anio;
           this.numeroTramite = numeroTramite;
    }


    /**
     * Gets the anio value for this ParametroEntradaMetodo2.
     * 
     * @return anio
     */
    public java.lang.Integer getAnio() {
        return anio;
    }


    /**
     * Sets the anio value for this ParametroEntradaMetodo2.
     * 
     * @param anio
     */
    public void setAnio(java.lang.Integer anio) {
        this.anio = anio;
    }


    /**
     * Gets the numeroTramite value for this ParametroEntradaMetodo2.
     * 
     * @return numeroTramite
     */
    public java.lang.Integer getNumeroTramite() {
        return numeroTramite;
    }


    /**
     * Sets the numeroTramite value for this ParametroEntradaMetodo2.
     * 
     * @param numeroTramite
     */
    public void setNumeroTramite(java.lang.Integer numeroTramite) {
        this.numeroTramite = numeroTramite;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParametroEntradaMetodo2)) return false;
        ParametroEntradaMetodo2 other = (ParametroEntradaMetodo2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.anio==null && other.getAnio()==null) || 
             (this.anio!=null &&
              this.anio.equals(other.getAnio()))) &&
            ((this.numeroTramite==null && other.getNumeroTramite()==null) || 
             (this.numeroTramite!=null &&
              this.numeroTramite.equals(other.getNumeroTramite())));
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
        if (getAnio() != null) {
            _hashCode += getAnio().hashCode();
        }
        if (getNumeroTramite() != null) {
            _hashCode += getNumeroTramite().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParametroEntradaMetodo2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Parametro.EntradaMetodo2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Anio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroTramite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "NumeroTramite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
