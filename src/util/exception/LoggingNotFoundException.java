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
public class LoggingNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>LoggingNotFoundException</code> without
     * detail message.
     */
    public LoggingNotFoundException() {
    }

    /**
     * Constructs an instance of <code>LoggingNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public LoggingNotFoundException(String msg) {
        super(msg);
    }
}
