import java.util.*;

public class PracticeDay2 {
    public static void main(String[] args) {


//    Check whether the Leap Year or not
        Scanner sc = new Scanner(System.in);
//        int y = sc.nextInt();
//        boolean leap = (y % 4 == 0);
//        System.out.println(leap ? "Is Leap year" : "No, not a Leap Year");

//    Swap two numbers (with and without Third Variable)
//        int a = 10 , b = 20;
////        with Third variable
//        int temp = a; a = b; b=temp;
//        System.out.println("a=" + a + " " + "b="+ b);

//        Factorial Number
//        int n = sc.nextInt();
//        long fact = 1;
//        for(int i = 1; i<=n; i++) fact *= i;
//        System.out.println(fact);

//        Reverse a Number
        int n = sc.nextInt();
        int rev = 0;
        while(n!= 0) {
            int digit = n % 10;
            rev = rev *10 + digit;
            n = n/ 10;
        }
        System.out.println(rev);

//        Palindrome number check
        int number = sc.nextInt();
        int original = number;
        int palindrome = 0;
        while (number!= 0){
            int digit = number % 10;
            palindrome = palindrome * 10 + digit;
            number = number / 10;
        }
        System.out.println(original==palindrome ? "Is Palindrome" : "Not a Palindrome");
    }

}
