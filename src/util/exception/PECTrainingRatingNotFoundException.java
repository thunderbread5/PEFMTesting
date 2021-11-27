/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.exception;

/**
 *
 * @author rayta
 */
public class PECTrainingRatingNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>PECTrainingRatingNotFoundException</code>
     * without detail message.
     */
    public PECTrainingRatingNotFoundException() {
    }

    /**
     * Constructs an instance of <code>PECTrainingRatingNotFoundException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public PECTrainingRatingNotFoundException(String msg) {
        super(msg);
    }
}
