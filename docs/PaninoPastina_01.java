import java.util.Scanner;

public class PaninoPastina_01 {

   
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double money = 100;
        int giorni = 0, nPastine = 0, nPanini = 0;
        String cibo;
        
   
        System.out.println("Inserire quanti soldi ha Mario: ");
        money = inp.nextInt();  
        Scanner inpStr = new Scanner(System.in);
        
        do{
            System.out.println("Cosa mangia Mario oggi? (pastina o panino)");
            cibo = inpStr.nextLine();
            if(cibo.equalsIgnoreCase("pastina")){
                money -= 1;
                giorni +=1;
                nPastine +=1;
            }
            else if(cibo.equalsIgnoreCase("panino")){
                money -= 1.5;
                giorni +=1;
                nPanini +=1;
            }else{
                money = 0;
            }
            
        }while(money > 1);
       
        System.out.println("Mario ha mangiato " + giorni + " giorni, " + nPastine + " pastine e "+ nPanini + " panini");
    }
    
}
