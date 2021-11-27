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
public class OptionsNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>OptionsNotFoundException</code> without
     * detail message.
     */
    public OptionsNotFoundException() {
    }

    /**
     * Constructs an instance of <code>OptionsNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public OptionsNotFoundException(String msg) {
        super(msg);
    }
}
