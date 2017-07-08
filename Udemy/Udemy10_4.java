package Udemy.Udemy10_4;

public class TreeHandler {
	public static boolean isBST(Node root) {
		return isBstRec(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
	
	private static boolean isBstRec(Node node, int min, int max){
		if(node==null){
			return true;
		}
		if(node.data <= min || node.data > max){
			return false;
		}
		boolean leftBst = isBstRec(node.left, min, node.data);
		boolean rightBst = isBstRec(node.right, node.data, max);
		return leftBst && rightBst;
	}
}
