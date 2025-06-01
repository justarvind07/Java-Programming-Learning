package MethodDeclare;

public class MethodScope {
    static void changeValue(int a){
        a*=100;
        System.out.println("Inside change value is "+ a);
    }

    public static void main(String[] args) {
        int a= 10;
        System.out.println("Before the Changing value of is "+ a);
        changeValue(a);
        System.out.println("After the Changing value of is "+ a);
    }
}