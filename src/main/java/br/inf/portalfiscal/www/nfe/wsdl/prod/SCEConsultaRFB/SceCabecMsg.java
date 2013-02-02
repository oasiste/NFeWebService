/**
 * SceCabecMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.nfe.wsdl.prod.SCEConsultaRFB;

public class SceCabecMsg  implements java.io.Serializable {
    private java.lang.String versaoDados;

    public SceCabecMsg() {
    }

    public SceCabecMsg(
           java.lang.String versaoDados) {
           this.versaoDados = versaoDados;
    }


    /**
     * Gets the versaoDados value for this SceCabecMsg.
     * 
     * @return versaoDados
     */
    public java.lang.String getVersaoDados() {
        return versaoDados;
    }


    /**
     * Sets the versaoDados value for this SceCabecMsg.
     * 
     * @param versaoDados
     */
    public void setVersaoDados(java.lang.String versaoDados) {
        this.versaoDados = versaoDados;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SceCabecMsg)) return false;
        SceCabecMsg other = (SceCabecMsg) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.versaoDados==null && other.getVersaoDados()==null) || 
             (this.versaoDados!=null &&
              this.versaoDados.equals(other.getVersaoDados())));
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
        if (getVersaoDados() != null) {
            _hashCode += getVersaoDados().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SceCabecMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/SCEConsultaRFB", "sceCabecMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versaoDados");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/SCEConsultaRFB", "versaoDados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
