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
public class FCRatingNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>FCRatingNotFoundException</code> without
     * detail message.
     */
    public FCRatingNotFoundException() {
    }

    /**
     * Constructs an instance of <code>FCRatingNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public FCRatingNotFoundException(String msg) {
        super(msg);
    }
}
