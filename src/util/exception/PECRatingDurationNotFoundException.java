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
public class PECRatingDurationNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>PECRatingDurationNotFoundException</code>
     * without detail message.
     */
    public PECRatingDurationNotFoundException() {
    }

    /**
     * Constructs an instance of <code>PECRatingDurationNotFoundException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public PECRatingDurationNotFoundException(String msg) {
        super(msg);
    }
}
