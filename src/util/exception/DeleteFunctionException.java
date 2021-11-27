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
public class DeleteFunctionException extends Exception {

    /**
     * Creates a new instance of <code>DeleteFunctionException</code> without
     * detail message.
     */
    public DeleteFunctionException() {
    }

    /**
     * Constructs an instance of <code>DeleteFunctionException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DeleteFunctionException(String msg) {
        super(msg);
    }
}
