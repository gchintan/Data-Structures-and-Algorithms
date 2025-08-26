package Basics.Maths;

public class ReverseNumber {

    static int reverseNum(int n){
        int rev=0;
        while(n>0){
            int digit = n%10;
            n=n/10;
            rev=rev*10+digit;
        }
        return rev;
    }

    public static void main(String[] args){
        int n=12345;
        System.out.print("Reverse of number "+ n + " is :"+reverseNum(n));

    }

}
