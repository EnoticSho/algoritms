package geek.com;

import java.util.*;

public class GraphImpl implements Graph {
    private final List<Vertex> vertexList;
    private final Integer[][] adjMatrix;
    private static int minDistance;
    String string = "";
    Map<Integer, String> map = new TreeMap<>();

    public GraphImpl(int maxVertexCount) {
        this.vertexList = new ArrayList<>(maxVertexCount);
        this.adjMatrix = new Integer[maxVertexCount][maxVertexCount];
    }

    @Override
    public void addVertex(String label) {
        vertexList.add(new Vertex(label));
    }

    @Override
    public boolean addEdge(String startLabel, String secondLabel, Integer distance) {
        int startIndex = indexOf(startLabel);
        int secondIndex = indexOf(secondLabel);

        if (startIndex == -1 || secondIndex == -1) {
            return false;
        }

        adjMatrix[startIndex][secondIndex] = distance;
        adjMatrix[secondIndex][startIndex] = distance;

        return true;
    }

    private int indexOf(String label) {
        for (int i = 0; i < vertexList.size(); i++) {
            if (vertexList.get(i).getLabel().equals(label)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int getSize() {
        return vertexList.size();
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < getSize(); i++) {
            sb.append(vertexList.get(i));
            for (int j = 0; j < getSize(); j++) {
                if (adjMatrix[i][j] != null) {
                    sb.append(" -> ").append("(" + adjMatrix[i][j] + ")").append(vertexList.get(j));
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public void dfs(String startLabel, String endlabel) {
        int startIndex = indexOf(startLabel);
        int endIndex = indexOf(endlabel);

        if (startIndex == -1 || endIndex == -1) {
            throw new IllegalArgumentException("Неверная вершина");
        }

        Stack<Vertex> stack = new Stack<>();
        Vertex vertex = vertexList.get(startIndex);
        Vertex vertex1 = vertexList.get(endIndex);

        visitVertex(stack, vertex);
        while (!stack.isEmpty()) {
            vertex = getNearUnvisitedVertex(stack.peek());
            if (vertex == null || vertex.equals(vertex1)) {
                stack.pop();
                if (minDistance != 0) {
                    string = string.concat(vertex1.toString());
                    map.put(minDistance, string);
                }
            } else {
                visitVertex(stack, vertex);
            }
        }
        System.out.println(map.get(map.keySet().toArray()[0]) + " Расстояние " + map.keySet().toArray()[0]);
    }

    public Vertex getNearUnvisitedVertex(Vertex vertex) {
        int current = vertexList.indexOf(vertex);
        for (int i = 0; i < getSize(); i++) {
            if (adjMatrix[current][i] != null && !vertexList.get(i).isVisited()) {
                minDistance += adjMatrix[current][i];
                string = string.concat(vertex.toString()).concat(" -> ");
                return vertexList.get(i);
            }
        }
        string = "";
        minDistance = 0;
        return null;
    }

    private void visitVertex(Stack<Vertex> stack, Vertex vertex) {
       // System.out.print(vertex.getLabel() + " ");
        stack.push(vertex);
        vertex.setVisited(true);
    }
}
