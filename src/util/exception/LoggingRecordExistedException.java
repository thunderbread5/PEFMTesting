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
public class LoggingRecordExistedException extends Exception {

    /**
     * Creates a new instance of <code>LoggingRecordExistedException</code>
     * without detail message.
     */
    public LoggingRecordExistedException() {
    }

    /**
     * Constructs an instance of <code>LoggingRecordExistedException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public LoggingRecordExistedException(String msg) {
        super(msg);
    }
}
