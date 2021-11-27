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
public class UpdatePECProgrammeInfoException extends Exception {

    /**
     * Creates a new instance of <code>UpdatePECProgrammeInfoException</code>
     * without detail message.
     */
    public UpdatePECProgrammeInfoException() {
    }

    /**
     * Constructs an instance of <code>UpdatePECProgrammeInfoException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public UpdatePECProgrammeInfoException(String msg) {
        super(msg);
    }
}
