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
public class ChecklistNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>ChecklistNotFoundException</code> without
     * detail message.
     */
    public ChecklistNotFoundException() {
    }

    /**
     * Constructs an instance of <code>ChecklistNotFoundException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public ChecklistNotFoundException(String msg) {
        super(msg);
    }
}
