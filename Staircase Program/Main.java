#include <iostream>
#define ll long long int
using namespace std;

int main() 
{
   int n; cin>>n;
  if(n>50) {cout<<"Invalid Input"; return 0;}
  ll arr[n+1];
  arr[0]=1;
  arr[1]=1;
  arr[2]=2;
  for(int i=3;i<=n;i++)
    arr[i]=arr[i-1]+arr[i-2];
  cout<<arr[n]<<endl;
    return 0;
}