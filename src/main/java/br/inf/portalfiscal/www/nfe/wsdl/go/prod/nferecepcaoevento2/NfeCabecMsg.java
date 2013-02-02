/**
 * NfeCabecMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.nfe.wsdl.go.prod.nferecepcaoevento2;

public class NfeCabecMsg  implements java.io.Serializable {
    private java.lang.String cUF;

    private java.lang.String versaoDados;

    public NfeCabecMsg() {
    }

    public NfeCabecMsg(
           java.lang.String cUF,
           java.lang.String versaoDados) {
           this.cUF = cUF;
           this.versaoDados = versaoDados;
    }


    /**
     * Gets the cUF value for this NfeCabecMsg.
     * 
     * @return cUF
     */
    public java.lang.String getCUF() {
        return cUF;
    }


    /**
     * Sets the cUF value for this NfeCabecMsg.
     * 
     * @param cUF
     */
    public void setCUF(java.lang.String cUF) {
        this.cUF = cUF;
    }


    /**
     * Gets the versaoDados value for this NfeCabecMsg.
     * 
     * @return versaoDados
     */
    public java.lang.String getVersaoDados() {
        return versaoDados;
    }


    /**
     * Sets the versaoDados value for this NfeCabecMsg.
     * 
     * @param versaoDados
     */
    public void setVersaoDados(java.lang.String versaoDados) {
        this.versaoDados = versaoDados;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NfeCabecMsg)) return false;
        NfeCabecMsg other = (NfeCabecMsg) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cUF==null && other.getCUF()==null) || 
             (this.cUF!=null &&
              this.cUF.equals(other.getCUF()))) &&
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
        if (getCUF() != null) {
            _hashCode += getCUF().hashCode();
        }
        if (getVersaoDados() != null) {
            _hashCode += getVersaoDados().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NfeCabecMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcaoEvento", "nfeCabecMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcaoEvento", "cUF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versaoDados");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcaoEvento", "versaoDados"));
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
