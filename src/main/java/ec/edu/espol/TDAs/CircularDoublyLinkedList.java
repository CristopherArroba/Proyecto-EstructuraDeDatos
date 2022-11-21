/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDAs;

import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author USER
 */
public class CircularDoublyLinkedList<E> implements List<E> {
    private Node<E> last;
    private int current;
    
    @Override
    public boolean addFirst(E e) {
        Node<E> n = new Node<>(e);
        if (isEmpty()) {
            last = n;
            last.next = last;
            last.previous = last;
        } else {
            Node<E> first = last.next;
            last.next = n;
            n.next = first;
            first.previous = n;
            n.previous = last;
        }
        current++;
        return true;

    }

    @Override
    public boolean addLast(E e) {
        Node<E> n = new Node<>(e);
        if (isEmpty()) {
            last = n;
            last.next = last;
            last.previous = last;
        } else {
            n.next = last.next;
            last.next.previous = n;
            last.next = n;
            n.previous = last;
            last = n;
        }
        current++;
        return true;
    }

   

    @Override
    public int size() {
        return current;
    }

    @Override
    public boolean isEmpty() {
        return current == 0;
    }

    

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
////////////////////////////////////////
    private Node<E> getNode(int index) {
        if (isEmpty() || (index < 0 || index >= current)) {
            return null;
        } else {
            int i = 0;
            for (Node<E> q = last.next; i < current; q = q.next) {
                if (i == index) {
                    return q;
                }
                i++;
            }
            return null;
        }
    }

    @Override
    public E get(int index) {
        return getNode(index).data;
    }
    
    ///////////////////////////////

   
    
    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Node<E> p = last.next; p != last; p = p.next) {
            sb.append(p.data);
            sb.append(", ");
        }
        sb.append(last.data);
        sb.append("]");
        return sb.toString();

    }

    @Override
    public boolean removeFirst() {
        if (isEmpty()) {
            return false;
        }
        if (current == 1) {
            last.next.data = null;
            last.next = last = null;
        } else {
            last.next.data = null;
            Node<E> tmp = last.next.next;
            last.next.next = null;
            tmp.previous = null;
            last.next = tmp;
        }
        current--;
        return true;
    }

    @Override
    public boolean removeLast() throws NullPointerException {
        if (isEmpty()) {
            throw new NullPointerException();
        } else if (current == 1) {
            last.data = null;
            last.next = last.previous = null;
        } else {
            Node<E> n = last.previous;
            n.next = last.next;
            last.next.previous = n;
            last.data = null;
            last.next = last.previous = null;
            last = n;
        }
        current--;
        return true;
    }

    @Override
    public E getFirst() {
        if (isEmpty()) {
            return null;
        } else {
            return last.next.data;
        }
    }

    @Override
    public E getLast() {
        if (isEmpty()) {
            return null;
        } else {
            return last.data;
        }

    }

    @Override
    public boolean insert(int index, E element) {
        Node<E> newNode = new Node(element);
        if (index < 0 || index > current) {
            System.out.println("Insertion at index " + index + " is not possible.");
            return false;
        } else if (index == 0) {
            addFirst(element);
        } else if (index == current) {
            addLast(element);
        } else {
            Node traversalNode = last;
            for (int i = 0; i < index - 1; i++) {
                traversalNode = traversalNode.getNext();
            }
            newNode.setNext(traversalNode.getNext());
            traversalNode.getNext().setPrevious(newNode);
            traversalNode.setNext(newNode);
            newNode.setPrevious(traversalNode);
            current++;
        }
        return true;
    }

    @Override
    public boolean contains(E element) {
        if (isEmpty() || element == null) {
            return false;
        } else {
            int i = 0;
            for (Node<E> q = last.next; i < current; q = q.next) {
                if (q.data.equals(element)) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    @Override
    public int indexOf(E element) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean remove(E element) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<E> findAll(E element, Comparator<E> cmp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<E> findLower(E element, Comparator<E> cmp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<E> findGreater(E element, Comparator<E> cmp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<E> findBetween(E element1, E element2, Comparator<E> cmp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
    
    private class Node<E> {

        private E data;
        private Node<E> next;
        private Node<E> previous;
        
        public Node(E data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }

        public Node(E data, Node next, Node previous) {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrevious() {
            return previous;
        }

        public void setPrevious(Node<E> previous) {
            this.previous = previous;
        }


        
    }
    
}
