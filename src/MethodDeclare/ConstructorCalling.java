package MethodDeclare;

import java.awt.*;

public class ConstructorCalling {
    int a;
    int b;
    ConstructorCalling(int x, int y) {
        a = x;
        b = y;
        System.out.println("Constructor of Constructor calling");
    }
    int add(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
    int di(){
        return a/b;
    }

    public static void main(String[] args) {
        ConstructorCalling obj = new ConstructorCalling(7,6);
        System.out.println(obj.di());
        System.out.println(obj.sub());
        System.out.println(obj.add());
        ConstructorCalling obj2 = new ConstructorCalling(20,10);
        System.out.println(obj2.di());
        System.out.println(obj2.sub());
        System.out.println(obj2.add());
    }
}
