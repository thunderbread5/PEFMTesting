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
public class NoFCSupervisorPractitionerEntityFoundException extends Exception {

    /**
     * Creates a new instance of
     * <code>NoFCSupervisorPractitionerEntityFoundException</code> without
     * detail message.
     */
    public NoFCSupervisorPractitionerEntityFoundException() {
    }

    /**
     * Constructs an instance of
     * <code>NoFCSupervisorPractitionerEntityFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NoFCSupervisorPractitionerEntityFoundException(String msg) {
        super(msg);
    }
}
