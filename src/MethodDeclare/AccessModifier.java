package MethodDeclare;

public class AccessModifier {
    public String str = "I am a Public member";

    void withingTheClass() {
        System.out.println("Within Class " + str);
    }

    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        obj.withingTheClass();
        System.out.println(obj.str);
        App2 obj2 = new App2();
        obj2.outSideClass();
    }
}
    class App2 {
        void outSideClass() {
            AccessModifier obj = new AccessModifier();
            System.out.println("Within package but Outside of class :" + obj.str);
        }
    }
