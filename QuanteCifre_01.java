
import static java.lang.Math.log10;
import java.util.Scanner;

public class QuanteCifre_01 {

   
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n_inp = 0, ncifre = 0;
        
        System.out.println("Inserire un intero: ");
        n_inp = inp.nextInt();
        ncifre=(int) (log10(n_inp)+1);
        System.out.println("Questo numero è composto da " + ncifre + " cifre");

        
        
    }
    
}
