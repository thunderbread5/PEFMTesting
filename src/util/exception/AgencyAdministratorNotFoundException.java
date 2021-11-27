/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.exception;

/**
 *
 * @author sohqi
 */
public class AgencyAdministratorNotFoundException extends Exception {

    /**
     * Creates a new instance of
     * <code>AgencyAdministratorNotFoundException</code> without detail message.
     */
    public AgencyAdministratorNotFoundException() {
    }

    /**
     * Constructs an instance of
     * <code>AgencyAdministratorNotFoundException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public AgencyAdministratorNotFoundException(String msg) {
        super(msg);
    }
}
