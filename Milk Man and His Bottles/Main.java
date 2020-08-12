#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main() 
{
   int testcase;
  cin>>testcase;
  while(testcase--){
   int n; cin>>n;
    int arr[]={1,5,7,10};
    vector<int>dp(n+1,n+1);
    dp[0]=0;
  for(int i=1;i<=n;i++){
    for(int j=0;j<=3;j++){
      if(arr[j]<=i)
        dp[i]=min(dp[i],dp[i-arr[j]]+1);
    } //cout<<dp[i]<<" ";
  }
     cout<<dp[n]<<endl;
  }
   
    return 0;
}