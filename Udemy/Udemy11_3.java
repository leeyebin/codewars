package Udemy.Udemy11_3;

import java.util.PriorityQueue;

public class MidTracker {
    public PriorityQueue<Integer> minQ;
    public PriorityQueue<Integer> maxQ;
    
    public MidTracker() {
        minQ = new PriorityQueue<Integer>();
        maxQ = new PriorityQueue<Integer>();
    }
    
    public void read(int num) {
        if(maxQ.size()==minQ.size()){
        	if(!minQ.isEmpty()&&num>minQ.peek()){
        		maxQ.offer(-minQ.poll());
        		minQ.offer(num);
        	}else{
        		maxQ.offer(-num);
        	}
        }else{
        	if(num<maxQ.peek()){
        		minQ.offer(-maxQ.poll());
        		maxQ.offer(-num);
        	}else{
        		minQ.offer(num);
        	}
        	
        }
    }
    public double median() {
        if(maxQ.isEmpty()){
        	return -1;
        }
        if(maxQ.size()==minQ.size()){
        	return (minQ.peek() - maxQ.peek()) / 2.0;
        }else{
        	return -maxQ.peek();
        }
    }
}
