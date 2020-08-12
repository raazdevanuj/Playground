#include <iostream>
using namespace std;

int main() 
{
   int n;
  cin>>n;
  int cnt=0;
  int k=3,j=2;
  while(cnt<n)
  {
    int flag=1;
    string s="";
      int num=0;
    for(int i=0;i<=cnt;i++,k+=4,j+=2)
    {
      s="";
        num=k*j;
      string st=to_string(num);
      int z=5-st.length();
      while(z--) s+=to_string(0);
      s+=st;
    //  cout<<i;
      int sp=n-cnt-1;
      if(flag){
      while(sp--)cout<<"     "; flag=0;}
      cout<<s<<"     ";
    }
    cout<<endl;
    cnt++;
    
  }
    return 0;
}