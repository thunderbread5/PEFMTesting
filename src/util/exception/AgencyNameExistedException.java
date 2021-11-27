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
public class AgencyNameExistedException extends Exception {

    /**
     * Creates a new instance of <code>AgencyNameExistedException</code> without
     * detail message.
     */
    public AgencyNameExistedException() {
    }

    /**
     * Constructs an instance of <code>AgencyNameExistedException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public AgencyNameExistedException(String msg) {
        super(msg);
    }
}
