import java.util.Scanner;

public class ControlloInput_01 {

    
    public static void main(String[] args) {
        int numero = 0, somma = 0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Inserire un nuovo numero");
            numero = input.nextInt();
            if(numero>0){
            somma += numero;
            }
        }while(numero!=0);
        System.out.println("La somma è " + somma);
    }
    
}
