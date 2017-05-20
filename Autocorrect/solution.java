package codewars.autocorrect;
//다시 해봐야함
public class autocorrect {

	public static void main(String[] args) {
		System.out.println(autocorrect1("you!"));
	}
	
	public static String autocorrect1(String input) {
		String tempInput = input.toLowerCase();
		
		if(tempInput.equals("you")){
			return "your sister";
		}else if(tempInput.equals("u")){
			return "your sister";
		}else if(tempInput.length()>3){
			if(tempInput.charAt(0)=='y'&&tempInput.charAt(1)=='o'&&tempInput.charAt(2)=='u'){
				int count=3;
				boolean boo = true;
				while(count!=tempInput.length()){
					if(tempInput.charAt(count)=='u'){
					}else{
						boo = false;
					}
					count++;
				}
				if(boo==true){
					return "your sister";
				}else{
					return input;
				}
			}
		}
	    return input;
	  }
}
