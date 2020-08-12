#include <iostream>
#include<math.h>
using namespace std;
bool isprime(int num){
  if(num==1)
    return false;
  for(int i=2;i<=sqrt(num);i++)
  if(num%i==0)
   	return false;
  return true;
}
 int sum(int n)
    {
        int k=0;
        while(n)
        {
            int l=n%10;
            k+=l*l;
            n/=10;
        }
        return k;
    }
bool ishappy(int num){
  while(1)
  {
    if(num==1) return true;
    num=sum(num);
    if(num==4) return false;
  }
  return false;
}
int main() 
{
   int x,y,n;
  cin>>x>>y>>n;
  if(x>y ||x<=0 || n<=0)
  { cout<<"Invalid Input"; return 0;}
  int z=0,flag=0;
  for(int i=x;i<=y;i++){
    if(isprime(i)&& ishappy(i))
    {
      z++;
      if(z==n) {cout<<i<<endl;flag=1;break;}
    }
  }
  if(flag==0) cout<<"No number is present at this index"<<endl;
    return 0;
}