package br.com.lemontech.selfbooking.wsselfbooking.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.0.3
 * 2025-01-29T19:44:58.034-03:00
 * Generated source version: 4.0.3
 *
 */
@WebServiceClient(name = "WsSelfBookingService",
                  wsdlLocation = "https://treinamento.lemontech.com.br/wsselfbooking/WsSelfBookingService?wsdl",
                  targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services")
public class WsSelfBookingService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "WsSelfBookingService");
    public final static QName WsSelfBookingPort = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "WsSelfBookingPort");
    static {
        URL url = null;
        try {
            url = new URL("https://treinamento.lemontech.com.br/wsselfbooking/WsSelfBookingService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WsSelfBookingService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "https://treinamento.lemontech.com.br/wsselfbooking/WsSelfBookingService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WsSelfBookingService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WsSelfBookingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsSelfBookingService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public WsSelfBookingService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WsSelfBookingService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WsSelfBookingService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns WsSelfBooking
     */
    @WebEndpoint(name = "WsSelfBookingPort")
    public WsSelfBooking getWsSelfBookingPort() {
        return super.getPort(WsSelfBookingPort, WsSelfBooking.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsSelfBooking
     */
    @WebEndpoint(name = "WsSelfBookingPort")
    public WsSelfBooking getWsSelfBookingPort(WebServiceFeature... features) {
        return super.getPort(WsSelfBookingPort, WsSelfBooking.class, features);
    }

}
