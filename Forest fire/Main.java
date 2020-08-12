#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int dir[][2]={{-1,0},{1,0},{0,-1},{0,1},{-1,-1},{-1,1},{1,-1},{1,1}};
bool valid (int i,int j,int n,int m){
  if(i<0 || j<0 || i>=n || j>=m )
    return false;
  return true;
}
int  slove(int i,int j,vector<vector<char>> &mat){
 
  int count=1;
  queue<pair<int,pair<int,int>>>q;
  q.push(make_pair(count,make_pair(i,j)));
  pair<int,pair<int,int> > p;
   int ans=0;
  	while(!q.empty())
    {
      p=q.front(); q.pop();
      count=p.first;
      i=p.second.first;
      j=p.second.second;
     // cout<<count<<" "<<i<<" "<<j<<endl;
      if(mat[i][j]=='T')
      {
        mat[i][j]='W';
        ans=max(ans,count);
        for(int a=0;a<8;a++)
        {
          if(valid(dir[a][0]+i,dir[a][1]+j,mat.size(),mat[0].size()))
            q.push(make_pair(count+1,make_pair(dir[a][0]+i,dir[a][1]+j)));
        }
      }
    }
  
  
 
    return ans;      
}
int main() 
{
  int n,m;
  cin>>n>>m;
  int a,b;
  cin>>a>>b;
  a--; b--;
 vector<vector<char>>mat(n,vector<char>(m));
  for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
      cin>>mat[i][j]; 
    }
  }

    cout <<slove(a,b,mat);
    return 0;
}