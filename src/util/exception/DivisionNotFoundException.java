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
public class DivisionNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>DivisionNotFoundException</code> without
     * detail message.
     */
    public DivisionNotFoundException() {
    }

    /**
     * Constructs an instance of <code>DivisionNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DivisionNotFoundException(String msg) {
        super(msg);
    }
}
