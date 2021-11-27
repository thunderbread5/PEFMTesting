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
public class UserNotFoundException extends Exception {

    /**
     * Constructs an instance of <code>UserNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UserNotFoundException(String msg) {
        super(msg);
    }
}
