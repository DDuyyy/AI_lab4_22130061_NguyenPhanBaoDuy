public class Main {
    / Main application class
public class Main {
    public static void main(String[] args) {
        Node startNode = new Node();
        Node goalNode = new Node();

        
        Node pathFromStartToGoalGreedy = SearchAlgorithms.executeGreedyBestFirst(startNode, goalNode.getLabel());
        Node pathFromStartToGoalAStar = SearchAlgorithms.executeAStar(startNode, goalNode.getLabel());

}
