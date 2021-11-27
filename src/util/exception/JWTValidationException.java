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
public class JWTValidationException extends Exception {

    /**
     * Creates a new instance of <code>JWTValidationException</code> without
     * detail message.
     */
    public JWTValidationException() {
    }

    /**
     * Constructs an instance of <code>JWTValidationException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public JWTValidationException(String msg) {
        super(msg);
    }
}
