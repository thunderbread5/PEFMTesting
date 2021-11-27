/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.exception;

/**
 *
 * @author poopy
 */
public class FCRatingAlreadyExistsException extends Exception {

    /**
     * Creates a new instance of <code>FCRatingAlreadyExistsException</code>
     * without detail message.
     */
    public FCRatingAlreadyExistsException() {
    }

    /**
     * Constructs an instance of <code>FCRatingAlreadyExistsException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public FCRatingAlreadyExistsException(String msg) {
        super(msg);
    }
}
