package geek.com;

import java.util.Comparator;

public class CompByPriceMemoryName implements Comparator<Notebook> {

    @Override
    public int compare(Notebook o1, Notebook o2) {
        int flag = o1.getPrice() - o2.getPrice();
        // если получили 0, то сортируем по памяти
        if (flag == 0) {
            flag = o1.getMemory() - o2.getMemory();
            if (flag == 0){
                flag = o1.getName().ordinal() - o2.getName().ordinal(); // сортировка по имени, по номеру в перечислению
            }
        }
        return flag;
    }
}
