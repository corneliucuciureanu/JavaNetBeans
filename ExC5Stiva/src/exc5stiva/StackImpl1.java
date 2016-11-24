/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc5stiva;

/**
 *
 * @author morfeus
 * Implementarea stivei folosind un vector de obiecte
 */
public class StackImpl1 implements Stack{
    private Object items[];
    // Vectorul ce contine obiectele
    private int n=0;
    // Numarul curent de elemente din stiva
    
    public StackImpl1(int max){
        //Constructor
        items = new Object[max];
    }
    
    public StackImpl1() {
        this(100);
    }
    
    public void push(Object item) throws StackException {
        if (n == items.length) 
            throw new StackException("Stiva este plina!");
        items[n++] = item;
    }
    
    public void pop() throws StackException {
        if (empty())
            throw new StackException("Stiva este vida!");
        items[--n] = null;
    }
    
    public Object peek() throws StackException {
        if( empty())
            throw new StackException("Stiva este vida!");
        return items[n-1];
    }
    
    public boolean empty() {
        return (n==0) ;
    }
    
    public String toString() {
        String s="";
        for (int i=n-1; i>=0; i--) 
            s+=items[i].toString() + " ";
        return s;
    }
    
}
