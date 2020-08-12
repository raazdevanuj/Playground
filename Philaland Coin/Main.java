#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main()
{
 int testcase;
  cin>>testcase;
  while(testcase--)
  {
    int n;
    cin>>n;
    int cnt=0;
    int i=1,z=1;
    while(z<=n){
    cnt++; z=pow(2,i); i++;
    }
    cout<<cnt<<endl;
  }
  return 0;
}