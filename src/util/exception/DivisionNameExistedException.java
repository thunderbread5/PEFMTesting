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
public class DivisionNameExistedException extends Exception {

    /**
     * Creates a new instance of <code>DivisionNameExistedException</code>
     * without detail message.
     */
    public DivisionNameExistedException() {
    }

    /**
     * Constructs an instance of <code>DivisionNameExistedException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public DivisionNameExistedException(String msg) {
        super(msg);
    }
}
