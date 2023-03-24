import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);

    public static String calc(String input) {
        char[] putIt = new char[3];
        int num = 0;
        Scanner in = new Scanner(System.in);
        int firstNum = in.nextInt();
        char Space = in.next().charAt(0);
        int secondNum = in.nextInt();

        switch (Space) {
            case '+' -> num = firstNum + secondNum;
            case '-' -> num = firstNum - secondNum;
            case '*' -> num = firstNum * secondNum;
            case '/' -> num = firstNum / secondNum;
        }
        return String.valueOf(num);
    }

}

//    static int calc() {
//        int num = 0;
//        Scanner in = new Scanner(System.in);
//        int firstNum = in.nextInt();
//        char Space = in.next().charAt(0);
//        int secondNum = in.nextInt();
//
//        switch (Space) {
//            case '+' -> num = firstNum + secondNum;
//            case '-' -> num = firstNum - secondNum;
//            case '*' -> num = firstNum * secondNum;
//            case '/' -> num = firstNum / secondNum;
//        }
//        return num;
//    }
//}