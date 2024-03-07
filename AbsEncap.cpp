#include<iostream>
using namespace std;
class AccessSpecifierDemo{
    int privar;
     protected:
        int provar;
    public:
        int pubvar;
        void setVar(int priValue,int proValue, int pubValue){
            privar=priValue;
            pubvar=pubValue;
            provar=proValue;
        }
        void getVar(){
            cout<<"private variable : "<<privar<<endl;
            cout<<"protected variable : "<<provar<<endl;
            cout<<"public variable : "<<pubvar<<endl;
        }
};
int main(){
    int a,b,c;
    AccessSpecifierDemo obj;
    cout<<"Enter private, protected and public values : ";
    cin>>a>>b>>c;
    obj.setVar(a,b,c); 
    obj.getVar();

}
