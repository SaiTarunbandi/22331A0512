#include<iostream>

using namespace std;
 class count{
    public:
        int value = 10;

        void operator++(){
            ++value;
        }    
        void display(){
            cout<<"The increment value : "<<value<<endl;
        }                                 
 };

 int main(){
    count obj;
    ++obj;
    obj.display();

 }
