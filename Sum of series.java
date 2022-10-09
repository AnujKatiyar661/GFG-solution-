


class Solution {
   
    long seriesSum(int n) {
        // code here
       //   long sum=(long)n*(n+1)/2;
    // we can do it by for loop 
    long sum=0L;
    for(int i=1;i<=n;i++)
    {
          sum+=i;
    }
          return sum;
    }
}
