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
public class UpdateOptionsException extends Exception {

    /**
     * Creates a new instance of <code>UpdateOptionsException</code> without
     * detail message.
     */
    public UpdateOptionsException() {
    }

    /**
     * Constructs an instance of <code>UpdateOptionsException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UpdateOptionsException(String msg) {
        super(msg);
    }
}
