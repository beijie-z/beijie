import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int number= input.nextInt();
       if(number%2==0){
           System.out.println("偶数");
       }
       else {
           System.out.println("奇数");
       }

    }
}