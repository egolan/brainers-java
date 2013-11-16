package org.eyal.brainers.java.listreverse;

public class Reverser {

	public Reverser() {
	}

	private Node reverse(Node first) {
		Node current = first;
		Node previous = null;
		while (current != null) {
			Node temp = current.next;
			current.next = previous;
			previous = current;
			current = temp;
		}
		return previous;
	}
	
	private void printList(Node node) {
		Node current = node;
		while (current != null) {
			System.out.print(String.format("%s", current.data));
			current = current.next;
		}
	}

	public static void main(String[] args) {
		Reverser reverser = new Reverser();
		
		Node n1 = new Node("1", new Node("2", new Node("3", null)));
		reverser.printList(n1);
		System.out.println();
		Node reversed = reverser.reverse(n1);
		reverser.printList(reversed);
		
	}
	
	private static final class Node {

		Object data;
		Node next;

		public Node(Object data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
}
