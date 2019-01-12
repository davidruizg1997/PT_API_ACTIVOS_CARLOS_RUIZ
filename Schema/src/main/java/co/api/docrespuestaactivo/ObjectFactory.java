//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.12 at 08:50:35 AM COT 
//


package co.api.docrespuestaactivo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.api.docrespuestaactivo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RespuestaNuevoActivo_QNAME = new QName("http://API.co/DocRespuestaActivo", "RespuestaNuevoActivo");
    private final static QName _RespActualizarActivo_QNAME = new QName("http://API.co/DocRespuestaActivo", "RespActualizarActivo");
    private final static QName _RespBuscarTodosActivos_QNAME = new QName("http://API.co/DocRespuestaActivo", "RespBuscarTodosActivos");
    private final static QName _RespBuscarClasiActivos_QNAME = new QName("http://API.co/DocRespuestaActivo", "RespBuscarClasiActivos");
    private final static QName _RespuestaListarDatos_QNAME = new QName("http://API.co/DocRespuestaActivo", "RespuestaListarDatos");
    private final static QName _RespuestaModificar_QNAME = new QName("http://API.co/DocRespuestaActivo", "RespuestaModificar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.api.docrespuestaactivo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RespuestaNuevoActivoType }
     * 
     */
    public RespuestaNuevoActivoType createRespuestaNuevoActivoType() {
        return new RespuestaNuevoActivoType();
    }

    /**
     * Create an instance of {@link CiudadesType }
     * 
     */
    public CiudadesType createCiudadesType() {
        return new CiudadesType();
    }

    /**
     * Create an instance of {@link PersonasType }
     * 
     */
    public PersonasType createPersonasType() {
        return new PersonasType();
    }

    /**
     * Create an instance of {@link RespuestaListarDatosType }
     * 
     */
    public RespuestaListarDatosType createRespuestaListarDatosType() {
        return new RespuestaListarDatosType();
    }

    /**
     * Create an instance of {@link ActivosFijosType }
     * 
     */
    public ActivosFijosType createActivosFijosType() {
        return new ActivosFijosType();
    }

    /**
     * Create an instance of {@link RespActualizarActivoType }
     * 
     */
    public RespActualizarActivoType createRespActualizarActivoType() {
        return new RespActualizarActivoType();
    }

    /**
     * Create an instance of {@link AreasType }
     * 
     */
    public AreasType createAreasType() {
        return new AreasType();
    }

    /**
     * Create an instance of {@link RespuestaModificarType }
     * 
     */
    public RespuestaModificarType createRespuestaModificarType() {
        return new RespuestaModificarType();
    }

    /**
     * Create an instance of {@link RespBuscarClasiActivosType }
     * 
     */
    public RespBuscarClasiActivosType createRespBuscarClasiActivosType() {
        return new RespBuscarClasiActivosType();
    }

    /**
     * Create an instance of {@link RespBuscarTodosActivosType }
     * 
     */
    public RespBuscarTodosActivosType createRespBuscarTodosActivosType() {
        return new RespBuscarTodosActivosType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaNuevoActivoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.co/DocRespuestaActivo", name = "RespuestaNuevoActivo")
    public JAXBElement<RespuestaNuevoActivoType> createRespuestaNuevoActivo(RespuestaNuevoActivoType value) {
        return new JAXBElement<RespuestaNuevoActivoType>(_RespuestaNuevoActivo_QNAME, RespuestaNuevoActivoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespActualizarActivoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.co/DocRespuestaActivo", name = "RespActualizarActivo")
    public JAXBElement<RespActualizarActivoType> createRespActualizarActivo(RespActualizarActivoType value) {
        return new JAXBElement<RespActualizarActivoType>(_RespActualizarActivo_QNAME, RespActualizarActivoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespBuscarTodosActivosType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.co/DocRespuestaActivo", name = "RespBuscarTodosActivos")
    public JAXBElement<RespBuscarTodosActivosType> createRespBuscarTodosActivos(RespBuscarTodosActivosType value) {
        return new JAXBElement<RespBuscarTodosActivosType>(_RespBuscarTodosActivos_QNAME, RespBuscarTodosActivosType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespBuscarClasiActivosType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.co/DocRespuestaActivo", name = "RespBuscarClasiActivos")
    public JAXBElement<RespBuscarClasiActivosType> createRespBuscarClasiActivos(RespBuscarClasiActivosType value) {
        return new JAXBElement<RespBuscarClasiActivosType>(_RespBuscarClasiActivos_QNAME, RespBuscarClasiActivosType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaListarDatosType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.co/DocRespuestaActivo", name = "RespuestaListarDatos")
    public JAXBElement<RespuestaListarDatosType> createRespuestaListarDatos(RespuestaListarDatosType value) {
        return new JAXBElement<RespuestaListarDatosType>(_RespuestaListarDatos_QNAME, RespuestaListarDatosType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaModificarType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.co/DocRespuestaActivo", name = "RespuestaModificar")
    public JAXBElement<RespuestaModificarType> createRespuestaModificar(RespuestaModificarType value) {
        return new JAXBElement<RespuestaModificarType>(_RespuestaModificar_QNAME, RespuestaModificarType.class, null, value);
    }

}
