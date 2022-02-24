import java.util.LinkedList;
import java.util.Scanner;

public class GraphUsingLinkedList {
	LinkedList<Integer> adjacency[];

	public GraphUsingLinkedList(int v) {
		adjacency = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adjacency[i] = new LinkedList<Integer>();

		}

	}

	public void insertedEdge(int s, int d) {
		adjacency[s].add(d);
		adjacency[d].add(s);
		System.out.println("Source : " + adjacency[s]);
		System.out.println("Destination : " + adjacency[d]);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of Vertices and Edges : ");
		int vertices = scanner.nextInt();
		int edges = scanner.nextInt();
		GraphUsingLinkedList g = new GraphUsingLinkedList(vertices);
		System.out.println("Enter the source and destination : ");
		for (int i = 0; i < edges; i++) {
			int source = scanner.nextInt();
			int destination = scanner.nextInt();
			g.insertedEdge(source, destination);
		}
	}

}