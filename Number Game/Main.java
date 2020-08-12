#include <iostream>
using namespace std;

int main() 
{
   int n,dum=0;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++){ cin>> arr[i]; dum^=arr[i];}
  string s[]={"AMAN","JASBIR"};
  if(dum==0)
    cout<<s[1];
  else
    cout<<s[0];
  cout<<endl;
    return 0;
}