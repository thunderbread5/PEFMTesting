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
public class PECRatingNameExistedException extends Exception {

    /**
     * Creates a new instance of
     * <code>PECRatingEntityNameExistedException</code> without detail message.
     */
    public PECRatingNameExistedException() {
    }

    /**
     * Constructs an instance of
     * <code>PECRatingEntityNameExistedException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public PECRatingNameExistedException(String msg) {
        super(msg);
    }
}
