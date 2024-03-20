class parent{
    void num(){
        System.out.println("10 is the number");
    }
}
class son extends parent{
    void num(){
        System.out.println("20 is the number");
    }
}
class override{
    public static void main(String[] args){
        parent a = new parent();
        son b = new son();
        a.num();
        b.num();

    }
}
