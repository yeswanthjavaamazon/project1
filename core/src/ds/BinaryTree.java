package ds;
//THIS CODE IS NOT CORRECT PLEASE CHECK IN GOOGLE AND MAKE IT CORRECT
class Node {
	int k;
	Node left, right;
	public Node(int item) {
		k = item;
		left = right;
	}
}

class BinaryTree {
	
	Node root;
	BinaryTree() {
		//--TODO]]
	}
	
	void InOrder(Node node) {
		if(node == null)
			return;
		InOrder(node.left);  //left child
		System.out.print(node.k + " ");
		InOrder(node.right);
	}
	
	public static void main(String[] args){
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
	}
}
