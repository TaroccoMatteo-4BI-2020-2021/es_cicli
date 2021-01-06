
import java.util.Scanner;

public class Asta_02 {

   
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int comp1 = 0, comp1_t = 0, comp2 = 0, comp2_t = 0;
        boolean flag =true;
        
        
        while(flag){
            
        
            do{

                System.out.println("Inserire il rilancio del compratore 1(per ritirarsi inserire 0): ");
                comp1 = inp.nextInt();
                

            }while(comp1+comp1_t <= comp2_t && comp1 != 0);

            comp1_t +=comp1;

            if(comp1 != 0){

                do{

                    System.out.println("Inserire il rilancio del compratore 2(per ritirarsi inserire 0): ");
                    comp2 = inp.nextInt();

                }while(comp2+comp2_t <= comp1_t && comp2 != 0);
                
                comp2_t += comp2;
            }
            
            
            
            if(comp1 == 0 || comp2 == 0){
                flag = false;
            }
        }
       
        if(comp1 == 0){
            System.out.println("il compratore 2 si è aggiudicato l'asta con un offerta di "+ comp2_t);
        }
        else if(comp2 == 0){
            System.out.println("il compratore 1 si è aggiudicato l'asta con un offerta di "+ comp1_t);
        }
    }
    
}
