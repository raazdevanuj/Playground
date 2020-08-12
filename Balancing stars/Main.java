#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main()
{
  string s;
  cin>>s;
  stack<char>st;
  int cnt=0,flg=0;
  int scnt=0,i=0;
  for(int i=0;s[i];i++){ 
      if (s[i]=='{' || s[i]=='['|| s[i]=='(') 
      	{st.push(s[i]); flg=1;}
		if(!st.empty()){
          	if(s[i]=='}')
            {
              if(st.top()=='{')
              {	
                	st.pop();
                	continue;
              }
              else break;
            }
          if(s[i]==']')
            {
              if(st.top()=='[')
              {	
                	st.pop();
                	continue;
              }
            else break;
            }
          if(s[i]==')')
            {
              if(st.top()=='(')
              {	
                	st.pop();
                	continue;
              }
            	else break;
            }
          if(s[i]=='*')
          {
            if(s[i+1]=='*'){
            	if(st.top()=='(' || st.top()=='[' || st.top()=='{')
                  cnt++;
            }
          }
        }
      	else
        {
          if(flg==1)
          {flg=0; break;}
   
        }                                                   
    } 
  if(flg) cout<<"Yes"<<" "<<cnt<<endl; 
  else cout<<"No"<<" "<<cnt<<endl; 
  return 0;
}