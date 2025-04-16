package Basics.Maths;

public class CountDigits {
    static int countDigits(int n){
        int count=0;
        while(n>0){
            count=count+1;
            n=n/10;
        }
        return count;
    }

    public static void main(String[] args){
        int n=1957894736;
        int count=countDigits(n);
        System.out.print("No. of digits is: "+count);
    }
}
