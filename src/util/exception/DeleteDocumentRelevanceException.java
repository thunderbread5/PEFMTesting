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
public class DeleteDocumentRelevanceException extends Exception {

    /**
     * Creates a new instance of <code>DeleteDocumentRelevanceException</code>
     * without detail message.
     */
    public DeleteDocumentRelevanceException() {
    }

    /**
     * Constructs an instance of <code>DeleteDocumentRelevanceException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public DeleteDocumentRelevanceException(String msg) {
        super(msg);
    }
}
