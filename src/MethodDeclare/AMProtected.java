package MethodDeclare;

public class AMProtected {
//    void parentClass(){
//        System.out.println("i am parent class of Arvind");
//    }
    public static void main(String[] args) {
        AMProtected obj = new AMProtected();
//        obj.parentClass();

//        Arvind obj3 = new Arvind();
//        obj3.childClass();

        App3 obj4 = new App3();
        obj4.printChildClass();



    }
}
class App3 extends AccessModifier{
    void printChildClass(){
        App3 obj = new App3();
        System.out.println("Print from parent class to child class :"+ obj.str);
    }
}
//class Arvind extends AMProtected{
//    void childClass(){
//        Arvind obj2 = new Arvind();
//        AMProtected obj = new AMProtected();
//        System.out.println("hi i am ChildClass : " + obj.);
//    }
//}