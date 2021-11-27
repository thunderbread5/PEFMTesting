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
public class FileNameExistedException extends Exception {

    /**
     * Creates a new instance of <code>FileNameExistedException</code> without
     * detail message.
     */
    public FileNameExistedException() {
    }

    /**
     * Constructs an instance of <code>FileNameExistedException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public FileNameExistedException(String msg) {
        super(msg);
    }
}
