import java.util.Scanner;

public class PersoneAmmalate_02 {

    public static int requiredDaysToHeal(double nAmmalati, double pAG) {
        int rD;
        for(rD = 0;nAmmalati>100;rD++){
            
            nAmmalati -= (pAG/100)*nAmmalati;

        }
        return rD;
    }
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double nAmmalati, pAG;
        
        
        
        
        

        System.out.println("Inserire il numero di ammalati: ");
        nAmmalati = inp.nextInt();  
        System.out.println("Inserire la percentuale di ammalati che ogni giorno guarisce: ");
        pAG = inp.nextInt();  
       
        System.out.println("Sono necessari "+ requiredDaysToHeal(nAmmalati,pAG) + " giorni affinché il numero di ammalati sia minore di 100");
    }
    
}
