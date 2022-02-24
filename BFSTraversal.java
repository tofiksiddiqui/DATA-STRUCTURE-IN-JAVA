import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {
    LinkedList<Integer> adjacency[];

    public BFSTraversal(int v) {
        adjacency = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjacency[i] = new LinkedList<Integer>();
        }

    }

    public void insertedEdge(int s, int d) {
        adjacency[s].add(d);
        adjacency[d].add(s);
    }

    public void bfsDisplay(int source) {
        boolean visitedNodes[] = new boolean[adjacency.length];
        int parentNodes[] = new int[adjacency.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visitedNodes[source] = true;
        parentNodes[source] = -1;
        while (!queue.isEmpty()) {
            int print;
            print = queue.poll();
            System.out.println("Printing element : " + print);
            for (int i : adjacency[print]) {
                if (visitedNodes[i] != true) {
                    visitedNodes[i] = true;
                    queue.add(i);
                    parentNodes[i] = print;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vertices;
        int edges;
        System.out.println("Enter the number of Vertices and Edges : ");
        System.out.println("This is good java Programming");
        System.out.println();
        vertices = scanner.nextInt();
        edges = scanner.nextInt();
        BFSTraversal bfs = new BFSTraversal(vertices);
        System.out.println("Enter the edges : ");
        for (int i = 0; i < edges; i++) {
            int s = scanner.nextInt();
            int d = scanner.nextInt();
           bfs.insertedEdge(s, d);
        }
        System.out.println("Enter the source from where you want to traverse : ");
        System.out.println("Java is a good programming\n");
        System.out.println("Java Programming is a good programming...Which is my favourite programming\n");
        int source = scanner.nextInt();
        bfs.bfsDisplay(source);

    }

}
