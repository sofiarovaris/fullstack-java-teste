
package br.com.lemontech.selfbooking.wsselfbooking.beans.hotel;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pedidosHoteis complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pedidosHoteis"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pedidoHotel" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/hotel}pedidoHotel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pedidosHoteis", propOrder = {
    "pedidoHotel"
})
public class PedidosHoteis {

    protected List<PedidoHotel> pedidoHotel;

    /**
     * Gets the value of the pedidoHotel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pedidoHotel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPedidoHotel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PedidoHotel }
     * 
     * 
     */
    public List<PedidoHotel> getPedidoHotel() {
        if (pedidoHotel == null) {
            pedidoHotel = new ArrayList<PedidoHotel>();
        }
        return this.pedidoHotel;
    }

}
