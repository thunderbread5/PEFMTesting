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
public class UpdatePECRatingException extends Exception {

    /**
     * Creates a new instance of <code>UpdatePECRatingEntityException</code>
     * without detail message.
     */
    public UpdatePECRatingException() {
    }

    /**
     * Constructs an instance of <code>UpdatePECRatingEntityException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public UpdatePECRatingException(String msg) {
        super(msg);
    }
}
