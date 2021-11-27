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
public class AgencyIsDeletedException extends Exception {

    /**
     * Creates a new instance of <code>AgencyIsDeletedException</code> without
     * detail message.
     */
    public AgencyIsDeletedException() {
    }

    /**
     * Constructs an instance of <code>AgencyIsDeletedException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public AgencyIsDeletedException(String msg) {
        super(msg);
    }
}
