
package br.com.amaral.exceptions;

/**
 * @author leandro.amaral
 *
 */
public class DadosInvalidosException extends Exception {

    public DadosInvalidosException(String msg) {
        this(msg, null);
    }

    public DadosInvalidosException(String msg, Throwable e) {
        super(msg, e);
    }
}
