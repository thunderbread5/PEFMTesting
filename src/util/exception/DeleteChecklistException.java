/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.exception;

/**
 *
 * @author poopy
 */
public class DeleteChecklistException extends Exception {

    /**
     * Creates a new instance of <code>DeleteChecklistException</code> without
     * detail message.
     */
    public DeleteChecklistException() {
    }

    /**
     * Constructs an instance of <code>DeleteChecklistException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DeleteChecklistException(String msg) {
        super(msg);
    }
}
