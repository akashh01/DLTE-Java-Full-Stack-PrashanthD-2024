
package web;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AccountSoap", targetNamespace = "http://web/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AccountSoap {


    /**
     * 
     * @param string
     * @return
     *     returns web.Customer
     */
    @WebMethod
    @WebResult(name = "Customer", partName = "Customer")
    @Action(input = "http://web/AccountSoap/getUsernameRequest", output = "http://web/AccountSoap/getUsernameResponse")
    public Customer getUsername(
        @WebParam(name = "String", partName = "String")
        String string);

}