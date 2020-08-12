#include <iostream>
using namespace std;

int main() 
{
  int n; cin>>n;
  int arr[n];
  for(int i=0;i<n;i++) cin>>arr[i];
 
  int cnt=1,f=0,z=0;
  for(int i=1;i<n;i++){
  	if(arr[i]>=arr[i-1])cnt++;
    else cnt=1;
    if(cnt>f){ f=cnt,z=i;}
  }
  z=z-f+1;
  while(f--) cout<<arr[z++]<<" ";
    return 0;
}