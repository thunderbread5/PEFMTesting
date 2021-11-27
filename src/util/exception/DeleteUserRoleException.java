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
public class DeleteUserRoleException extends Exception {

    /**
     * Creates a new instance of <code>DeleteUserRoleException</code> without
     * detail message.
     */
    public DeleteUserRoleException() {
    }

    /**
     * Constructs an instance of <code>DeleteUserRoleException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DeleteUserRoleException(String msg) {
        super(msg);
    }
}
