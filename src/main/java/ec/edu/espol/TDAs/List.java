package TDAs;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public interface List<E> extends Iterable<E> {

    boolean addFirst(E element);

    boolean addLast(E element);

    boolean removeFirst();

    boolean removeLast();

    E getFirst();

    E getLast();

    boolean insert(int index, E element);

    boolean contains(E element);

    E get(int index);

    int indexOf(E element);

    boolean isEmpty();

    E remove(int index);

    boolean remove(E element);

    E set(int index, E element);

    int size();
    
    List<E> findAll(E element, Comparator<E> cmp);

    List<E> findLower(E element, Comparator<E> cmp);

    List<E> findGreater(E element, Comparator<E> cmp);

    List<E> findBetween(E element1, E element2, Comparator<E> cmp);


}
