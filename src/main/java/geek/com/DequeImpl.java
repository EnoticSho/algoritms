package geek.com;

import java.util.Arrays;
import java.util.Iterator;

public class DequeImpl<E> implements Deque<E>{
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
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = data.length - 1;
        } else front = front - 1;
        data[front] = value;
        size++;
        return true;
    }

    @Override
    public boolean insertRight(E value) {
        if (isFull()) {
            return false;
        }
        if (front == -1) {
            rear = 0;
            front = 0;
        } else if (rear == data.length - 1) {
            rear = 0;
        } else rear = rear + 1;
        data[rear] = value;
        size++;
        return true;
    }

    @Override
    public E removeLeft() {
        if (isEmpty()) {
            return null;
        }
        E value = data[front];
        data[front++] = null;
        if (front == data.length) {
            front = 0;
        }
        size--;
        return value;
    }

    @Override
    public E removeRight() {
        if (isEmpty()) {
            return null;
        }
        E value = data[rear];
        data[rear--] = null;
        if (rear == 0) {
            rear = data.length - 1;
        }
        size--;
        return value;
    }

    @Override
    public E peekLeft() {
        if (isEmpty()) {
            return null;
        }
        return data[front];
    }

    @Override
    public E peekRight() {
        if (isEmpty()) {
            return null;
        }
        return data[rear];
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
