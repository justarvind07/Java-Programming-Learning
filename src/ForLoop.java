import java.util.Scanner;
public class ForLoop {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a=0;
        /*for (int i = x; i >=1; i*=2){
            a = a+i;
            System.out.println(i);
        }*/
        for (int i = 1; i<=10; i++){
            a = i*x;
            System.out.println(a);
        }
    }
}
