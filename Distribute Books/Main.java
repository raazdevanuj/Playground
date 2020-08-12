#include<iostream>
#define mod 100000007
using namespace std;

int main()
{
  long int n;
  cin>>n;
  long long int f[n+1]; 
  long long int i; 
  f[0] = 1;   f[1] = 0;  f[2]=1;

  for (i = 3; i <= n; i++) 
      f[i] = ((i-1)*(f[i-1] + f[i-2])) % mod;
  
  cout<<f[n]<<endl; 
  return 0;
}