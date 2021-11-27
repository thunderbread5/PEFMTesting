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
public class DeleteDivisionException extends Exception {

    /**
     * Creates a new instance of <code>DeleteDivisionException</code> without
     * detail message.
     */
    public DeleteDivisionException() {
    }

    /**
     * Constructs an instance of <code>DeleteDivisionException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DeleteDivisionException(String msg) {
        super(msg);
    }
}
