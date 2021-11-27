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
public class LoggingExistedException extends Exception {

    /**
     * Creates a new instance of <code>LoggingExistedException</code> without
     * detail message.
     */
    public LoggingExistedException() {
    }

    /**
     * Constructs an instance of <code>LoggingExistedException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public LoggingExistedException(String msg) {
        super(msg);
    }
}
