package geek.com;

import java.util.Arrays;
import java.util.Iterator;

public class DequeImpl<E> implements Deque<E> {
    private final E[] data;
    private int size;
    private int front;
    private int rear;

    public DequeImpl(int length) {
        this.data = (E[]) new Object[length];
        this.front = -1;
        this.rear = 0;
        this.size = 0;
    }

    @Override
    public boolean insertLeft(E value) {
        if (isFull()) {
            return false;
        }
        if (front == -1){
            front++;
            rear++;
        }else if (front == 0){
            front = size - 1;
        }else front = front - 1;
        data[front] = value;
        return true;
    }

    @Override
    public boolean insertRight(E value) {
        if (isFull()) {
            return false;
        }

        return true;
    }

    @Override
    public E removeLeft() {
        return null;
    }

    @Override
    public E removeRight() {
        return null;
    }

    @Override
    public boolean insert(E value) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E peekFront() {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public void display() {
        System.out.println(Arrays.toString(data));
    }
}
