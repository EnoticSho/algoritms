package geek.com;

public class Notebook {
    private final int price;
    private final int memory;
    private final manufacturers name;

    public Notebook() {
        this.price = 500 + 50 * (int) (Math.random() * 31);
        this.memory = 4 + 4 * (int) (Math.random() * 6);
        this.name = manufacturers.values()[(int) (Math.random() * 5)];
    }

    public int getPrice() {
        return price;
    }

    public int getMemory() {
        return memory;
    }

    public manufacturers getName() {
        return name;
    }
}
