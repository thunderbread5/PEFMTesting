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
public class PECFrequencyReviewNotFoundException extends Exception {

    /**
     * Creates a new instance of
     * <code>PECFrequencyReviewNotFoundException</code> without detail message.
     */
    public PECFrequencyReviewNotFoundException() {
    }

    /**
     * Constructs an instance of
     * <code>PECFrequencyReviewNotFoundException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public PECFrequencyReviewNotFoundException(String msg) {
        super(msg);
    }
}
