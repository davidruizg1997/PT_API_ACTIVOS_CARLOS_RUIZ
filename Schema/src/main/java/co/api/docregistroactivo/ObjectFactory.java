//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.12 at 12:02:19 PM COT 
//


package co.api.docregistroactivo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.api.docregistroactivo package. 
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

    private final static QName _DocumentoRegistro_QNAME = new QName("http://API.co/DocRegistroActivo", "DocumentoRegistro");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.api.docregistroactivo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DocumentoRegistroType }
     * 
     */
    public DocumentoRegistroType createDocumentoRegistroType() {
        return new DocumentoRegistroType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentoRegistroType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.co/DocRegistroActivo", name = "DocumentoRegistro")
    public JAXBElement<DocumentoRegistroType> createDocumentoRegistro(DocumentoRegistroType value) {
        return new JAXBElement<DocumentoRegistroType>(_DocumentoRegistro_QNAME, DocumentoRegistroType.class, null, value);
    }

}
