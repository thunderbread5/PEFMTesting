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
public class FCRatingIntegrityConstraintException extends Exception {

    /**
     * Creates a new instance of
     * <code>FCRatingIntegrityConstraintException</code> without detail message.
     */
    public FCRatingIntegrityConstraintException() {
    }

    /**
     * Constructs an instance of
     * <code>FCRatingIntegrityConstraintException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public FCRatingIntegrityConstraintException(String msg) {
        super(msg);
    }
}
