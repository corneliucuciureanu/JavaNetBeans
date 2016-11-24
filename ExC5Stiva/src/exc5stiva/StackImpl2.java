/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc5stiva;

/**
 *
 * @author morfeus
 *  Implementarea stivei folosind o lista inlantuita
 */
public class StackImpl2 implements Stack {
    
    class Node {
        //Clasa interna ce reprezinta un nod al listei
        Object item; // informatia din nod
        Node link; // legatura la urmatorul nod
        Node(Object item, Node link) {
            this.item = item;
            this.link = link;
        }
    }
    
    private Node top = null;
    // Referinta la varful stivei 
    
    public void push(Object item) {
        Node node = new Node(item, top);
        top = node;
    }
    
    public void pop() throws StackException {
        if (empty())
            throw new StackException("Stiva este vida!");
        top = top.link;
    }
    
    public Object peek() throws StackException {
        if (empty())
            throw new StackException("Stiva este vida!");
        return top.item;
    }
    
    public boolean empty() {
        return (top == null);
    }
    
    public String toString() {
        String s="";
        Node node = top;
        while (node != null) {
            s += (node.item).toString()+ " ";
            node = node.link;
        }
        return s;
    }
    
}
