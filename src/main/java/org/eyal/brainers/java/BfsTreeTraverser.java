package org.eyal.brainers.java;

import java.util.LinkedList;
import java.util.Queue;

public class BfsTreeTraverser {

	public BfsTreeTraverser() {

	}

	private void printBfsTreeByLevel(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node[] nodes = queue.toArray(new Node[] {});
			queue.clear();
			for (Node node : nodes) {
				System.out.print(node.data);
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
			System.out.println();
		}
	}

	private static final class Node {
		private Object data;
		private Node left;
		private Node right;

		private Node(Object data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	public static void main(String[] args) {
		Node root = new Node("A", new Node("B", null, null), new Node("C",
				new Node("D", null, null), new Node("E", null, null)));
		
		BfsTreeTraverser trav = new BfsTreeTraverser();
		trav.printBfsTreeByLevel(root);
	}
}
