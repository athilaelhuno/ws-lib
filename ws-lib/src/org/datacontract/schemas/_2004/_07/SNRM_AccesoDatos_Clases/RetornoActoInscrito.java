/**
 * RetornoActoInscrito.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases;

public class RetornoActoInscrito  implements java.io.Serializable {
    private java.lang.String fechaInscripcion;

    private java.lang.String fechaInstitucion;

    private java.lang.String institucion;

    private java.lang.String libro;

    private java.lang.String nombreActo;

    private java.lang.String numeroInscripcion;

    private org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoBien[] listaBienes;

    private org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoCompareciente[] listaComparecientes;

    private org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoRepresentante[] listaRepresentantes;

    public RetornoActoInscrito() {
    }

    public RetornoActoInscrito(
           java.lang.String fechaInscripcion,
           java.lang.String fechaInstitucion,
           java.lang.String institucion,
           java.lang.String libro,
           java.lang.String nombreActo,
           java.lang.String numeroInscripcion,
           org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoBien[] listaBienes,
           org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoCompareciente[] listaComparecientes,
           org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoRepresentante[] listaRepresentantes) {
           this.fechaInscripcion = fechaInscripcion;
           this.fechaInstitucion = fechaInstitucion;
           this.institucion = institucion;
           this.libro = libro;
           this.nombreActo = nombreActo;
           this.numeroInscripcion = numeroInscripcion;
           this.listaBienes = listaBienes;
           this.listaComparecientes = listaComparecientes;
           this.listaRepresentantes = listaRepresentantes;
    }


    /**
     * Gets the fechaInscripcion value for this RetornoActoInscrito.
     * 
     * @return fechaInscripcion
     */
    public java.lang.String getFechaInscripcion() {
        return fechaInscripcion;
    }


    /**
     * Sets the fechaInscripcion value for this RetornoActoInscrito.
     * 
     * @param fechaInscripcion
     */
    public void setFechaInscripcion(java.lang.String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }


    /**
     * Gets the fechaInstitucion value for this RetornoActoInscrito.
     * 
     * @return fechaInstitucion
     */
    public java.lang.String getFechaInstitucion() {
        return fechaInstitucion;
    }


    /**
     * Sets the fechaInstitucion value for this RetornoActoInscrito.
     * 
     * @param fechaInstitucion
     */
    public void setFechaInstitucion(java.lang.String fechaInstitucion) {
        this.fechaInstitucion = fechaInstitucion;
    }


    /**
     * Gets the institucion value for this RetornoActoInscrito.
     * 
     * @return institucion
     */
    public java.lang.String getInstitucion() {
        return institucion;
    }


    /**
     * Sets the institucion value for this RetornoActoInscrito.
     * 
     * @param institucion
     */
    public void setInstitucion(java.lang.String institucion) {
        this.institucion = institucion;
    }


    /**
     * Gets the libro value for this RetornoActoInscrito.
     * 
     * @return libro
     */
    public java.lang.String getLibro() {
        return libro;
    }


    /**
     * Sets the libro value for this RetornoActoInscrito.
     * 
     * @param libro
     */
    public void setLibro(java.lang.String libro) {
        this.libro = libro;
    }


    /**
     * Gets the nombreActo value for this RetornoActoInscrito.
     * 
     * @return nombreActo
     */
    public java.lang.String getNombreActo() {
        return nombreActo;
    }


    /**
     * Sets the nombreActo value for this RetornoActoInscrito.
     * 
     * @param nombreActo
     */
    public void setNombreActo(java.lang.String nombreActo) {
        this.nombreActo = nombreActo;
    }


    /**
     * Gets the numeroInscripcion value for this RetornoActoInscrito.
     * 
     * @return numeroInscripcion
     */
    public java.lang.String getNumeroInscripcion() {
        return numeroInscripcion;
    }


    /**
     * Sets the numeroInscripcion value for this RetornoActoInscrito.
     * 
     * @param numeroInscripcion
     */
    public void setNumeroInscripcion(java.lang.String numeroInscripcion) {
        this.numeroInscripcion = numeroInscripcion;
    }


    /**
     * Gets the listaBienes value for this RetornoActoInscrito.
     * 
     * @return listaBienes
     */
    public org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoBien[] getListaBienes() {
        return listaBienes;
    }


    /**
     * Sets the listaBienes value for this RetornoActoInscrito.
     * 
     * @param listaBienes
     */
    public void setListaBienes(org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoBien[] listaBienes) {
        this.listaBienes = listaBienes;
    }


    /**
     * Gets the listaComparecientes value for this RetornoActoInscrito.
     * 
     * @return listaComparecientes
     */
    public org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoCompareciente[] getListaComparecientes() {
        return listaComparecientes;
    }


    /**
     * Sets the listaComparecientes value for this RetornoActoInscrito.
     * 
     * @param listaComparecientes
     */
    public void setListaComparecientes(org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoCompareciente[] listaComparecientes) {
        this.listaComparecientes = listaComparecientes;
    }


    /**
     * Gets the listaRepresentantes value for this RetornoActoInscrito.
     * 
     * @return listaRepresentantes
     */
    public org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoRepresentante[] getListaRepresentantes() {
        return listaRepresentantes;
    }


    /**
     * Sets the listaRepresentantes value for this RetornoActoInscrito.
     * 
     * @param listaRepresentantes
     */
    public void setListaRepresentantes(org.datacontract.schemas._2004._07.SNRM_AccesoDatos_Clases.RetornoRepresentante[] listaRepresentantes) {
        this.listaRepresentantes = listaRepresentantes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetornoActoInscrito)) return false;
        RetornoActoInscrito other = (RetornoActoInscrito) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fechaInscripcion==null && other.getFechaInscripcion()==null) || 
             (this.fechaInscripcion!=null &&
              this.fechaInscripcion.equals(other.getFechaInscripcion()))) &&
            ((this.fechaInstitucion==null && other.getFechaInstitucion()==null) || 
             (this.fechaInstitucion!=null &&
              this.fechaInstitucion.equals(other.getFechaInstitucion()))) &&
            ((this.institucion==null && other.getInstitucion()==null) || 
             (this.institucion!=null &&
              this.institucion.equals(other.getInstitucion()))) &&
            ((this.libro==null && other.getLibro()==null) || 
             (this.libro!=null &&
              this.libro.equals(other.getLibro()))) &&
            ((this.nombreActo==null && other.getNombreActo()==null) || 
             (this.nombreActo!=null &&
              this.nombreActo.equals(other.getNombreActo()))) &&
            ((this.numeroInscripcion==null && other.getNumeroInscripcion()==null) || 
             (this.numeroInscripcion!=null &&
              this.numeroInscripcion.equals(other.getNumeroInscripcion()))) &&
            ((this.listaBienes==null && other.getListaBienes()==null) || 
             (this.listaBienes!=null &&
              java.util.Arrays.equals(this.listaBienes, other.getListaBienes()))) &&
            ((this.listaComparecientes==null && other.getListaComparecientes()==null) || 
             (this.listaComparecientes!=null &&
              java.util.Arrays.equals(this.listaComparecientes, other.getListaComparecientes()))) &&
            ((this.listaRepresentantes==null && other.getListaRepresentantes()==null) || 
             (this.listaRepresentantes!=null &&
              java.util.Arrays.equals(this.listaRepresentantes, other.getListaRepresentantes())));
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
        if (getFechaInscripcion() != null) {
            _hashCode += getFechaInscripcion().hashCode();
        }
        if (getFechaInstitucion() != null) {
            _hashCode += getFechaInstitucion().hashCode();
        }
        if (getInstitucion() != null) {
            _hashCode += getInstitucion().hashCode();
        }
        if (getLibro() != null) {
            _hashCode += getLibro().hashCode();
        }
        if (getNombreActo() != null) {
            _hashCode += getNombreActo().hashCode();
        }
        if (getNumeroInscripcion() != null) {
            _hashCode += getNumeroInscripcion().hashCode();
        }
        if (getListaBienes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaBienes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaBienes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListaComparecientes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaComparecientes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaComparecientes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListaRepresentantes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaRepresentantes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaRepresentantes(), i);
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
        new org.apache.axis.description.TypeDesc(RetornoActoInscrito.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.ActoInscrito"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInscripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "FechaInscripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInstitucion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "FechaInstitucion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("institucion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Institucion"));
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
        elemField.setFieldName("nombreActo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "NombreActo"));
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
        elemField.setFieldName("listaBienes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "listaBienes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.Bien"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.Bien"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaComparecientes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "listaComparecientes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.Compareciente"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.Compareciente"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaRepresentantes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "listaRepresentantes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.Representante"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SNRM.AccesoDatos.Clases", "Retorno.Representante"));
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
