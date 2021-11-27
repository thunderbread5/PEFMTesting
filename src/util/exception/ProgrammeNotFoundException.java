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
public class ProgrammeNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>ProgrammeNotFoundException</code> without
     * detail message.
     */
    public ProgrammeNotFoundException() {
    }

    /**
     * Constructs an instance of <code>ProgrammeNotFoundException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public ProgrammeNotFoundException(String msg) {
        super(msg);
    }
}
