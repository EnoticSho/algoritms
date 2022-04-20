package geek.com;

public class Main {
    public static void main(String[] args) {
        System.out.println(power(2,3));
        System.out.println(power(2,10));
        System.out.println(power(5,3));
    }

    public static long power(long number, int p){
        if (p == 0){
            return 1;
        }
        return number*power(number, --p);
    }
}
