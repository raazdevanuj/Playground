#include <iostream>
using namespace std;
bool palin(string &s)
{
  int i=0,j=s.length()-1;
  while(i<=j)
  {
    if(s[i]!=s[j]) return false;
    i++;j--;
  }
  return true;
}
int main() 
{
  int testcase;
  cin>>testcase;
  while(testcase--){
    string s;
    cin>>s;
    if(palin(s)) cout<<"0"<<endl;
    else
    {
      string s1=s,s2=s,s3=s;
      int i=0,flag=1;
      while(i<s.length()){  
    for(int j=0;j<s3.length();j++){
      	s1[j]=s3[(j+1)%s3.length()];
    }
        s2[0]=s[s.length()-1];
        for(int j=1;j<s.length();j++){
         		 s2[j]=s[j-1];
        }
        s=s2; s3=s1;
        //cout<<s1<<" "<<s2<<endl;
        if(palin(s1)||palin(s2)){
          cout<<i+1<<endl; flag=0; break;
        }
        i++;
      }
      if(flag) cout<<"-1"<<endl;
    }
  }
    return 0;
}