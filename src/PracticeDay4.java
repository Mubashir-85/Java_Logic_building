import java.util.*;





public class PracticeDay4 {
    public static void main(String[] args){
//Square Pattern
        int n = 4;
        for(int i = 0;i<n; i++){
            for(int j =0;j<n; j++) System.out.print("*");
            System.out.println();

        }
        System.out.println();
//        triangle pattern
        int n2  = 5;
        for(int i = 1;i<=n2;i++){
            for(int j =1; j<=i; j++) System.out.print("*");
            System.out.println();

        }
        System.out.println();
//            inverted triangle
            int n3 = 5;
            for(int i = n3;i>=1;i--){
                for(int j = 1; j<=i; j++) System.out.print("*");
                System.out.println();
            }

        System.out.println();
//            Number Pattern
            int n4=5;
            for(int i =1; i<=n4; i++){
                for(int j = 1;j<=i;j++) System.out.print(j);
                System.out.println();
            }



    }
}
