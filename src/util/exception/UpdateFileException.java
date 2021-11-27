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
public class UpdateFileException extends Exception {

    /**
     * Creates a new instance of <code>UpdateFileException</code> without detail
     * message.
     */
    public UpdateFileException() {
    }

    /**
     * Constructs an instance of <code>UpdateFileException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UpdateFileException(String msg) {
        super(msg);
    }
}
