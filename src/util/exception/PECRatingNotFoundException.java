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
public class PECRatingNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>PECRatingEntityNotFoundException</code>
     * without detail message.
     */
    public PECRatingNotFoundException() {
    }

    /**
     * Constructs an instance of <code>PECRatingEntityNotFoundException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public PECRatingNotFoundException(String msg) {
        super(msg);
    }
}
