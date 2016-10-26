/**
 * ParametroEntradaMetodo1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases;

public class ParametroEntradaMetodo1  implements java.io.Serializable {
    private java.lang.String apellidos;

    private java.lang.String chasis;

    private java.lang.String fechaInscripcion;

    private java.lang.String libro;

    private java.lang.String motor;

    private java.lang.String nombres;

    private java.lang.String numeroIdentificacion;

    private java.lang.String numeroInscripcion;

    private java.lang.String tipoIdentificacion;

    public ParametroEntradaMetodo1() {
    }

    public ParametroEntradaMetodo1(
           java.lang.String apellidos,
           java.lang.String chasis,
           java.lang.String fechaInscripcion,
           java.lang.String libro,
           java.lang.String motor,
           java.lang.String nombres,
           java.lang.String numeroIdentificacion,
           java.lang.String numeroInscripcion,
           java.lang.String tipoIdentificacion) {
           this.apellidos = apellidos;
           this.chasis = chasis;
           this.fechaInscripcion = fechaInscripcion;
           this.libro = libro;
           this.motor = motor;
           this.nombres = nombres;
           this.numeroIdentificacion = numeroIdentificacion;
           this.numeroInscripcion = numeroInscripcion;
           this.tipoIdentificacion = tipoIdentificacion;
    }


    /**
     * Gets the apellidos value for this ParametroEntradaMetodo1.
     * 
     * @return apellidos
     */
    public java.lang.String getApellidos() {
        return apellidos;
    }


    /**
     * Sets the apellidos value for this ParametroEntradaMetodo1.
     * 
     * @param apellidos
     */
    public void setApellidos(java.lang.String apellidos) {
        this.apellidos = apellidos;
    }


    /**
     * Gets the chasis value for this ParametroEntradaMetodo1.
     * 
     * @return chasis
     */
    public java.lang.String getChasis() {
        return chasis;
    }


    /**
     * Sets the chasis value for this ParametroEntradaMetodo1.
     * 
     * @param chasis
     */
    public void setChasis(java.lang.String chasis) {
        this.chasis = chasis;
    }


    /**
     * Gets the fechaInscripcion value for this ParametroEntradaMetodo1.
     * 
     * @return fechaInscripcion
     */
    public java.lang.String getFechaInscripcion() {
        return fechaInscripcion;
    }


    /**
     * Sets the fechaInscripcion value for this ParametroEntradaMetodo1.
     * 
     * @param fechaInscripcion
     */
    public void setFechaInscripcion(java.lang.String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }


    /**
     * Gets the libro value for this ParametroEntradaMetodo1.
     * 
     * @return libro
     */
    public java.lang.String getLibro() {
        return libro;
    }


    /**
     * Sets the libro value for this ParametroEntradaMetodo1.
     * 
     * @param libro
     */
    public void setLibro(java.lang.String libro) {
        this.libro = libro;
    }


    /**
     * Gets the motor value for this ParametroEntradaMetodo1.
     * 
     * @return motor
     */
    public java.lang.String getMotor() {
        return motor;
    }


    /**
     * Sets the motor value for this ParametroEntradaMetodo1.
     * 
     * @param motor
     */
    public void setMotor(java.lang.String motor) {
        this.motor = motor;
    }


    /**
     * Gets the nombres value for this ParametroEntradaMetodo1.
     * 
     * @return nombres
     */
    public java.lang.String getNombres() {
        return nombres;
    }


    /**
     * Sets the nombres value for this ParametroEntradaMetodo1.
     * 
     * @param nombres
     */
    public void setNombres(java.lang.String nombres) {
        this.nombres = nombres;
    }


    /**
     * Gets the numeroIdentificacion value for this ParametroEntradaMetodo1.
     * 
     * @return numeroIdentificacion
     */
    public java.lang.String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }


    /**
     * Sets the numeroIdentificacion value for this ParametroEntradaMetodo1.
     * 
     * @param numeroIdentificacion
     */
    public void setNumeroIdentificacion(java.lang.String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }


    /**
     * Gets the numeroInscripcion value for this ParametroEntradaMetodo1.
     * 
     * @return numeroInscripcion
     */
    public java.lang.String getNumeroInscripcion() {
        return numeroInscripcion;
    }


    /**
     * Sets the numeroInscripcion value for this ParametroEntradaMetodo1.
     * 
     * @param numeroInscripcion
     */
    public void setNumeroInscripcion(java.lang.String numeroInscripcion) {
        this.numeroInscripcion = numeroInscripcion;
    }


    /**
     * Gets the tipoIdentificacion value for this ParametroEntradaMetodo1.
     * 
     * @return tipoIdentificacion
     */
    public java.lang.String getTipoIdentificacion() {
        return tipoIdentificacion;
    }


    /**
     * Sets the tipoIdentificacion value for this ParametroEntradaMetodo1.
     * 
     * @param tipoIdentificacion
     */
    public void setTipoIdentificacion(java.lang.String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParametroEntradaMetodo1)) return false;
        ParametroEntradaMetodo1 other = (ParametroEntradaMetodo1) obj;
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
            ((this.chasis==null && other.getChasis()==null) || 
             (this.chasis!=null &&
              this.chasis.equals(other.getChasis()))) &&
            ((this.fechaInscripcion==null && other.getFechaInscripcion()==null) || 
             (this.fechaInscripcion!=null &&
              this.fechaInscripcion.equals(other.getFechaInscripcion()))) &&
            ((this.libro==null && other.getLibro()==null) || 
             (this.libro!=null &&
              this.libro.equals(other.getLibro()))) &&
            ((this.motor==null && other.getMotor()==null) || 
             (this.motor!=null &&
              this.motor.equals(other.getMotor()))) &&
            ((this.nombres==null && other.getNombres()==null) || 
             (this.nombres!=null &&
              this.nombres.equals(other.getNombres()))) &&
            ((this.numeroIdentificacion==null && other.getNumeroIdentificacion()==null) || 
             (this.numeroIdentificacion!=null &&
              this.numeroIdentificacion.equals(other.getNumeroIdentificacion()))) &&
            ((this.numeroInscripcion==null && other.getNumeroInscripcion()==null) || 
             (this.numeroInscripcion!=null &&
              this.numeroInscripcion.equals(other.getNumeroInscripcion()))) &&
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
        if (getChasis() != null) {
            _hashCode += getChasis().hashCode();
        }
        if (getFechaInscripcion() != null) {
            _hashCode += getFechaInscripcion().hashCode();
        }
        if (getLibro() != null) {
            _hashCode += getLibro().hashCode();
        }
        if (getMotor() != null) {
            _hashCode += getMotor().hashCode();
        }
        if (getNombres() != null) {
            _hashCode += getNombres().hashCode();
        }
        if (getNumeroIdentificacion() != null) {
            _hashCode += getNumeroIdentificacion().hashCode();
        }
        if (getNumeroInscripcion() != null) {
            _hashCode += getNumeroInscripcion().hashCode();
        }
        if (getTipoIdentificacion() != null) {
            _hashCode += getTipoIdentificacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParametroEntradaMetodo1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Parametro.EntradaMetodo1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellidos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Apellidos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chasis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Chasis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInscripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "FechaInscripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("libro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Libro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Motor"));
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
        elemField.setFieldName("numeroIdentificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "NumeroIdentificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroInscripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "NumeroInscripcion"));
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
