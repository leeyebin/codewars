package Udemy.Udemy10_3;

public class BSTBuilder {
	public static Node build(int[] a){
		return buildRec(a, 0, a.length-1);
	}
	private static Node buildRec(int[] a, int l, int h){
		if(l>h){
			return null;
		}
		int m = (l+h)/2;
		
		Node left = buildRec(a, l, m-1);
		Node right = buildRec(a, m+1, h);
		
		return new Node(a[m], left, right);
			
	}

}
