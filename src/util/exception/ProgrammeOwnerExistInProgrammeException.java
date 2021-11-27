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
public class ProgrammeOwnerExistInProgrammeException extends Exception {

    /**
     * Creates a new instance of <code>ProgrammeOwnerExistInProgramme</code>
     * without detail message.
     */
    public ProgrammeOwnerExistInProgrammeException() {
    }

    /**
     * Constructs an instance of <code>ProgrammeOwnerExistInProgramme</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public ProgrammeOwnerExistInProgrammeException(String msg) {
        super(msg);
    }
}
