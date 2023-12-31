package Danhsach;

import java.util.Arrays;

public class MyList <E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa() {
        int newsize = elements.length*2;
        if(size == elements.length)
        elements = Arrays.copyOf(elements,newsize);
    }
    public void add(E e) {
            ensureCapa();
        elements[size] = e;
        size++;
    }
    public E get (int i) {
        if ( i >= size || i < 0)
            throw new IndexOutOfBoundsException("Index" + i + ", Size " + i);
        return (E) elements [i];
    }

}
