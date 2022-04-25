package geek.com;

import java.util.List;

public interface Graph {

    void addVertex(String label);

    boolean addEdge(String startLabel, String secondLabel, Integer distance);

    int getSize();

    void display();

    void dfs(String startLabel, String endlabel);
}
