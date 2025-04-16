package Basics.Maths;

public class PalindromeCheck {
    static boolean checkPalindrome(int n){
        int temp=n;
        int rev=0;
        while(n>0){
            rev=rev*10+(n%10);
            n=n/10;
        }
        if(temp==rev){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        int n=121;
        if(checkPalindrome(n)){
            System.out.print("Number is palindrome");
        } else{
            System.out.println("Number is not a palindrome");
        }

    }
}
