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
public class ModuleAlreadyExistsException extends Exception {

    /**
     * Creates a new instance of <code>ModuleAlreadyExistsException</code>
     * without detail message.
     */
    public ModuleAlreadyExistsException() {
    }

    /**
     * Constructs an instance of <code>ModuleAlreadyExistsException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public ModuleAlreadyExistsException(String msg) {
        super(msg);
    }
}
