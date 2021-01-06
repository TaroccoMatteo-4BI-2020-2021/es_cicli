
import java.util.Scanner;

public class PersoneAmmalate_01 {

    public static int remainingDays(double tP, double nPop) {
        int rD;
        double pAmmalate = 1;
        for(rD = 0;pAmmalate<=nPop/2;rD++){
            pAmmalate = pAmmalate + pAmmalate*tP;
        }
        return rD;
    }
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double tP, nPop;
        
        
        
        System.out.println("Inserire il tasso di propagazione del virus: ");
        tP = inp.nextInt();  
        System.out.println("Inserire la quantità di persone della popolazione: ");
        nPop = inp.nextInt();  
       
        System.out.println("Rimangono "+ remainingDays(tP,nPop) + " giorni prima che sia ammalata almeno la metà della popolazione");
    }
    
}
