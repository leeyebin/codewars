class ArithmeticFunction {
  public static int arithmetic(int a, int b, String operator) {
    int result = 0;		
		
		if(operator.equals("add")){
			result = a+b;
		}else if(operator.equals("subtract")){
			result = a-b;
		}else if(operator.equals("multiply")){
			result = a*b;
		}else if(operator.equals("divide")){
			result = a/b;
		}
		
		return result;
	  
  }
}  