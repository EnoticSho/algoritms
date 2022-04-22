package geek.com;

public class Main {
    public static void main(String[] args) {
        SimpleLinkedListImpl<Integer> list = new SimpleLinkedListImpl<>();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertFirst(9);
        list.display();
        System.out.println(list.getFirst());
        testHomeWork(list);
//        Deque<Integer> deque = new DequeImpl<>(5);
//        deque.display();
//        deque.insertLeft(1);
//        deque.insertLeft(2);
//        deque.insertRight(4);
//        deque.insertRight(5);
//        deque.insertRight(6);
//        deque.insertRight(7);
//        deque.removeLeft();
//        deque.removeRight();
//        deque.removeRight();
//        System.out.println(deque.peekLeft());
//        System.out.println(deque.peekRight());
//        System.out.println(deque.size());
//        deque.display();

    }
    private static <E> void testHomeWork(SimpleLinkedListImpl<E> linkedList) {
        //ДОЛЖНО РАБОТАТЬ!
        for (E value : linkedList) {
            System.out.println("value: " + value);
        }
    }
}
