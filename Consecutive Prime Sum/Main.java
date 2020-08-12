#include<iostream>
#define ll long long int
#include<math.h>
using namespace std;
bool prime(int b)
{
    for(int i = 2; i <= sqrt(b); i++)
        if(b % i == 0) return false;
  
    return true;
}
int main()
{
   ll n,m,sum=2,cnt=0;
    cin >> n;
  	  m = n;
  //From 10 power 6 to 10 power 8
    if(n>1000000&&n<100000000) n=n/1000;
  //// grater than From 10 power 8
    if(n>=100000000)  n=n/10000;      
    for(ll i = 3; i <= n; i++)
    {
    	if(prime(i))
        {    sum+=i;
           if(prime(sum) && sum <= m) cnt++;
        }
    } 
    cout << cnt;
}