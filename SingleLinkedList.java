/**
 * ! Linked list program and all function
 */

import java.util.Scanner;
import java.util.HashSet;
public class SingleLinkedList {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head = null;

	public void insertAtBegin() {
		int data;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Element at Begining : ");
		data = scanner.nextInt();
		Node newNode = new Node(data);
		newNode.next = null;
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		System.out.println("The node " + newNode.data + " is successfully allocated in the list\n\n");

	}

	public void insertAtMid() {
		int data;
		int position;
		System.out.println("Enter the position where you want to insert : ");
		Scanner scanner = new Scanner(System.in);
		position = scanner.nextInt();
		Node temp;
		if (head == null) {
			System.out.println("Memory is not allocated !\n\n");

		} else {
			temp = head;
			for (int i = 0; i < (position - 1); i++) {
				temp = temp.next;
				i++;
			}
			System.out.println("Enter the the element at a given position : ");
			data = scanner.nextInt();
			Node newNode = new Node(data);
			System.out.println("The node " + temp.data + " is successfully allocated in the list\n\n");
			newNode.next = temp.next;
			temp.next =newNode;

		}

	}

	public void insertAtEnd() {
		int data;
		Node temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the data");
		data = scanner.nextInt();
		Node newNode = new Node(data);
		if (head == null) {
			System.out.println("List is empty !\n\n");
		} else {
			temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			System.out.println("The node " + temp.data + " is successfully allocated in the list\n\n");
            
		}
	}

	public void Display() {
		Node temp;
		temp = head;
		if (head == null) {
			System.out.print("List is empty\n");
		} else {
			while (temp != null) {
				System.out.print("Element is : \t" + temp.data);
				System.out.println();
				temp = temp.next;
			}
		}

	}

	public void DeleteAtBegin() {
		if (head == null) {
			System.out.println("List is empty !");
		} else {
			System.out.println("Element [ " + head.data + " ] is deleted ");
			Node temp;
			temp = head;
			temp = temp.next;
			head = temp;
		}
	}

	public void DeleteAtMid() {
		int position;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the position to delete that node from list : ");
		position = scanner.nextInt();
		Node temp1;
		Node temp2;
		temp1 = head;
		temp2 = temp1.next;
		for (int i = 0; i < (position - 1); i++) {
			temp1 = temp2;
			temp2 = temp2.next;
			i++;
		}
		temp1.next = temp2.next;
	}

	public void DeleteAtEnd() {
		Node temp1;
		Node temp2;
		temp1 = head;
		temp2 = temp1.next;
		while (temp2.next != null) {
			temp1 = temp2;
			temp2 = temp2.next;
		}
		temp1.next = null;

	}

