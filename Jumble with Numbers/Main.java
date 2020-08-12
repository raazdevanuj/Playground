#include <iostream>
using namespace std;

int main() 
{
 int t1,t2,m,i,j,c=0,a,b,th[100],k=0;
 cin>>t1>>t2>>m;
 if(t1>0&&t2>0&&m>0)
 {
 for(i=1;i<=t2/2;i++)
 {
     a=i*((2*i)-1);
     for(j=1;j<=t2/2;j++)
     {
         b=j*(j+1)/2;
         if((a==b)&&(a>=t1&&a<=t2))
         th[k++]=a;
     }
 }
    if(k<m)
     cout<<"No number is present at this index";
     else
     cout<<th[m-1]<<endl;
 }
         else
         cout<<"Invalid Input";
 return 0;
}