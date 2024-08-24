package graph;

import java.util.ArrayList;

public class GraphTest {
    public static void main(String[] args) {
        prepareGraph();
    }

    private static void prepareGraph() {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);

        //print All edges
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + "");
            }
            System.out.println();
        }
    }
}
