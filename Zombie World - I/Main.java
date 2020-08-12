#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main() 
{
  int testcase;
  cin>>testcase;
  while(testcase--){
    int n,t;
    cin>>n>>t;
    int arr[n];
    for(int i=0;i<n;i++) cin>>arr[i];
    sort(arr,arr+n);
    int ply,nxt;
    cin>>ply>>nxt;
    if(t>n){
    for(int i=0;i<n;i++){
    if(arr[i]<ply)
    ply=ply+(ply-arr[i]);
    }
    }
    if(ply>=nxt)
      cout<<"YES";
    else
      cout<<"NO";
   // cout<<endl;
  }
    return 0;
}