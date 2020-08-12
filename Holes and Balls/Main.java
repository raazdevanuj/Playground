#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main() 
{
   int n;
     cin>>n;
 int z;
  vector<pair<int,int>>vec;
  for(int i=0;i<n;i++) { cin>>z;
    vec.push_back(make_pair(z,i+1));
      }
  int m;
  cin>> m;
  int ball[m];
  for(int i=0;i<m;i++) cin>>ball[i];
  
  for(int i=0;i<m;i++)
  {
   int flag=0;
    for(int j=n-1;j>=0;j--){
      if(vec[j].first>=ball[i] && vec[j].second>0)
      {
       flag=j+1; vec[j].second--;
        break;
      }
      
    }
    cout<<flag<<" ";
  }
    return 0;
}