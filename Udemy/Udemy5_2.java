package udemy5_2;

public class udemy5_2 {
	public static void main(String args[]){
		
	}
	
	public static void paint(int[][] image, int x, int y, int newC){
		paintRec(image, x, y, newC, image[y][x]);
	}
	
	private static void paintRec(int[][] image, int x, int y, int newC, int targetC){
		if(x<0 || y<0 || x>=image[0].length || y>=image.length){
			return;
		}
		if(image[y][x] == newC || image[y][x]!=targetC){
			return;
		}
		
		image[y][x] = newC;
		paintRec(image, x+1, y, newC, targetC);
		paintRec(image, x, y+1, newC, targetC);
		paintRec(image, x-1, y, newC, targetC);
		paintRec(image, x, y-1, newC, targetC);
	}
}

