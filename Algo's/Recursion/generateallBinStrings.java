class Solution {
    
  private static void soln(String ans,int n,List<String> res){
      // your code here
      if(n<=0){
          res.add(ans);
          return;
      }
      
      if(ans.length()==0 || ans.charAt(ans.length()-1)=='0'){
          soln(ans+'1',n-1,res);
      }
      
      soln(ans+'0',n-1,res);
  } 
  public static List<String> generateBinaryStrings(int n) {
      
      List<String> res=new ArrayList<>();
      soln("",n,res);
      Collections.sort(res);
      return res;
  }
}
     
     
