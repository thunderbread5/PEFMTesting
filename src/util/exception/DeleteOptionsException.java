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
public class DeleteOptionsException extends Exception {

    /**
     * Creates a new instance of <code>DeleteOptionsException</code> without
     * detail message.
     */
    public DeleteOptionsException() {
    }

    /**
     * Constructs an instance of <code>DeleteOptionsException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DeleteOptionsException(String msg) {
        super(msg);
    }
}
