
package sd.tp1.clt.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "PictureAlreadyExistsException", targetNamespace = "http://srv.tp1.sd/")
public class PictureAlreadyExistsException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private PictureAlreadyExistsException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public PictureAlreadyExistsException_Exception(String message, PictureAlreadyExistsException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public PictureAlreadyExistsException_Exception(String message, PictureAlreadyExistsException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: sd.tp1.clt.ws.PictureAlreadyExistsException
     */
    public PictureAlreadyExistsException getFaultInfo() {
        return faultInfo;
    }

}
