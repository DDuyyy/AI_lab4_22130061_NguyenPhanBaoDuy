import java.util.*;

public class GreedyBestFirstSearchAlgo {
    public static void execute(Node root, String goal) {
        PriorityQueue<Node> openSet = new PriorityQueue<>(Comparator.comparing(node -> heuristic(node, goal)));
        Set<Node> closedSet = new HashSet<>();

        openSet.add(root);

        while (!openSet.isEmpty()) {
            Node current = openSet.poll();

            if (current.getState().equals(goal)) {
              
                System.out.println("Goal reached: " + current.getState());
                return;
            }

            closedSet.add(current);

            for (Node neighbor : current.getNeighbors()) {
                if (!closedSet.contains(neighbor) && !openSet.contains(neighbor)) {
                    openSet.add(neighbor);
                }
            }
        }

    
        System.out.println("No solution found.");
    }

    private static int heuristic(Node node, String goal) {
       
        return node.getState().length() - goal.length();
    }
}
