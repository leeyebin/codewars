import java.util.Stack;

public class BraceChecker {

  public boolean isValid(String braces) {
    Stack<Character> stack = new Stack<Character>();
    
    for(char c : braces.toCharArray()){
      switch(c){
      case '(':
      case '{':
      case '[':
        stack.push(c);
        break;
      case ')':
        if(!stack.isEmpty()){
          if(stack.peek()=='('){
            stack.pop();
          }else{
            return false;
          }
        }else{
          return false;
        }
        break;
      case '}':
        if(!stack.isEmpty()){
          if(stack.peek()=='{'){
            stack.pop();
          }else{
            return false;
          }
        }else{
          return false;
        }
        break;
      case ']':
        if(!stack.isEmpty()){
          if(stack.peek()=='['){
            stack.pop();
          }else{
            return false;
          }
        }else{
          return false;
        }
        break;
      }
    }
    
    if(stack.isEmpty()){
      return true;
    }
    return false;
  }

}