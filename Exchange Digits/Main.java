#include <iostream>
#include<bits/stdc++.h>
#define ll long long int
using namespace std;

int main() 
{
   ll n,m;
  cin>>n>>m;
  string s1=to_string(n),s2=to_string(m);
  sort(s1.begin(),s1.end());
  int flag=0;
  do{
    if(s1>s2){
      flag=1;
      break;
    }
  }while(next_permutation(s1.begin(),s1.end()));
   
  if(flag)
  cout<<s1;
  else
    cout<<"-1";
    return 0;
}