
import java.util.Scanner;

public class SerieNumeri_01 {

   
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int nNum = 0, num = 0, precNum = 0;
        
        
        
        do{
            precNum = num;
            System.out.println("Inserire un numero intero: ");
            num = inp.nextInt(); 
            nNum += 1;
            
        }while(num > precNum);
       
        System.out.println("Sono stati inseriti "+ (nNum-1) + " numeri");
    }
    
}
