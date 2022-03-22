package ibu.edu;

import java.util.EmptyStackException;

public class Stack<Item> {
    private Node<Item> top;
    private int size;

    private class Node <Item>{
        private Item data;
        private Node<Item> next;
        public Node(Item data){
            this.data = data;
            this.next = null;
        }
    }


    /* Push an item onto the stack */
    public void push(Item item) {
        Node<Item> newNode = new Node<Item>(item);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public Item pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Item result = top.data;
        top = top.next;
        size--;
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public int size(){
        return size;
    }
    public void displayStack(){
        Node current = top;
        while (current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }

}


