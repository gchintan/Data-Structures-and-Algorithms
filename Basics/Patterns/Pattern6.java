package Basics.Patterns;

/*
    12345
    1234
    123
    12
    1
*/

public class Pattern6 {
    static void pattern6(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(n-j+1+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern6(n);
    }
}
