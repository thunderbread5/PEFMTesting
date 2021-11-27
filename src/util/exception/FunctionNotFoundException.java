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
public class FunctionNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>FunctionNotFoundException</code> without
     * detail message.
     */
    public FunctionNotFoundException() {
    }

    /**
     * Constructs an instance of <code>FunctionNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public FunctionNotFoundException(String msg) {
        super(msg);
    }
}
