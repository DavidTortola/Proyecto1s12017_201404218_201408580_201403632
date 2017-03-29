
package Clases;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EliminarTransaccion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EliminarTransaccion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idActivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EliminarTransaccion", propOrder = {
    "idActivo"
})
public class EliminarTransaccion {

    protected String idActivo;

    /**
     * Obtiene el valor de la propiedad idActivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdActivo() {
        return idActivo;
    }

    /**
     * Define el valor de la propiedad idActivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdActivo(String value) {
        this.idActivo = value;
    }

}