	public int FindLength() {
		int count = 0;
		Node temp;
		temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;

		}
		return count;
	}

	public void search() {
		Node temp;
		int searchKey;
		System.out.println("Enter an item to be searched : ");
		System.out.println("This is Java Programming");
		Scanner scanner = new Scanner(System.in);
		searchKey = scanner.nextInt();
		if (head == null) {
			System.out.println("List is empty !");
		} else {
			temp = head;
			while (temp != null) {
				if (temp.data == searchKey) {
					System.out.println("Data is found in the list : " + temp.data);
				}
				temp = temp.next;

			}
		}
	}

	public void reverseList() {
		if (head == null) {
			System.out.println("List is empty !");
		} else {
			int i;
			int j;
			int len = FindLength();
			i = 0;
			j = len - 1;
			int tempData;
			Node temp1;
			Node temp2;
			temp1 = head;
			temp2 = head;
			while (i < j) {
				int k = 0;
				while (k < j) {
					temp2 = temp2.next;
					k++;
				}
				tempData = temp1.data;
				temp1.data = temp2.data;
				temp2.data = tempData;
				i++;
				j--;
				temp1 = temp1.next;
				temp2 = head;
			}

		}

	}

	public void getMiddle() {
		if (head == null) {
			System.out.println("List is Empty !");
		} else {
			Node fast = head;
			Node slow = head;
			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			System.out.println("The Middle Element is : " + slow.data);
		}
	}

	public void getRemoveDuplicate() {
		if (head == null) {
			System.out.println("List is Empty !");
		} else {
			Node temp1;
			Node temp2;
			temp1 = head;
			while (temp1 != null && temp1.next != null) {
				if (temp1.data == temp1.next.data) {
					temp2 = temp1.next.next;
					if (temp2 == null) {
						temp1.next = null;
						break;
					}
					temp1.next = temp2;
				}
				if (temp1.data != temp1.next.data) {
					temp1 = temp1.next;
				}

			}

		}
	}

	public void getSorted() {
		if (head == null) {
			System.out.println("List is empty !");
		} else {
			Node temp1 = head;
			Node temp2 = null;
			while (temp1 != null) {
				temp2 = temp1.next;
				while (temp2 != null) {
					if (temp1.data > temp2.data) {
						int tempData = temp1.data;
						temp1.data = temp2.data;
						temp2.data = tempData;
					}
					temp2 = temp2.next;
				}
				temp1 = temp1.next;
			}
			System.out.println("Data has been sorted now ");

		}

	}

	void getSortedFromUnSortedList() {
		Node temp1 = null;
		Node temp2 = null;
		temp1 = head;
		if (head == null) {
			System.out.println("List is empty !");
		} else {
			/* Pick elements one by one */
			while (temp1 != null && temp1.next != null) {
				temp2 = temp1;

				/*
				 * Compare the picked element with rest
				 * of the elements
				 */
				while (temp2.next != null) {

					/* If duplicate then delete it */
					if (temp1.data == temp2.next.data) {

						/*
						 * sequence of steps is important here
						 */
						temp2.next = temp2.next.next;
						System.gc();
					} else /* This is tricky */ {
						temp2 = temp2.next;
					}
				}
				temp1 = temp1.next;
			}
		}
	}

	public boolean detectLoop() {
		Node temp;
		temp = head;
		HashSet<Node> s = new HashSet<Node>();
		if (head == null) {
			System.out.println("List is empty !");
		} else {
			while (temp != null) {
				// If we have already has this node
				// in hashmap it means their is a cycle
				// (Because you we encountering the
				// node second time).
				if (s.contains(temp))
					return true;

				// If we are seeing the node for
				// the first time, insert it in hash
				s.add(temp);

				temp = temp.next;
			}
		}

		return false;
	}

	// Function that detects loop in the list
	public int detectAndRemoveLoop() {
		Node node;
		if (head == null) {
			System.out.println("list is Empty !");
		} else {
			node = head;
			Node slow = node, fast = node;
			while (slow != null && fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;

				// If slow and fast meet at same point then loop is present
				if (slow == fast) {
					removeLoop(slow, node);
					return 1;
				}
			}
		}
		return 0;
	}

	// Function to remove loop
	public void removeLoop(Node loop, Node head) {
		Node ptr1 = loop;
		Node ptr2 = loop;

		// Count the number of nodes in loop
		int k = 1, i;
		while (ptr1.next != ptr2) {
			ptr1 = ptr1.next;
			k++;
		}

		// Fix one pointer to head
		ptr1 = head;

		// And the other pointer to k nodes after head
		ptr2 = head;
		for (i = 0; i < k; i++) {
			ptr2 = ptr2.next;
		}

		/*
		 * Move both pointers at the same pace,
		 * they will meet at loop starting node
		 */
		while (ptr2 != ptr1) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}

		// Get pointer to the last node
		while (ptr2.next != ptr1) {
			ptr2 = ptr2.next;
		}

		/*
		 * Set the next node of the loop ending node
		 * to fix the loop
		 */
		ptr2.next = null;
	}

	// Function to detect and remove loop
	// in a linked list that may contain loop
	public Node DetectAndRemoveLoop() {
		// If list is empty or has
		// only one node without loop
		if (head == null || head.next == null)
			return null;

		Node slow = head, fast = head;

		// Move slow and fast 1
		// and 2 steps ahead
		// respectively.
		slow = slow.next;
		fast = fast.next.next;

		// Search for loop using
		// slow and fast pointers
		while (fast != null &&
				fast.next != null) {
			if (slow == fast)
				break;
			slow = slow.next;
			fast = fast.next.next;
		}

		// If loop does not exist
		if (slow != fast)
			return null;

		// If loop exists. Start slow from
		// head and fast from meeting point.
		slow = head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}

		return slow;
	}

	public static void main(String[] args) {
		SingleLinkedList LList = new SingleLinkedList();
		int choice;
		while (true) {
			System.out.println("-------------------------------------");
			System.out.println("1-Insert at Begin");
			System.out.println("2-Insert at given position");
			System.out.println("3-Insert at End");
			System.out.println("4-Display List");
			System.out.println("5-Delete at Begin");
			System.out.println("6-Delete at given position");
			System.out.println("7-Delete at End");
			System.out.println("8-Length");
			System.out.println("9-Search an Element");
			System.out.println("10-Find an element in middle");
			System.out.println("11-Remove duplicate entry from sorted list");
			System.out.println("12-Sorting Node in Sequence");
			System.out.println("13-Remove a key in a given position");
			System.out.println("14-Detect a loop ");
			System.out.println("15-Find start of Loop");
			System.out.println("16-Remove Loop");
			System.out.println("17-Reverse List");
			System.out.println("18-Remove duplicate entry from unsorted  list");
			System.out.println("19-Exit");
			System.out.println("-------------------------------------\n");
			System.out.println("Enter the choice : ");
			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextInt();
			System.out.println("-------------------------------------\n");
			switch (choice) {
				case 1:
					LList.insertAtBegin();
					break;
				case 2:
					LList.insertAtMid();
					break;
				case 3:
					LList.insertAtEnd();
					break;
				case 4:
					LList.Display();
					break;
				case 5:
					LList.DeleteAtBegin();
					break;
				case 6:
					LList.DeleteAtMid();
					break;
				case 7:
					LList.DeleteAtEnd();
					break;
				case 8:
					int findLength;
					findLength = LList.FindLength();
					System.out.println("Length is : " + findLength);
					break;
				case 9:
					LList.search();
					break;
				case 10:
					LList.getMiddle();
					break;
				case 11:
					LList.getRemoveDuplicate();
					break;
				case 12:
					LList.getSorted();
					break;
				case 13:
					LList.DeleteAtMid();
					break;
				case 14:
					LList.head.next.next.next.next = LList.head;
					if (LList.detectLoop())
						System.out.println("Loop found");
					else
						System.out.println("No Loop");
					break;
				case 15:
					break;
				case 16:
					LList.head.next.next.next.next.next = LList.head.next.next;
					LList.detectAndRemoveLoop();
					break;
				case 17:
					LList.reverseList();
					break;
				case 18:
					LList.getSortedFromUnSortedList();
					break;
				case 19:
					System.out.println("Exitting...!");
					return;
				default:
					System.out.println("Invalid Choice !\n\n");
			}
		}

	}
}