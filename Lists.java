
package com.microsoft.sharepoint.webservices;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "Lists", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", wsdlLocation = "file:/C:/temp/audit/gen/list.wsdl")
public class Lists
    extends Service
{

    private final static URL LISTS_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.microsoft.sharepoint.webservices.Lists.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.microsoft.sharepoint.webservices.Lists.class.getResource(".");
            url = new URL(baseUrl, "file:/C:/temp/audit/gen/list.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/C:/temp/audit/gen/list.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        LISTS_WSDL_LOCATION = url;
    }

    public Lists(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Lists() {
        super(LISTS_WSDL_LOCATION, new QName("http://schemas.microsoft.com/sharepoint/soap/", "Lists"));
    }

    /**
     * 
     * @return
     *     returns ListsSoap
     */
    @WebEndpoint(name = "ListsSoap")
    public ListsSoap getListsSoap() {
        return super.getPort(new QName("http://schemas.microsoft.com/sharepoint/soap/", "ListsSoap"), ListsSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ListsSoap
     */
    @WebEndpoint(name = "ListsSoap")
    public ListsSoap getListsSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://schemas.microsoft.com/sharepoint/soap/", "ListsSoap"), ListsSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns ListsSoap
     */
    @WebEndpoint(name = "ListsSoap12")
    public ListsSoap getListsSoap12() {
        return super.getPort(new QName("http://schemas.microsoft.com/sharepoint/soap/", "ListsSoap12"), ListsSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ListsSoap
     */
    @WebEndpoint(name = "ListsSoap12")
    public ListsSoap getListsSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://schemas.microsoft.com/sharepoint/soap/", "ListsSoap12"), ListsSoap.class, features);
    }

}
