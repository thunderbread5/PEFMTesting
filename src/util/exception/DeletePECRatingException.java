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
public class DeletePECRatingException extends Exception {

    /**
     * Creates a new instance of <code>DeletePECRatingEntityException</code>
     * without detail message.
     */
    public DeletePECRatingException() {
    }

    /**
     * Constructs an instance of <code>DeletePECRatingEntityException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public DeletePECRatingException(String msg) {
        super(msg);
    }
}
