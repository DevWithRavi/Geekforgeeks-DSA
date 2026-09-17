import java.util.*;
class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        // code here
        
        ArrayList<Integer>ans =new ArrayList<Integer>();
        
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                ans.add(i);
                      if(n/i!=i){
                         ans.add(n/i);
            }
        }
        }
          Collections.sort(ans);
        return ans;
    }
}

