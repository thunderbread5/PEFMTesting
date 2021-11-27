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
public class UpdatePECRatingDurationException extends Exception {

    /**
     * Creates a new instance of <code>UpdatePECRatingDurationException</code>
     * without detail message.
     */
    public UpdatePECRatingDurationException() {
    }

    /**
     * Constructs an instance of <code>UpdatePECRatingDurationException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public UpdatePECRatingDurationException(String msg) {
        super(msg);
    }
}
