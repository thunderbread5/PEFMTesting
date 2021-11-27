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
public class DeletePECFrequencyReviewException extends Exception {

    /**
     * Creates a new instance of <code>DeletePECFrequencyReviewException</code>
     * without detail message.
     */
    public DeletePECFrequencyReviewException() {
    }

    /**
     * Constructs an instance of <code>DeletePECFrequencyReviewException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public DeletePECFrequencyReviewException(String msg) {
        super(msg);
    }
}
