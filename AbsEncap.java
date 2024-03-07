import java.lang.*;
import java.util.*;
class AccessSpecifierDemo{
    private
        int privar;
    protected
        int provar;
    public 
        int pubvar;
        void setVar(int priValue,int proValue, int pubValue){
            privar=priValue;
            pubvar=pubValue;
            provar=proValue;
        }
        void getVar(){
           System.out.println("Private value: "+privar);
           System.out.println("Protected value: "+provar);
           System.out.println("Public value: "+pubvar);

        }
}
class AbsEncap{
    public static void main(String[] args){
        int a,b,c;
        AccessSpecifierDemo obj =new AccessSpecifierDemo();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Private, Protected and Public Values : ");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        obj.setVar(a,b,c);
        obj.getVar();

    }
}
