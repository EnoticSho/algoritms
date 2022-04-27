package geek.com;

public class Main {
    public static void main(String[] args) {
        ChainingHashMap<Integer ,String> map = new ChainingHashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(12,"12");
        map.put(15,"15");
        map.put(3,"3");
        map.put(4,"4");
        map.put(5,"5");
        map.put(6,"6");
        map.put(7,"7");
        map.put(8,"8");
        map.put(9,"9");
        map.put(10,"10");
        map.put(11,"11");
        map.put(13,"13");


        System.out.println(map);
        System.out.println("map.get(2): " + map.get(2));
        System.out.println("map.delete(1): " + map.delete(1));
        System.out.println(map);
    }
}
