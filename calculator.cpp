#include <iostream>
using namespace std;
int main() 
{
    int a,b,choice;
    cout<<"Enter two numbers: ";
    cin>>a>>b;
    cout<<"1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modular Division\n";
    cout<<"Enter choice: ";
    cin>>choice;
    switch(choice)
    {
        case 1:
           cout<<"Addition of "<<a<<" and "<<b<<" is "<<a+b<<endl;
           break;
        case 2:
           cout<<"Subtraction of "<<a<<" and "<<b<<" is "<<a-b<<endl; 
           break; 
        case 3:
           cout<<"Multiplication of "<<a<<" and "<<b<<" is "<<a*b<<endl;
           break;
        case 4: 
           cout<<"Division of "<<a<<" and "<<b<<" is "<<a/b<<endl;
           break; 
        case 5: 
           cout<<"Modular Division of "<<a<<" and "<<b<<" is "<<int(a)%int(b)<<endl;
           break;
        default :
           cout<<"Invalid Inputs!!!";
    }
    
}

