#include <iostream>
using namespace std;
int valid(int i,int j){
  int z=0;
  while(i!=0 && j!=0)
  {
    z++;
    if(i<j) j-=i;
    else i-=j;
  }
  return z;  
}
int main() 
{
   // Try out your code here
   int maxh,minh,maxw,minw;
  cin>>maxh>>minh>>maxw>>minw;
  int count=0;
  for(int i=maxh;i<=minh;i++)
    for(int j=maxw;j<=minw;j++)
    count+=valid(i,j);
  cout<<count<<endl;
    return 0;
}