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
public class UnableToDeleteSupervisorException extends Exception {

    /**
     * Creates a new instance of <code>UnableToDeleteSupervisorException</code>
     * without detail message.
     */
    public UnableToDeleteSupervisorException() {
    }

    /**
     * Constructs an instance of <code>UnableToDeleteSupervisorException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public UnableToDeleteSupervisorException(String msg) {
        super(msg);
    }
}
