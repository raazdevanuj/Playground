#include <iostream>
#include<bits/stdc++.h>
using namespace std;
bool check(string s){
	int i=0,j=s.length()-1;
  	while(i<=j){
    	if(s[i]!=s[j]) return false;
  		i++; j--;
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
    sort(s.begin(),s.end());
    int flag=1;
    do
    {
     if(check(s)){flag=0; cout<<s<<endl;}
    }while(next_permutation(s.begin(),s.end()));
    if(flag)
    cout<<"Not a palindrome"<<endl;
  }
    return 0;
}