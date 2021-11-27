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
public class DeleteFCRaterInfoException extends Exception {

    /**
     * Creates a new instance of <code>DeleteFCRaterInfoException</code> without
     * detail message.
     */
    public DeleteFCRaterInfoException() {
    }

    /**
     * Constructs an instance of <code>DeleteFCRaterInfoException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public DeleteFCRaterInfoException(String msg) {
        super(msg);
    }
}
