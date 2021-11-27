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
public class CrossAgenciesException extends Exception {

    /**
     * Creates a new instance of <code>CrossAgenciesException</code> without
     * detail message.
     */
    public CrossAgenciesException() {
    }

    /**
     * Constructs an instance of <code>CrossAgenciesException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CrossAgenciesException(String msg) {
        super(msg);
    }
}
