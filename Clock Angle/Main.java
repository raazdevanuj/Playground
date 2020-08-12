#include <iostream>
#include<iomanip>
using namespace std;

int main() 
{
   int hour; cin>>hour;
  double deg; cin>>deg;
  double time= (hour*deg)/360;
    int hh=(int(time));
  
  int mm=((time-hh)*60);
  
  	hh%=12;
//  cout<<hh<<":"<<mm<<endl;
  double ans=(5.5*mm)-(30.0*hh);
 if(ans<0)
   cout<<fixed<<setprecision(2)<<ans+360;
  else
  cout<<fixed<<setprecision(2)<<ans;
    return 0;
}