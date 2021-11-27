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
public class DeleteRunException extends Exception {

    /**
     * Creates a new instance of <code>DeleteRunException</code> without detail
     * message.
     */
    public DeleteRunException() {
    }

    /**
     * Constructs an instance of <code>DeleteRunException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DeleteRunException(String msg) {
        super(msg);
    }
}
