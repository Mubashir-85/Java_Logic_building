import java.util.Scanner;

public class PracticeDay3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        ArmStrong number or not
//        int n = sc.nextInt();
//        int t = n, sum =0;
//        while(t != 0){
//            int digit = t % 10; // to get last digit of the number
//            sum += digit*digit*digit;
//            t /= 10;
//        }
//            System.out.println(sum==n ? "ArmStrong" : "not a armstrong");

//        Checking whether the number is Prime or not
//        int p = sc.nextInt();
//        if(p<2) {
//            System.out.println("false");
//            return;
//        }
//        for(int i = 2; i *i <= p; i++){  // i*i<=p -> this means that keep checking number until squares becomes bigger than p
//            if(p % i == 0){
//                System.out.println("not a Prime Number");
//                return;
//            }
//        }
//        System.out.println("Prime number");

//        Table of a Number
//        int table = sc.nextInt();
//        for(int i = 1; i <= 10; i++){
//            System.out.println(table + " x " + i + " = " + (table*i));
//        }

//        Sum of  digits of a number
//        int dig = sc.nextInt(), sum1 = 0;
//        while(dig != 0){
//            int d = dig % 10;
//            sum1+= d;
//            dig /= 10;
//
//        }
//        System.out.println(sum1);


//        Practice


//        int arm = sc.nextInt();
//        int arm2 = arm, result =0;
//        while(arm2 != 0){
//            int digit = arm2 % 10;
//            result += digit*digit*digit;
//            arm2/= 10;
//
//        }
//        System.out.println(result== arm ? "ArmStrong Number" : "No not a ArmStrong Number");

        int prime = sc.nextInt();
        if(prime< 2){
            return;
        }
        for(int i = 2; i*i<=prime; i++){
            if(prime % i == 0){
                System.out.println(prime + " Not a Prime Number");
                return;
            }
        }
        System.out.println(prime +  " Prime Number");

    }
}
