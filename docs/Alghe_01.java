
import java.util.Scanner;

public class Alghe_01 {

   
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int pop = 0, toReach = 0, years = 0;
        
        
        System.out.println("Inserire la popolazione iniziale: ");
            pop = inp.nextInt();
           
        System.out.println("Inserire la popolazione da raggiungere: ");
            toReach = inp.nextInt();
        
        for(int i = 0; pop<toReach;i++){
            if(years % 2 == 0){
                pop = pop*2;
                //System.out.println("pari");
            }
            else{
                pop -= (pop/100)*33;
                //System.out.println("dispari");
            }
            years+=1;
        }
        
            
        System.out.println("La popolazione ci metterà "+ years + " anni ad arrivare a "+ toReach + " abitanti");
        
       

    }
    
}
