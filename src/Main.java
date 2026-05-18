import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)throws Exception {
//            sum of two
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt(), b = sc.nextInt();
//        System.out.println(a+b);
//        sc.close();

//        Check Even or Odd
//        int n = sc.nextInt();
//        System.out.println( n % 2 == 0 ? "true" : "false");
//        sc.close();

//        Largest of Two numbers
//        int l = sc.nextInt(), m = sc.nextInt();
//        System.out.println(l > m ? l : m);
//        sc.close();

//        Largest number of three
//        int l2 = sc.nextInt(), m2 = sc.nextInt(), n2 = sc.nextInt();
//        int max = l2;
//        if(m2 > max) max = m2;
//        if(n2 > max) max = n2;
//        System.out.println(max);
//        sc.close();
//
//        Positve Negative and Zero Check
        double n = sc.nextDouble();
        if(n>0) System.out.println("Positive Number");
        else if(n<0) System.out.println("Negative Number");
        else System.out.println("Zero");
        sc.close();


    }

}