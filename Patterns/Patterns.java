package Patterns;

public class Patterns {

    static void pattern1(int n){
        /*
         *****
         *****
         *****
         *****
         *****
         */
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern2(int n){
        /*

         *
         **
         ***
         ****
         *****

         */

        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern3(int n){
        /*
        1
        12
        123
        1234
        12345
        */
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

    static void pattern4(int n){
        /*
        1
        22
        333
        4444
        55555
         */
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }

    static void pattern5(int n){
        /*
        12345
        1234
        123
        12
        1
        */

        for (int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args){
        int n=5;
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);

    }


}
