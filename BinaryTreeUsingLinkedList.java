import java.util.Scanner;
public class BinaryTreeUsingLinkedList{
	static class Node{
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
	
	static Node Create(){
		Scanner scanner = new Scanner(System.in);
		Node root = null;
		System.out.print("\n");
		System.out.print("Enter the data : ");
		int data = scanner.nextInt();
		if(data == -1)
			return null;
		root = new Node(data);
		System.out.print("Enter the left child of this : "+root.data);
		root.left = Create();
		System.out.print("Enter the right child of this : "+root.data);
		root.right = Create();
		return root;
	}

	static void Inorder(Node root){
		if(root == null)
			return;
		Inorder(root.left);
		System.out.print("Inorder traversal is : "+root.data);
		Inorder(root.right);
	}
	static void Postorder(Node root){
		if(root == null)
			return;
		Postorder(root.left);
		Postorder(root.right);
		System.out.print("Postorder traversal is : "+root.data);
	}

	static void Preorder(Node root){
		if(root == null)
			return;
		System.out.print("Preorder trvaersal is : "+root.data);
		Preorder(root.left);
		Preorder(root.right);
	}
	public static void main(String[] args) {
		Node root;
		root = Create();
		Inorder(root);
		Preorder(root);
		Postorder(root);
		
	}
}

