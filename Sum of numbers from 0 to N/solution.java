public class SequenceSum{

  public static String showSequence(int value){
    String sentence = "";
      // for
       if(value == 0){
         sentence = "0=0";
       }else if(value < 0) {
        sentence = value + "<0";
      } else{
        for (int i = 0; i <= value; i++) {
          if (i < value) {
            sentence += i + "+";
          } else {
            sentence += i + " = " + value*(value+1)/2;
          }
        }
      }
      return sentence;
  }
