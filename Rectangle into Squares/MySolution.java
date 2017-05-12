import java.util.ArrayList;
import java.util.List;

public class SqInRect {
  
  public static List<Integer> sqInRect(int lng, int wdth) {
    List<Integer> list = new ArrayList<Integer>();
    int total = -1;
    int temp = -1;
    int min = Math.min(lng, wdth);
    int max = Math.max(lng, wdth);
    
    if(lng==wdth){
      return null;
    }else{
      while(total!=0){
        list.add(min);
        total = (int) (min*max - Math.pow(min,2));
        temp = Math.max(min, max-min);
        min = Math.min(min, max-min);
        max = temp;
      }
    }    
    return list;
  }
}