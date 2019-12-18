package myList;

import myList.CapacityExceededEcpeption.CapacityExceededException;

import java.util.Arrays;

public class MyList<E> {
    private int capacity;
    private int size;
    private Object[] myList;
    private static int DEFAULT_CAPACITY = 10;

    public MyList(int capacity){
        this.capacity = capacity;
        myList = new Object[capacity];
        size = 0;
    }

    public MyList(){
        this(DEFAULT_CAPACITY);
    }

    public void add(E a) throws CapacityExceededException {
        if (size == capacity) {
            throw new CapacityExceededException("list capacity exceeded");
        }
        myList[size++] = a;
    }

    public E get(int index) throws RuntimeException{
        if (index < 0 || index >= size) {
            throw new RuntimeException("index out of bounds");
        }
        return (E) myList[index];
    }

    public void remove(int index) throws IndexOutOfBoundsException {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        Object item = myList[index];
        int numElts = myList.length - ( index + 1 ) ;
        System.arraycopy( myList, index + 1, myList, index, numElts ) ;
        size--;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for(int i = 0; i < size ; i++) {
            sb.append(myList[i].toString());
            if(i < size-1){
                sb.append(",");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    private void ensureCapacity() {
        int newSize = (int) (myList.length * 1.5 + 1);
        myList = Arrays.copyOf(myList, newSize);
    }
}
