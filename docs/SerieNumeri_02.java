import java.util.Scanner;

public class SerieNumeri_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeri = new int[1000];
        int numero = 0, cont = 0, i = 0, t_numero = 0;
        boolean flag = true;
        while (numero != 1) {
            System.out.println("Inserisci un nuovo numero");
            numero = input.nextInt();
            numeri[i] = numero;
            i++;
        }
        for(i = 0; i<numeri.length; i++){
            t_numero = numeri[i];
            for(int j = 3; j*j<=t_numero; j+= 2){
            if(t_numero%j!=0){
                flag = true;
            }
           
        }
        }
        System.out.printf("I numeri primi sono %d ", cont);
    }

}
