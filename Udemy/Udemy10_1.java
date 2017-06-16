package udemy.Udemy10_1;

public class Udemy10_1 {
	public static int getMax(Node root){
		if(root==null){
			return Integer.MIN_VALUE;
		}
		int leftMax = getMax(root.left);
		int rightMax = getMax(root.right);
		int childMax = Math.max(leftMax, rightMax);

		return Math.max(childMax, root.data);
	}
}

class Node {
    int data;
    Node left;
    Node right;
    
    public Node() {}
    public Node(int n) {
        data = n;
    }
    
    public Node(int n, Node l, Node r) {
        data = n;
        left = l;
        right = r;
    }
}

