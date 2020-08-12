#include <iostream>
using namespace std;
int main()
{
    int k,n,t;
    cin>>k>>n>>t;
    int flats[n][n];
    for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			cin>>flats[i][j];
		}
	}
	int pj[n];
	for(int i=0;i<n;i++)
	{
		cin>>pj[i];
	}
	int rj[n];
	for(int i=0;i<n;i++)
	{
		cin>>rj[i];
	}
	int z=0;
		
	for(int i=0;i<n;i++)
	{
		z=0;
		for(int j=0;j<n;j++)
		{
			flats[i][j]=flats[i][j]*pj[z];
			z++;
		}
	}
	int count=0,value=0,wtp=0;
	for(int i=0;i<n;i++)
	{
		value=pj[i];
		wtp=value*rj[i];
		for(int j=0;j<n;j++)
		{
			if(value>=k && wtp<=t)
			{
				count++;
                break;
			}
			wtp+=flats[i][j]*rj[j];
			value+=flats[i][j];
		}
		wtp=0;
		value=0;
	}
	cout<<count;
	return 0;
}