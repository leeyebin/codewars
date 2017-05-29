public class Solution {

    public static int[] withdraw(int n) {
        int total = n;
        int remain = 0;
        int[] cost = new int[3];
        int[] twenty = new int[]{0,3,1,4,2};
        int temp = 0;
        
        temp = ((total%100)/10)%5;
        
        if(((total%100)/10)%2==0){
          cost[1]=0;
        }else{
          cost[1]=1;
        }
        
        cost[2] = twenty[temp];
        
        remain = total-(50*cost[1] + 20*cost[2]);
        
        cost[0] = remain/100;
    
        return cost;
    }
}