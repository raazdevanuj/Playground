#include<iostream>
using namespace std;

int main()
{
 int n; cin>>n;
  long int m; cin>>m;
  int arr[n];
  for(int i=0;i<n;i++) cin>>arr[i];
  while(m--){
    int z=0;
    int a,b;
    cin>>a>>b;
    for(int i=0;i<n;i++) if(arr[i]>=a&& arr[i]<=b) z++;
    cout<<z<<" ";
  }
  return 0;
}