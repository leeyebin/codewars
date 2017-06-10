package codewars.udemy;
public class Udemy5_3{
	public static void main(String[] args){
    	MyArrayStack s = new MyArrayStack();
	s.push(1);
	s.pop();
	}
}

class MyArrayStack{
	private int[] data = new int[100];
	private int topIndex = -1;
  
	public void push(int i){
		if(data.length==topIndex-1){
		int[] oldData = data;
		data = new int[data.length*2];
		System.arraycopy(oldData, 0, data, 0, oldData.length);
		}

		topIndex++;
		data[topIndex] = i;
	}

	public int pop(){
		if(topIndex<0){
			throw new RuntimeException("Nothing to pop");
		}
	return 0;
	}
}