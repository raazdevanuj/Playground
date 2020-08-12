#include <iostream>
using namespace std;

int main() 
{
  int testcase;
  cin>>testcase;
  while(testcase--){
  	int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++) cin>>arr[i];
    int res=0;
    int sum=arr[0];
    for(int i=1;i<n;i++)
    {
      sum+=arr[i];
      res+=sum;
    }
    cout<<res;
    
  }
    return 0;
}