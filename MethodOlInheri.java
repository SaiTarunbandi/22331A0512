import java.util.*;
class add{
    void sum(float a, float b){
        System.out.println("Sum of first two numbers is "+(a+b));
    }
}
class adder extends add{
    void sum(float a,float b,float c){
        System.out.println("Sum of three numbers is "+(a+b+c));
    }
}
class MethodOLInheri{
    public static void main(String[] args){
        float a,b,c;
        adder obj =new adder();
        System.out.print("Enter three numbers : ");
        Scanner input =new Scanner(System.in);
        a=input.nextFloat();
        b=input.nextFloat();
        c=input.nextFloat();
        obj.sum(a,b);
        obj.sum(a,b,c);
    }
}
