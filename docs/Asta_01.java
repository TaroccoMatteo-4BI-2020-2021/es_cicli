
import java.util.Scanner;

public class Asta_01 {

   
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int comp1 = 0, comp2 = 0;
        boolean flag =true;
        
        
        while(flag){
            
        
            do{

                System.out.println("Inserire l'offerta del compratore 1(per ritirarsi inserire 0): ");
                comp1 = inp.nextInt();

            }while(comp1 <= comp2 && comp1 != 0);


            if(comp1 != 0){

                do{

                    System.out.println("Inserire l'offerta del compratore 2(per ritirarsi inserire 0): ");
                    comp2 = inp.nextInt();

                }while(comp2 <= comp1 && comp2 != 0);
            }
            
            if(comp1 == 0 || comp2 == 0){
                flag = false;
            }
        }
       
        if(comp1 == 0){
            System.out.println("il compratore 2 si è aggiudicato l'asta con un offerta di "+ comp2);
        }
        else if(comp2 == 0){
            System.out.println("il compratore 1 si è aggiudicato l'asta con un offerta di "+ comp1);
        }
    }
    
}
