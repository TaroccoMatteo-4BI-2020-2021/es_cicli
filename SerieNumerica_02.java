
import java.util.Scanner;

public class SerieNumerica_02 {

   
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = 0, precnum = 0, prec2num = 0;
        
        boolean flag = true;
        
        do{
            prec2num = precnum;
            precnum = num;
            
            System.out.println("Inserire un numero: ");
            num = inp.nextInt();
            if((precnum + num) == 10){
                flag = false;
            }
            if(prec2num == num){
                flag = false;
            }
      
        }while(flag);
        
       

    }
    
}
