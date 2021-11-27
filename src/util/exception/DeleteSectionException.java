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
public class DeleteSectionException extends Exception {

    /**
     * Creates a new instance of <code>DeleteSectionException</code> without
     * detail message.
     */
    public DeleteSectionException() {
    }

    /**
     * Constructs an instance of <code>DeleteSectionException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DeleteSectionException(String msg) {
        super(msg);
    }
}
