#define ll long long int
#include<bits/stdc++.h>
#include <iostream>
using namespace std;

int main() 
{
	int energy; cin>>energy;
  	ll n; cin>>n;
  	ll arr[n];
  for(ll i=0;i<n;i++) cin>>arr[i];
   //sort(arr,arr+n);
  for(ll i=0;i<n;i++){
	
    	energy-=(arr[i]%2 + arr[i]/2);
    }
   
  
  if(energy>0) cout<<"YES"<<endl;
	else  cout<<"NO"<<endl;
    return 0;
}