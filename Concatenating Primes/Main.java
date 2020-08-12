#include <iostream>
#include<bits/stdc++.h>
using namespace std;
bool prime(int n, int i = 2) 
{ 
    // Base cases 
    if (n <= 2) 
        return (n == 2) ? true : false; 
    if (n % i == 0) 
        return false; 
    if (i * i > n) 
        return true; 
  
    // Check for next divisor 
    return prime(n, i + 1); 
} 
int main() 
{
   int testcase;
  cin>>testcase;
	int arr[]={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67};
    vector<int>vec;
  for(int i=0;i<19;i++){
    	if(testcase>=arr[i])
  		vec.push_back(arr[i]);
  }
  
	int count=0;
	for(int i=0;i<vec.size();i++){
      for(int j=0;j<vec.size();j++){
        int a=vec[i],b=vec[j];
        if(b<10)
          a=a*10+b;
        else
          a=a*100+b;
			if(prime(a)) count++;
      }
    }
	cout<<count<<endl;
    return 0;
}