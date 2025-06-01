package IntroOOPs;

public class Student {
    int rollNo;
    String studentName;
    String studentAddress;

    public static void main(String[] args) {
        Student obj = new Student();
        obj.rollNo = 5656;
        obj.studentName = "Ritik";
        obj.studentAddress = "Ambikapur";
        System.out.println(obj.rollNo);
        System.out.println(obj.studentName);
        System.out.println(obj.studentAddress);
    }

//    protected void student() {
//        int rollNo;
//        String studentName;
//        String studentAddress;
//    }

}
