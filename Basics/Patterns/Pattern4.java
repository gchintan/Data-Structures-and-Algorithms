package Basics.Patterns;
/*
    1
    22
    333
    4444
    55555
*/

public class Pattern4 {

    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int n = 5;
        pattern4(n);
    }
}
