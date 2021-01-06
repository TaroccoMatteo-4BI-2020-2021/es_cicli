
import java.util.Scanner;

public class DepositoBancario_01 {

   
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int years = 0;
        double saldo = 0, toReach = 0, percInt = 0;
        
        
        System.out.println("Inserire il saldo iniziale: ");
             saldo= inp.nextInt();
            
        System.out.println("Inserire la percentuale di interesse: ");
            percInt = inp.nextInt();
           
        System.out.println("Inserire la soglia da raggiungere: ");
            toReach = inp.nextInt();
        
        for(int i = 0; saldo<toReach;i++){
           
            saldo += (saldo*percInt)/100;
            
            years+=1;
        }
        
            
        System.out.println("Ci vorranno "+ years + " anni ad arrivare a "+ toReach);
        
       

    }
    
}
