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
public class FCRaterInfoNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>FCRaterInfoNotFoundException</code>
     * without detail message.
     */
    public FCRaterInfoNotFoundException() {
    }

    /**
     * Constructs an instance of <code>FCRaterInfoNotFoundException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public FCRaterInfoNotFoundException(String msg) {
        super(msg);
    }
}
