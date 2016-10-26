/**
 * RetornoCompareciente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases;

public class RetornoCompareciente  implements java.io.Serializable {
    private java.lang.String apellidos;

    private java.lang.String calidadComparece;

    private java.lang.String nombres;

    private java.lang.String numeroidentificacion;

    private java.lang.String tipoIdentificacion;

    public RetornoCompareciente() {
    }

    public RetornoCompareciente(
           java.lang.String apellidos,
           java.lang.String calidadComparece,
           java.lang.String nombres,
           java.lang.String numeroidentificacion,
           java.lang.String tipoIdentificacion) {
           this.apellidos = apellidos;
           this.calidadComparece = calidadComparece;
           this.nombres = nombres;
           this.numeroidentificacion = numeroidentificacion;
           this.tipoIdentificacion = tipoIdentificacion;
    }


    /**
     * Gets the apellidos value for this RetornoCompareciente.
     * 
     * @return apellidos
     */
    public java.lang.String getApellidos() {
        return apellidos;
    }


    /**
     * Sets the apellidos value for this RetornoCompareciente.
     * 
     * @param apellidos
     */
    public void setApellidos(java.lang.String apellidos) {
        this.apellidos = apellidos;
    }


    /**
     * Gets the calidadComparece value for this RetornoCompareciente.
     * 
     * @return calidadComparece
     */
    public java.lang.String getCalidadComparece() {
        return calidadComparece;
    }


    /**
     * Sets the calidadComparece value for this RetornoCompareciente.
     * 
     * @param calidadComparece
     */
    public void setCalidadComparece(java.lang.String calidadComparece) {
        this.calidadComparece = calidadComparece;
    }


    /**
     * Gets the nombres value for this RetornoCompareciente.
     * 
     * @return nombres
     */
    public java.lang.String getNombres() {
        return nombres;
    }


    /**
     * Sets the nombres value for this RetornoCompareciente.
     * 
     * @param nombres
     */
    public void setNombres(java.lang.String nombres) {
        this.nombres = nombres;
    }


    /**
     * Gets the numeroidentificacion value for this RetornoCompareciente.
     * 
     * @return numeroidentificacion
     */
    public java.lang.String getNumeroidentificacion() {
        return numeroidentificacion;
    }


    /**
     * Sets the numeroidentificacion value for this RetornoCompareciente.
     * 
     * @param numeroidentificacion
     */
    public void setNumeroidentificacion(java.lang.String numeroidentificacion) {
        this.numeroidentificacion = numeroidentificacion;
    }


    /**
     * Gets the tipoIdentificacion value for this RetornoCompareciente.
     * 
     * @return tipoIdentificacion
     */
    public java.lang.String getTipoIdentificacion() {
        return tipoIdentificacion;
    }


    /**
     * Sets the tipoIdentificacion value for this RetornoCompareciente.
     * 
     * @param tipoIdentificacion
     */
    public void setTipoIdentificacion(java.lang.String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetornoCompareciente)) return false;
        RetornoCompareciente other = (RetornoCompareciente) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apellidos==null && other.getApellidos()==null) || 
             (this.apellidos!=null &&
              this.apellidos.equals(other.getApellidos()))) &&
            ((this.calidadComparece==null && other.getCalidadComparece()==null) || 
             (this.calidadComparece!=null &&
              this.calidadComparece.equals(other.getCalidadComparece()))) &&
            ((this.nombres==null && other.getNombres()==null) || 
             (this.nombres!=null &&
              this.nombres.equals(other.getNombres()))) &&
            ((this.numeroidentificacion==null && other.getNumeroidentificacion()==null) || 
             (this.numeroidentificacion!=null &&
              this.numeroidentificacion.equals(other.getNumeroidentificacion()))) &&
            ((this.tipoIdentificacion==null && other.getTipoIdentificacion()==null) || 
             (this.tipoIdentificacion!=null &&
              this.tipoIdentificacion.equals(other.getTipoIdentificacion())));
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
        if (getApellidos() != null) {
            _hashCode += getApellidos().hashCode();
        }
        if (getCalidadComparece() != null) {
            _hashCode += getCalidadComparece().hashCode();
        }
        if (getNombres() != null) {
            _hashCode += getNombres().hashCode();
        }
        if (getNumeroidentificacion() != null) {
            _hashCode += getNumeroidentificacion().hashCode();
        }
        if (getTipoIdentificacion() != null) {
            _hashCode += getTipoIdentificacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetornoCompareciente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.Compareciente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellidos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Apellidos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calidadComparece");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "CalidadComparece"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombres");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Nombres"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroidentificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Numeroidentificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoIdentificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "TipoIdentificacion"));
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
