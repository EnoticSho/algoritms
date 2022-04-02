package geek.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Notebook> notebooks = new ArrayList<>(10000);
        for (int i = 0; i < 10000; i++) {
            notebooks.add(new Notebook());
        }

        notebooks.sort(new CompByPriceMemoryName());

        for (Notebook a : notebooks) {
            System.out.println(a.getPrice() + " " + a.getMemory() + " " + a.getName());
        }
    }
}
