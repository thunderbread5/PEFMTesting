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
public class PECFrequencyReviewExistedException extends Exception {

    /**
     * Creates a new instance of <code>PECFrequencyReviewExistedException</code>
     * without detail message.
     */
    public PECFrequencyReviewExistedException() {
    }

    /**
     * Constructs an instance of <code>PECFrequencyReviewExistedException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public PECFrequencyReviewExistedException(String msg) {
        super(msg);
    }
}
