import java.util.Scanner;
class student1{
    public 
        student1(){
            System.out.println("Hi! constructer has been created");
        }
        String fullName;
        int rollNum;
        double semPerentage;
        String collegeName;
        int collegeCode;
}
class student{
    public static void main(String[] args){
        Scanner op=new Scanner(System.in);
        student1 tarun=new student1();
        System.out.println("Enter your name :");
        tarun.fullName=op.next();
        System.out.println("Enter your rollnumber :");
        tarun.rollNum=op.nextInt();
        System.out.println("Enter your sempercantage :");
        tarun.semPerentage=op.nextInt();
        System.out.println("Enter your collegename :");
        tarun.collegeName=op.next();
        System.out.println("Enter your collegecode :");
        tarun.collegeCode=op.nextInt();
        System.out.println("Name : "+tarun.fullName+"\nRoll number : "+tarun.rollNum+"\nSempercentage : "+tarun.semPerentage+"\nCollegename : "+tarun.collegeName+"\nCollegecode : "+tarun.collegeCode);

    }
}
