//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.12 at 08:50:35 AM COT 
//


package co.api.docregistroactivo;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DocumentoRegistroType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentoRegistroType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numInventario" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="alto" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ancho" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="largo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="valCompra" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="fechaCompra" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="fechaBaja" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="estadoActual" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentoRegistroType", propOrder = {
    "nombre",
    "descripcion",
    "tipo",
    "serial",
    "numInventario",
    "peso",
    "alto",
    "ancho",
    "largo",
    "valCompra",
    "fechaCompra",
    "fechaBaja",
    "estadoActual",
    "color"
})
public class DocumentoRegistroType {

    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String descripcion;
    @XmlElement(required = true)
    protected String tipo;
    @XmlElement(required = true)
    protected String serial;
    @XmlElement(required = true)
    protected BigInteger numInventario;
    @XmlElement(required = true)
    protected BigDecimal peso;
    @XmlElement(required = true)
    protected BigDecimal alto;
    @XmlElement(required = true)
    protected BigDecimal ancho;
    @XmlElement(required = true)
    protected BigDecimal largo;
    @XmlElement(required = true)
    protected BigDecimal valCompra;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaCompra;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaBaja;
    @XmlElement(required = true)
    protected String estadoActual;
    @XmlElement(required = true)
    protected String color;

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the serial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerial() {
        return serial;
    }

    /**
     * Sets the value of the serial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerial(String value) {
        this.serial = value;
    }

    /**
     * Gets the value of the numInventario property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumInventario() {
        return numInventario;
    }

    /**
     * Sets the value of the numInventario property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumInventario(BigInteger value) {
        this.numInventario = value;
    }

    /**
     * Gets the value of the peso property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeso() {
        return peso;
    }

    /**
     * Sets the value of the peso property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPeso(BigDecimal value) {
        this.peso = value;
    }

    /**
     * Gets the value of the alto property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAlto() {
        return alto;
    }

    /**
     * Sets the value of the alto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAlto(BigDecimal value) {
        this.alto = value;
    }

    /**
     * Gets the value of the ancho property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAncho() {
        return ancho;
    }

    /**
     * Sets the value of the ancho property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAncho(BigDecimal value) {
        this.ancho = value;
    }

    /**
     * Gets the value of the largo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLargo() {
        return largo;
    }

    /**
     * Sets the value of the largo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLargo(BigDecimal value) {
        this.largo = value;
    }

    /**
     * Gets the value of the valCompra property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValCompra() {
        return valCompra;
    }

    /**
     * Sets the value of the valCompra property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValCompra(BigDecimal value) {
        this.valCompra = value;
    }

    /**
     * Gets the value of the fechaCompra property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCompra() {
        return fechaCompra;
    }

    /**
     * Sets the value of the fechaCompra property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCompra(XMLGregorianCalendar value) {
        this.fechaCompra = value;
    }

    /**
     * Gets the value of the fechaBaja property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaBaja() {
        return fechaBaja;
    }

    /**
     * Sets the value of the fechaBaja property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaBaja(XMLGregorianCalendar value) {
        this.fechaBaja = value;
    }

    /**
     * Gets the value of the estadoActual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoActual() {
        return estadoActual;
    }

    /**
     * Sets the value of the estadoActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoActual(String value) {
        this.estadoActual = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

}
