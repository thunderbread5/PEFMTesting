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
public class FCProgrammeInfoNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>FCProgrammeInfoNotFoundException</code>
     * without detail message.
     */
    public FCProgrammeInfoNotFoundException() {
    }

    /**
     * Constructs an instance of <code>FCProgrammeInfoNotFoundException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public FCProgrammeInfoNotFoundException(String msg) {
        super(msg);
    }
}
