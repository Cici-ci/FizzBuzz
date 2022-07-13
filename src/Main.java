import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while (true) {
           int number=scanner.nextInt();
           if(number==0)
               break;
               judgeScanner(number);

        }

    }
    public  static  void judgeScanner(int number){
        if (number%3==0&&number%5==0)
            System.out.println("FizzBuzz");
        else if (number%3==0)
            System.out.println("Fizz");
        else if (number%5==0)
            System.out.println("BUzz");
        else
            System.out.println(number);

    }
}