#include <iostream>
#include<vector>
using namespace std;
bool check(vector<int>vec1,vector<int>vec2){
	for(int i=0;i<vec1.size();i++){
      if(vec1[i]!=vec2[i]) return false;
    }
  return true;
}
int main() 
{
   int testcase;
  cin>>testcase;
  while(testcase--){
    int n;
    cin>>n;
    vector<int>vec1,vec2;
    for(int i=0;i<n;i++){
      int temp; cin>>temp;
      vec1.push_back(temp);vec2.push_back(i+1);
    }
    int t=0;
    while(check(vec1,vec2)!=true){
      t++;
      vector<int>vec3(n);
      for(int i=0;i<n;i++)
      {
        vec3[vec1[i]-1]=vec2[i];
      }
      //for(int i=0;i<n;i++) cout<<vec3[i]<<" ";
     // cout<<endl;
      vec2=vec3;
    }
    cout<<t+1<<endl;
  }
    return 0;
}