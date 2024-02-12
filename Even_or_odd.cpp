#include<iostream>
using namespace std;
void Even_or_odd(int number) 
{
    if(number%2==0)
    { 
        cout<<number<<" is Even"<<endl;
    }
    else
    { 
        cout<<number<<" is Odd"<<endl;
    }
}
int main() 
{ 
    int a;
    cout<<"Enter a number: ";
    cin>>a;
    Even_or_odd(a);
}
