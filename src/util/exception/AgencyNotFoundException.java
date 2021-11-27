/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.exception;

/**
 *
 * @author zongh
 */
public class AgencyNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>AgencyNotFoundException</code> without
     * detail message.
     */
    public AgencyNotFoundException() {
    }

    /**
     * Constructs an instance of <code>AgencyNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public AgencyNotFoundException(String msg) {
        super(msg);
    }
}
