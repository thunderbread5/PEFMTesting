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
public class UpdateFCRatingException extends Exception {

    /**
     * Creates a new instance of <code>UpdateFCRatingException</code> without
     * detail message.
     */
    public UpdateFCRatingException() {
    }

    /**
     * Constructs an instance of <code>UpdateFCRatingException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UpdateFCRatingException(String msg) {
        super(msg);
    }
}
