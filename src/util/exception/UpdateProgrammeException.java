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
public class UpdateProgrammeException extends Exception {

    /**
     * Creates a new instance of <code>UpdateProgrammeException</code> without
     * detail message.
     */
    public UpdateProgrammeException() {
    }

    /**
     * Constructs an instance of <code>UpdateProgrammeException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UpdateProgrammeException(String msg) {
        super(msg);
    }
}
