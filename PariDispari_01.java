
import java.util.Scanner;

public class PariDispari_01 {

   
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String n1 = "";
        int pari = 0, dispari = 0;
        
        System.out.println("Inserire un intero: ");
        n1 = inp.nextLine();
        
      
        
        for(int i=0 ; i<n1.length() ;i++){
            char corrente = n1.charAt(n1.length()-i-1);
            if(Character.getNumericValue(corrente) % 2 == 0){
                pari += 1;
            }else{
                dispari += 1;
            }
        }
        
        System.out.println("ci sono "+ pari + " cifre pari e "+ dispari +" cifre dispari");

        
        
    }
    
}
