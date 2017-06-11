package codewars.udemy;

import java.util.ArrayList;
import java.util.List;

public class Udemy8_2 {
	public static void main(String args[]){
		MyListStack<String> sentence = new MyListStack<String>();
		sentence.push("11");
		sentence.push("12");
		sentence.push("13");
		sentence.push("14");
		sentence.print();
		sentence.pop();
		sentence.print();
	}

}

class MyListStack<T> {
	
	private List<T> list;
	
	public MyListStack() {
		 list = new ArrayList<T>();
	}
	
	public void push(T i) {
		list.add(i);
	}
	
	public T pop() {
		T temp;
		if(list.size()>0){
			temp = list.get(list.size()-1);
			list.remove(list.size()-1);
			return temp;
		}else{
			return null;
		}
	}
	
	public void print(){
		for(T c : list){
			System.out.print(c + " ");
		}
	}
}
