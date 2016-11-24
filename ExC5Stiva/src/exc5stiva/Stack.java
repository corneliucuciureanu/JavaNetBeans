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
public interface Stack {
    void push(Object item) throws StackException;
    void pop() throws StackException;
    Object peek() throws StackException;
    boolean empty();
    String toString();    
}
