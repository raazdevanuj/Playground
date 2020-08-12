#include <iostream>
using namespace std;

int main() 
{
   int n,cnt=0; cin>>n;
  //if(n>50) {cout<<"Invalid Input"; return 0;}
  int arr[n];
  for(int i=0;i<n;i++) cin>>arr[i];//{cin>>arr[i]; if(arr[i]<-89|| arr[i]>90){ cout<<"Invalid Input"; return 0;}}
 
  for(int i=0;i<n;i++){
  for(int j=i+1;j<n;j++){ if(arr[i]==arr[j]){cnt++; break;}
  }
  }
  cout<<((cnt-1)*cnt)/2;
    return 0;
}