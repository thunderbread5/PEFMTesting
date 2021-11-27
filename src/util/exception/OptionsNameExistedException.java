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
public class OptionsNameExistedException extends Exception {

    /**
     * Creates a new instance of <code>OptionsNameExistedException</code>
     * without detail message.
     */
    public OptionsNameExistedException() {
    }

    /**
     * Constructs an instance of <code>OptionsNameExistedException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public OptionsNameExistedException(String msg) {
        super(msg);
    }
}
