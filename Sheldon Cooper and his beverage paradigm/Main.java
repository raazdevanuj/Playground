#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main() 
{
   int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++) cin>>arr[i];
  int x; cin>>x;
  sort(arr,arr+n);
  int i=0;
  int flag=0;
  while(i<n-2){
    int j=i+1,k=n-1;
    while(j!=k){
    if(arr[i]+arr[j]+arr[k]==x)
    { flag=1; break;}
      if(arr[i]+arr[j]+arr[k]>x)k--;
      else j++;
    }
    if(flag) break;
    i++;
  }
  if(flag) cout<<"TRUE";
  else cout<<"FALSE";
    return 0;
}