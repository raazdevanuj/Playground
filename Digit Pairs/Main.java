#include <iostream>
#include<bits/stdc++.h>
using namespace std;
int slove(int x){
  int m=INT_MAX;
  int n=INT_MIN;
  while(x)
  {
    int b=x%10;
    m=min(m,b);
    n=max(n,b); x/=10;
  }
  int num=m*7+n*11;
  num=num%100;
  return num;
}
int main() 
{
  int i,j,size;
  cin>>size;
  if(size>0 && size<=500)
  {
    int arr[size];
    for(i=0;i<size;i++)
    {
      cin>>arr[i];
      
      string s=to_string(arr[i]);
      if(s.length()!=3)
      {
        cout<<"Invalid Input";
        return 0;
      }
      arr[i] = slove(arr[i]);
    }
    int msb_count=0,pairs=0;
    for(i=0;i<size;i++)
    {
      msb_count=0;
      if(arr[i] ==0) continue;
      for(j=i+2;j<size;j=j+2)
      {
        if(arr[i] /10 == arr[j]/10)
        {
          msb_count++;
          arr[j]=0;
          if(msb_count<=2)
            pairs++;
        }
      }
    }
    cout<<pairs;
  }
  else
  {
    cout<<"Invalid Input";
  }
    return 0;
}