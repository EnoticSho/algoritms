package geek.com;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        testGraph();
    }

    private static void testGraph() {
        Graph graph = new GraphImpl(10);

        graph.addVertex("Москва");
        graph.addVertex("Тула");
        graph.addVertex("Липецк");
        graph.addVertex("Воронеж");
        graph.addVertex("Рязань");
        graph.addVertex("Тамбов");
        graph.addVertex("Саратов");
        graph.addVertex("Калуга");
        graph.addVertex("Орел");
        graph.addVertex("Курск");

        graph.addEdge("Москва", "Тула", 1);
        graph.addEdge("Тула", "Липецк", 2);
        graph.addEdge("Липецк", "Воронеж", 3);
        graph.addEdge("Москва", "Рязань",3);
        graph.addEdge("Рязань", "Тамбов",4);
        graph.addEdge("Тамбов", "Саратов",6);
        graph.addEdge("Саратов", "Воронеж",7);
        graph.addEdge("Москва", "Калуга",8);
        graph.addEdge("Калуга", "Орел",9);
        graph.addEdge("Орел", "Курск",10);
        graph.addEdge("Курск", "Воронеж",11);

        System.out.println("Size of graph is " + graph.getSize());
        graph.display();
        graph.dfs("Москва", "Воронеж");
    }
}
