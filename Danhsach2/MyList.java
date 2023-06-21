package Danhsach2;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(E e) {
        ensureCapacity();
        elements[size] = e;
        size++;
    }

    public void add(E e, int index) {
        ensureCapacity();
        validateIndex(index);
        for (int i = size + 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] =e;
        size++;
    }
    public E remove(int index) {
        validateIndex(index);
        E result = (E) elements[index];
        for (int i = index; i < size-1; i++) {
            elements[i] = elements [i+1];
        }
        size--;
        return result;
    }
    public int size() {return size;}

    public Object clone () {
        MyList<E> result = new MyList<>(size);
        for (int i = 0; i < size; i++) {
            result.add((E) elements[i]);
        }
        return result;
    }
//    boolean
    public boolean contains (E o) {
        if (o instanceof Object){
            Object str = (Object) o;
            for (Object element:elements) {
                if (element.equals(str))
                    return true;
            }
        }
        return false;
    }
//    indexOf
    public int indexOf(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(o))
                return i;
        }
        return -1;
    }
//  boolean


    public void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2);
        }
    }

    public void validateIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException(String.format("%d out of %s a array", index, size));
    }
}
