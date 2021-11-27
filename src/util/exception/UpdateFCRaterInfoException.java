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
public class UpdateFCRaterInfoException extends Exception {

    /**
     * Creates a new instance of <code>UpdateFCRaterInfoException</code> without
     * detail message.
     */
    public UpdateFCRaterInfoException() {
    }

    /**
     * Constructs an instance of <code>UpdateFCRaterInfoException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public UpdateFCRaterInfoException(String msg) {
        super(msg);
    }
}
