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
public class DocumentRelevanceExistedException extends Exception {

    /**
     * Creates a new instance of <code>DocumentRelevanceExistedException</code>
     * without detail message.
     */
    public DocumentRelevanceExistedException() {
    }

    /**
     * Constructs an instance of <code>DocumentRelevanceExistedException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public DocumentRelevanceExistedException(String msg) {
        super(msg);
    }
}
