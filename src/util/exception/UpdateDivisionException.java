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
public class UpdateDivisionException extends Exception {

    /**
     * Creates a new instance of <code>UpdateDivisionException</code> without
     * detail message.
     */
    public UpdateDivisionException() {
    }

    /**
     * Constructs an instance of <code>UpdateDivisionException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UpdateDivisionException(String msg) {
        super(msg);
    }
}
