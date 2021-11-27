/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.exception;

/**
 *
 * @author sohqi
 */
public class FCUserIsSupervisorException extends Exception {

    /**
     * Creates a new instance of <code>FCUserIsSupervisorException</code>
     * without detail message.
     */
    public FCUserIsSupervisorException() {
    }

    /**
     * Constructs an instance of <code>FCUserIsSupervisorException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public FCUserIsSupervisorException(String msg) {
        super(msg);
    }
}
