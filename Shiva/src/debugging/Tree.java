package debugging;


 

public class Tree {
	private class Node{
		private int value;
		private Node leftchild;
		private Node rightchild;
		public Node(int value) {
			this.value = value;
		}
		@Override
		public String toString() {
			return "Node [value=" + value + "]";
		}
				
		
	} 	
     Node root;
	public void insert(int value){
		Node node = new Node(value);
		if (root==null) {
			root =node;
			return;
		}
		Node current=root;
		while (true) {
			if (value<current.value) {
				if (current.leftchild==null) {
					current.leftchild=node;
					break;
				}
				current=current.leftchild;
			}
			else {
				if (current.rightchild==null) {
					current.rightchild=node;

					break;
				}
				current=current.rightchild;
			}
		}
	}
	
	public static void main(String[] args) {
		Tree tree= new Tree();
		tree.insert(9);
		tree.insert(12);
		tree.insert(5);
		tree.insert(8);
		tree.insert(57);
		System.out.println(tree.root);
	}

}


