import java.text.DecimalFormat;

public class NthSeries {
	
	public static String seriesSum(int n) {
		DecimalFormat form = new DecimalFormat("#.##");
    float sum = 0;
    
		for(int i=1; i<=n; i++){
			sum += 1.0/(1+3*(i-1));
		}
    if(n==0){
      sum = 0;
    }
		
		return String.format("%.2f", sum);
    
    
	}
}