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
public class PECProgrammeInfoNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>PECProgrammeInfoNotFoundException</code>
     * without detail message.
     */
    public PECProgrammeInfoNotFoundException() {
    }

    /**
     * Constructs an instance of <code>PECProgrammeInfoNotFoundException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public PECProgrammeInfoNotFoundException(String msg) {
        super(msg);
    }
}
