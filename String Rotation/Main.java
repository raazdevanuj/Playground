#include <iostream>
#include<bits/stdc++.h>
using namespace std;
string lefts(string s,int len){
	string s1=s.substr(len,s.length());
  		s1+=s.substr(0,len);
  return s1;
}
string rights(string s,int len){
	string s1=s.substr(s.length()-len,s.length());
  	s1+=s.substr(0,s.length()-len);
  return s1;
}
bool check(string s2,string t){
  	
  sort(s2.begin(),s2.end());
  if(t==s2) return true;
    return false;
}
int main() 
{
  string s,t;
  cin>>s;
  int n;
  cin>>n;
  string s2=s;
  while(n--){
  	char dir; cin>>dir;
    int len; cin>>len;
    if(dir=='L') s=lefts(s,len);
    if(dir=='R') s=rights(s,len);
    t+=s[0];
  }
  int flag=0;
  	int z=t.size();
  sort(t.begin(),t.end());
  	for(int i=0;i<s2.length();i++){
          if(check(s2.substr(i,z),t)) {flag=1; break;}     
    }
  if(flag) cout<<"YES"; else cout<<"NO";
    return 0;
}