package Basics.Maths;

public class CheckPrime {
    static boolean primeCheck(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count=count+1;
            }
        }
        return count==2;
    }
    public static void main(String[] args){
        int n=2;
        if(primeCheck(n)){
            System.out.print("Number is prime");
        } else{
            System.out.print("Number is not prime");
        }
    }
}
