package geek.com;

public class Main {
    public static void main(String[] args) {
        System.out.println(power(2, 3));
        System.out.println(power(2, 10));
        System.out.println(power(5, 3));
        int[] weight = {1, 4, 3 , 2};
        int[] price = {1500, 3000, 2000, 3000};
        int bugMass = 6;
        System.out.println(priceBag(weight, price, weight.length, bugMass));
    }

    public static long power(long number, int p) {
        if (p == 0) {
            return 1;
        }
        return number * power(number, --p);
    }

    public static long priceBag(int[] weights, int[] prices, int n, int bagMass) {
        if (n == 0) {
            return 0;
        }
        int mass = 0;
        int value = 0;
        for (int i = n - 1; i >= 0; i--) {
            mass += weights[i];
            value += prices[i];
            if (mass > bagMass) {
                mass -= weights[i];
                value -= prices[i];
            }
        }
        return value > priceBag(weights, prices, n - 1, bagMass) ? value : priceBag(weights, prices, n - 1, bagMass);
    }
}
