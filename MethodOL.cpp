#include<iostream>
using namespace std;
void sum(int a,int b){
    cout<<"Sum of first two numbers is "<<(a+b)<<endl;
}
void sum(int a, int b,int c){
    cout<<"Sum of first three numbers is "<<(a+b+c)<<endl;
}
void sum(int a, int b,int c,int d){
    cout<<"Sum of four numbers is "<<(a+b+c+d)<<endl;
}
int main(){
    int a,b,c,d;
    cout<<"Enter four integers : ";
    cin>>a>>b>>c>>d;
    sum(a,b);
    sum(a,b,c);
    sum(a,b,c,d);
}
