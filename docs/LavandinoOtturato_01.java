
import java.util.Scanner;

public class LavandinoOtturato_01 {

   
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int years = 0;
        double scarico = 0, rubinetto = 0, livello = 0, capacita = 0;
        
        
        System.out.println("Inserire il numero di cl che il lavandino riesce a scaricare ogni secondo: ");
             scarico= inp.nextInt();
            
        System.out.println("Inserire quanti cl di acqua perde il rubinetto ogni 3 secondi: ");
            rubinetto = inp.nextInt();
           
        System.out.println("Inserire il livello iniziale di acqua: ");
            livello = inp.nextInt();
           
        System.out.println("Inserire la capacità del lavandino: ");
            capacita = inp.nextInt();
        
        for(int i = 0; i<21 ;i++){
           
            if(i == 2 || i == 5 || i == 8 || i == 11 || i == 14 || i == 17){
                livello+=rubinetto;
            }
            livello-=scarico;
            if(livello>=capacita || livello<=0){
                i = 22;
            }else{
                System.out.println("livello lavandino: "+livello);
            }
            
            
        }
        
            
    
        
       

    }
    
}
