package udemy;

public class Udemy6_1 {
	public static void main(String args[]){
		long startTime1 = System.currentTimeMillis();
		System.out.print(Fibonacci.fibonacci(13));
		long elapsedTime1 = System.currentTimeMillis() - startTime1;
		System.out.println(" : " + elapsedTime1 + " ms");
		
		long startTime2 = System.currentTimeMillis();
		System.out.print(Fibonacci.fibonacciFaster(13));
		long elapsedTime2 = System.currentTimeMillis() - startTime2;
		System.out.println(" : " + elapsedTime2 + " ms");
	}

}

class Fibonacci{
	public static int fibonacci(int n){
		if(n==0){
			return 0;
		}else if(n==1||n==2){
			return 1;
		}		
		return fibonacci(n-2) + fibonacci(n-1);
	}
	
	public static int fibonacciFaster(int n){
		int[] memoization = new int[n+1];
		
		if(n==0){
			return 0;
		}else if(n==1||n==2){
			memoization[n] = 1;
			return 1;
		}
		
		return fibonacciFasterRec(n, memoization);
	}
	
	public static int fibonacciFasterRec(int n, int[] memoization){
		if(n==0){
			memoization[n] = 0;
			return 0;
		}else if(n==1||n==2){
			memoization[n] = 1;
			return 1;
		}		
		
		if(memoization[n]!=0){
			return memoization[n]; 
		}
		memoization[n] = fibonacciFasterRec(n-2, memoization) + fibonacciFasterRec(n-1, memoization);
		
		return memoization[n];
	}
	
	
}