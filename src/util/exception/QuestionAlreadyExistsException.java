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
public class QuestionAlreadyExistsException extends Exception {

    /**
     * Creates a new instance of <code>QuestionALreadyExistsException</code>
     * without detail message.
     */
    public QuestionAlreadyExistsException() {
    }

    /**
     * Constructs an instance of <code>QuestionALreadyExistsException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public QuestionAlreadyExistsException(String msg) {
        super(msg);
    }
}
