#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main() 
{
  int testcase;
  cin>>testcase;
  while(testcase--){
    
   string s1,s2;
    cin>>s1>>s2;
    map<char,int>m;
    for(int i=0; i<s1.size();i++)
    {
      m[s1[i]]=i;
    }
    vector<pair<char,int> >vec;
    for(int i=0;i<s2.size();i++)
    {
      vec.push_back(make_pair(m[s2[i]],s2[i]));
    }
    sort(vec.begin(),vec.end());
                    s2="";
     for(int i=0;i<vec.size();i++)s2+=vec[i].second;               
    cout<<s2<<endl;
  }
    return 0;
}