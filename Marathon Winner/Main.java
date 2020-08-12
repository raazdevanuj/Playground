#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main() 
{
   int n;
  cin>>n;
  int m;
  cin>>m;
    int mat[n][m+1];
  int pat[n];
  int z=n;
  for(int i=0;i<n;i++){
    for(int j=0;j<=m;j++){
     cin>>mat[i][j];
    }
    pat[i]=0;
  }
   for(int i=0;i<n;i++){
     int z=mat[i][m];
    // cout<<z<<endl;
    for(int j=0;j<m;j++){ 
      if(j>0)
      mat[i][j]=mat[i][j]*z+mat[i][j-1];
      else
        mat[i][j]=mat[i][j]*z;
      
      //cout<<mat[i][j]<<" ";
    }//cout<<endl;
   }
  
  for(int j=1;j<m;j+=2){
    int x=INT_MIN,y=INT_MIN;
    for(int i=0;i<n;i++){
      if(y<mat[i][j]){
        y=mat[i][j];
        x=i;
      }
    }
    pat[x]++;
  }
  int ans=0,pt=INT_MIN;
  for(int i=0;i<n;i++){
   // cout<<pat[i]<<" ";
   if(pat[i]>pt){pt=pat[i]; ans=i;}}
 // cout<<endl;
  cout<<ans+1;
    return 0;
}