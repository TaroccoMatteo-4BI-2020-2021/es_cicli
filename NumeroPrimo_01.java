
import java.util.Scanner;

public class NumeroPrimo_01 {

   
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1 = 0;
        
        System.out.println("Inserire un intero: ");
        n1 = inp.nextInt();
        
        
        boolean flag = true;
        
        if(n1 % 2 == 0){
            for(int i = 3;i<n1;i++){
                if(n1 % i == 0){
                    i = n1 +4;
                    flag = false;
                }
            }
        }else{
            flag = false;
        }
        
        if(flag){
            System.out.println("il numero è primo");
        }else{
            System.out.println("il numero non è primo");
        }
       

        
        
    }
    
}
