
import java.util.Scanner;

public class SerieNumerica_01 {

   
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = 0, precnum = 0;
        
        
        do{
            precnum = num;
            System.out.println("Inserire un numero: ");
            num = inp.nextInt();
        }while(num != precnum);
        
       

    }
    
}
