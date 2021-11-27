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
public class DeletePECProgrammeInfoException extends Exception {

    /**
     * Creates a new instance of <code>DeletePECProgrammeInfoException</code>
     * without detail message.
     */
    public DeletePECProgrammeInfoException() {
    }

    /**
     * Constructs an instance of <code>DeletePECProgrammeInfoException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public DeletePECProgrammeInfoException(String msg) {
        super(msg);
    }
}
