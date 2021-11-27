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
public class AgencyUserIsTheOnlyAgencyAdministratorException extends Exception {

    /**
     * Creates a new instance of
     * <code>AgencyUserIsTheOnlyAgencyAdministratorException</code> without
     * detail message.
     */
    public AgencyUserIsTheOnlyAgencyAdministratorException() {
    }

    /**
     * Constructs an instance of
     * <code>AgencyUserIsTheOnlyAgencyAdministratorException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public AgencyUserIsTheOnlyAgencyAdministratorException(String msg) {
        super(msg);
    }
}
