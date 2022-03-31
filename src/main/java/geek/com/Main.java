package geek.com;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Notebook[] notebooks = new Notebook[10000];
        for (int i = 0; i < notebooks.length; i++) {
            notebooks[i] = new Notebook();
        }
        for (Notebook a : notebooks) {

            System.out.println(a.getPrice() + " " + a.getMemory() + " " + a.getName());
        }
    }
}
