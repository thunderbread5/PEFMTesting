/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.exception;

/**
 *
 * @author nickg
 */
public class NoDataAvailableForPractitionerRatingException extends Exception {

    /**
     * Creates a new instance of <code>NoDataAvailableException</code> without
     * detail message.
     */
    public NoDataAvailableForPractitionerRatingException() {
    }

    /**
     * Constructs an instance of <code>NoDataAvailableException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NoDataAvailableForPractitionerRatingException(String msg) {
        super(msg);
    }
}
