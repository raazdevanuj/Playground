#include <iostream>
#include<bits/stdc++.h>
#define ll long long int
using namespace std;

int main() 
{
   ll n,k;
  cin>>n>>k;
  vector<ll>vec1,vec2;
  for(ll i=1;i<=sqrt(n);i++)
  {
    if(n%i==0){
      if(n/i!=i){
        vec1.push_back(i);
        vec2.push_back(n/i);
      }
      else
      {
        vec1.push_back(i);
      } 
    }
  }
  for(ll i=vec2.size()-1;i>=0;i--)
    vec1.push_back(vec2[i]);
  
  //for(ll i=0;i<vec1.size();i++)cout<<vec1[i]<<" ";
  k--;
  ll p=0;
  if(vec1.size()<=k)p=0;
  else p=vec1.size()-1-k;
  //cout<<p<<" ";
  cout<<vec1[p]<<endl;
    return 0;
}