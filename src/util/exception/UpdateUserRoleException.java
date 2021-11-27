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
public class UpdateUserRoleException extends Exception {

    /**
     * Creates a new instance of <code>UpdateUserRoleException</code> without
     * detail message.
     */
    public UpdateUserRoleException() {
    }

    /**
     * Constructs an instance of <code>UpdateUserRoleException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UpdateUserRoleException(String msg) {
        super(msg);
    }
}
