/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc5stiva;

/**
 *
 * @author morfeus
 */
public class StackException extends Exception {

    /**
     * Creates a new instance of <code>StackException</code> without detail
     * message.
     */
    public StackException() {
        super();
    }

    /**
     * Constructs an instance of <code>StackException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public StackException(String msg) {
        super(msg);
    }
}
