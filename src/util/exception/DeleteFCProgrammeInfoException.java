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
public class DeleteFCProgrammeInfoException extends Exception {

    /**
     * Creates a new instance of <code>DeleteFCProgrammeInfoException</code>
     * without detail message.
     */
    public DeleteFCProgrammeInfoException() {
    }

    /**
     * Constructs an instance of <code>DeleteFCProgrammeInfoException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public DeleteFCProgrammeInfoException(String msg) {
        super(msg);
    }
}
