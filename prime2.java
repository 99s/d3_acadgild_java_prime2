import java.io.*;
import java.util.Scanner;
public class prime2 {
 
    public boolean isPrimeNumber(int number){
         
        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
     
    public static void main(String []args){
        isPrimeNumber ipn = new isPrimeNumber();
        System.out.println("Enter A number : ");
        Scanner c = new Scanner(System.in);
        int x = inputN.nextInt();

        System.out.println("Is "+x+ " a prime number? "+ipn.isPrimeNumber(x));
        
    }
}
