
import java.util.Scanner;

public class mcm_01 {

   
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1 = 0, n2 = 0;
        
        System.out.println("Inserire un intero(maggiore di 0): ");
        n1 = inp.nextInt();
        System.out.println("Inserire un intero(maggiore di 0): ");
        n2 = inp.nextInt();
        
        boolean flag = true;
        int ris = 1;
        
        while(flag){
            ris+=1;
            if(ris%n1 == 0 && ris%n2 == 0){
                flag = false;
            }
        }
        System.out.println("l'mcm tra " + n1 + " e " + n2 + " è "+ ris);

        
        
    }
    
}
