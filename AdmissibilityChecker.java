import java.util.*;

public class Node {
    private String label;
    private double h;



    public static class AdmissibilityChecker {
        public static boolean isAdmissibleH(Node root, String goal) {
         
        }
    }
}

class Edge {
    
}

public class Main {
    public static void main(String[] args) {
        Node root = new Node("A");
        String goal = "B";

        boolean isAdmissible = Node.AdmissibilityChecker.isAdmissibleH(root, goal);
        System.out.println("Is heuristic admissible? " + isAdmissible);
    }
}
