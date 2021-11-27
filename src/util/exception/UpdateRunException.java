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
public class UpdateRunException extends Exception {

    /**
     * Creates a new instance of <code>UpdateRunException</code> without detail
     * message.
     */
    public UpdateRunException() {
    }

    /**
     * Constructs an instance of <code>UpdateRunException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UpdateRunException(String msg) {
        super(msg);
    }
}
