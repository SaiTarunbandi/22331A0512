#include<iostream>
using namespace std;

class Student
{
    public:
        string fullName;
        int rollNum;
        double semPerentage;
        string collegeName;
        int collegeCode;
        Student()
        {
            cout<<"Student class initialized!!\n";
        }
        ~Student(){}
};

int main()
{
    Student tarun;
    cout<<"Enter your name : ";
    getline(cin,tarun.fullName);
    cout<<"Enter your roll number : ";
    cin>>tarun.rollNum;
    cout<<"Enter your sem percentage : ";
    cin>>tarun.semPerentage;
    cout<<"Enter your college name : ";
    cin>>tarun.collegeName;
    cout<<"Enter your college code : ";
    cin>>tarun.collegeCode;
    cout<<"Name : "<<tarun.fullName<<endl;
    cout<<"RollNum : "<<tarun.rollNum<<endl;
    cout<<"SemPercentage : "<<tarun.semPerentage<<endl;
    cout<<"CollegeName : "<<tarun.collegeName<<endl;
    cout<<"CollegeCode : "<<tarun.collegeCode<<endl;
    return 0;
}
