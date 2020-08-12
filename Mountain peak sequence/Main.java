#include<iostream>
using namespace std;
int main()
{
  long long int mod=10000000007;
	int n;
  cin>>n;
  if(n==1||n==2) cout<<"0";
  else if(n==3) cout<<"2";
  else
  {
    long long int s=2;
    for(long long int i=1;i<n-2;i++)
        {
            s=(s*2 + 2) % mod;   
        }
        cout << s;
  }
}