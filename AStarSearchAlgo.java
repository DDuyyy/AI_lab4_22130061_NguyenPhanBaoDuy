 import java.util.*;

public class AStarSearchAlgo {
    public static void execute(Node root, String goal) {
        PriorityQueue<Node> openSet = new PriorityQueue<>(Comparator.comparing(node -> node.getCost() + heuristic(node, goal)));
        Map<Node, Double> gScores = new HashMap<>();
        Set<Node> closedSet = new HashSet();

        openSet.add(root);
        gScores.put(root, 0.0);

        while (!openSet.isEmpty()) {
            Node current = openSet.poll();

            if (current.getState().equals(goal)) {
                
                System.out.println("Goal reached: " + current.getState());
                return;
            }

            closedSet.add(current);

            for (Node neighbor : current.getNeighbors()) {
                double tentativeGScore = gScores.get(current) + neighbor.getCost();

                if (closedSet.contains(neighbor) && tentativeGScore >= gScores.get(neighbor)) {
                    continue; 
                }

                if (!closedSet.contains(neighbor) || tentativeGScore < gScores.get(neighbor)) {
                    gScores.put(neighbor, tentativeGScore);
                    neighbor.setCost(tentativeGScore);
                    neighbor.setHeuristic(heuristic(neighbor, goal));
                    if (!openSet.contains(neighbor)) {
                        openSet.add(neighbor);
                    }
                }
            }
        }

        
        System.out.println("No solution found.");
    }

    private static double heuristic(Node node, String goal) {
   
    }
}

}
