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
public class DeleteModuleException extends Exception {

    /**
     * Creates a new instance of <code>DeleteModuleException</code> without
     * detail message.
     */
    public DeleteModuleException() {
    }

    /**
     * Constructs an instance of <code>DeleteModuleException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DeleteModuleException(String msg) {
        super(msg);
    }
}
