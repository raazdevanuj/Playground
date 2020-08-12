#include <iostream>
#include<math.h>
#include <iomanip> 
using namespace std;

int main() 
{
  int VA,VB,x,y;
  cin>>x>>y>>VA>>VB;
  if(x<=0 || y<=0 || VA<=0 ||VB<=0)
    cout<<"Invalid Input";
  else
    {
 double ans=sqrt(pow(x,2)+pow(y,2));
  while(x>=0 || y>=0){
    x-=VA; y-=VB;
  double a=sqrt(pow(x,2)+pow(y,2));
  ans=min(ans,a); 
     
  }
 	if(ans==0) cout<<"0.0";
    else cout<<fixed<<setprecision(11)<<ans;
}
    return 0;
}