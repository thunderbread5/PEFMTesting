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
public class UpdateFCProgrammeInfoException extends Exception {

    /**
     * Creates a new instance of <code>UpdateFCProgrammeInfoException</code>
     * without detail message.
     */
    public UpdateFCProgrammeInfoException() {
    }

    /**
     * Constructs an instance of <code>UpdateFCProgrammeInfoException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public UpdateFCProgrammeInfoException(String msg) {
        super(msg);
    }
}
