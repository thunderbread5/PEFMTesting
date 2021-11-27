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
public class DeleteFileException extends Exception {

    /**
     * Creates a new instance of <code>DeleteFileException</code> without detail
     * message.
     */
    public DeleteFileException() {
    }

    /**
     * Constructs an instance of <code>DeleteFileException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DeleteFileException(String msg) {
        super(msg);
    }
}
