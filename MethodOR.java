#include<iostream>
using namespace std;
class parent{
    public:
    void num(){
        cout<<"10 is the number"<<endl;
    }
};
class son :public parent{
    public:
    void num(){
        cout<<"20 is the number"<<endl;
    }
};
int main(){
    parent a;
    son b;
    a.num();
    b.num();

}
