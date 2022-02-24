import java.util.Scanner;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Stack;

public class DFSTraversal {
    Scanner scanner = new Scanner(System.in);
    LinkedList<Integer> adjacency[];

    public DFSTraversal(int v) {
        adjacency = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjacency[i] = new LinkedList<Integer>();
        }
    }

    public void insertedEdge(int s, int d) {
        adjacency[s].add(d);
        adjacency[d].add(s);
    }

    public void dfsDisplay(int source) {

        boolean visitedNodes[] = new boolean[adjacency.length];
        int parentNodes[] = new int[adjacency.length];
        Stack<Integer> stk = new Stack<>();
        stk.add(source);
        visitedNodes[source] = true;
        parentNodes[source] = -1;
        while (!stk.isEmpty()) {
            int p;
            p = stk.pop();
            System.out.println("Dfs traversal is : " + p);
            for (int i : adjacency[p]) {
                if (visitedNodes[i] != true) {
                    visitedNodes[i] = true;
                    stk.add(i);
                    parentNodes[i] = p;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Vertices and Edges : ");
        int vertices = scanner.nextInt();
        int edges = scanner.nextInt();
        DFSTraversal dfs = new DFSTraversal(vertices);
        System.out.println("Enter edges : ");
        for (int i = 0; i < edges; i++) {
            int s = scanner.nextInt();
            int d = scanner.nextInt();
            dfs.insertedEdge(s, d);
        }
        System.out.println("Enter the source where you want to traverse the graph : ");
        int source = scanner.nextInt();
        dfs.dfsDisplay(source);

    }
}
