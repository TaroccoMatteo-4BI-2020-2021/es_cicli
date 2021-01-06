
import java.util.Scanner;

public class PosizioneCifra_01 {

   
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String n1 = "";
        
        System.out.println("Inserire un intero: ");
        n1 = inp.nextLine();
        
        
        boolean flag = true;
        
        for(int i=0 ; i<n1.length() ;i++){
            char corrente = n1.charAt(n1.length()-i-1);
            if(Character.getNumericValue(corrente) < i){
                i = n1.length() +5;
                flag = false;
            }
        }
        if(flag){
            System.out.println("il numero rispetta la proprietà");
        }else{
            System.out.println("il numero non rispetta la proprietà");
        }
       

        
        
    }
    
}
