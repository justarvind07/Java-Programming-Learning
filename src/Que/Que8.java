package Que;

                /*Use continuous keyword */
                /*Printing 1 to 50 but not  3 and the multiple of 3 */
public class Que8 {
    public static void main(String[] args) {
        for (int num = 1; num<50; num++){
            if (num % 3 ==0){
                continue;
            }
            System.out.println(num);
        }
    }
}
