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
public class InternalAgencyDoesNotFoundException extends Exception {

    /**
     * Creates a new instance of
     * <code>InternalAgencyDoesNotFoundException</code> without detail message.
     */
    public InternalAgencyDoesNotFoundException() {
    }

    /**
     * Constructs an instance of
     * <code>InternalAgencyDoesNotFoundException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public InternalAgencyDoesNotFoundException(String msg) {
        super(msg);
    }
}
