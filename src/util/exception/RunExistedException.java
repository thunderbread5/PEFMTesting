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
public class RunExistedException extends Exception {

    /**
     * Creates a new instance of <code>RunNameExistedException</code> without
     * detail message.
     */
    public RunExistedException() {
    }

    /**
     * Constructs an instance of <code>RunNameExistedException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public RunExistedException(String msg) {
        super(msg);
    }
}
