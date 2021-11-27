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
public class ChecklistAlreadyExistsException extends Exception {

    /**
     * Creates a new instance of <code>ChecklistAlreadyExistsException</code>
     * without detail message.
     */
    public ChecklistAlreadyExistsException() {
    }

    /**
     * Constructs an instance of <code>ChecklistAlreadyExistsException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public ChecklistAlreadyExistsException(String msg) {
        super(msg);
    }
}
