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
public class UpdateAgencyException extends Exception {

    /**
     * Creates a new instance of <code>UpdateAgencyException</code> without
     * detail message.
     */
    public UpdateAgencyException() {
    }

    /**
     * Constructs an instance of <code>UpdateAgencyException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UpdateAgencyException(String msg) {
        super(msg);
    }
}
