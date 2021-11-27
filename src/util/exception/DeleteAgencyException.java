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
public class DeleteAgencyException extends Exception {

    /**
     * Creates a new instance of <code>DeleteAgencyException</code> without
     * detail message.
     */
    public DeleteAgencyException() {
    }

    /**
     * Constructs an instance of <code>DeleteAgencyException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DeleteAgencyException(String msg) {
        super(msg);
    }
}
