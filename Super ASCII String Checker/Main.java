#include <iostream>
#include<vector>
using namespace std;

int main() 
{
  int testcase;
  cin>>testcase;
  while(testcase--){
    string s;
    cin>>s;
    vector<int>a(26,0);
    for(char c:s) a[c-'a']++;
    int flag=1;
    for(int i=0;i<26;i++){
      if(a[i]!=0 && a[i]!=i+1){ flag=0; break;}
    }
    if(flag) cout<<"YES "; else cout<<"NO "; //cout<<endl;
  }
    return 0;
}