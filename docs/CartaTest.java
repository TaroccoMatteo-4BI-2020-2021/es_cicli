package carta;
public class CartaTest {
public static void main(String args[]){
    Carta c1 = new Carta("picche", "4");
    Carta c2 = new Carta("quadri", "J");
    Carta c3 = new Carta("cuori", "7");
    Carta c4 = new Carta();
    c1.setValore("3");
    c1.setSeme("quadri");
    System.out.println("c1 = " + c1.toString());
    System.out.println("c1 fuso c2: "+c1.fondi(c2));
    System.out.println(c1.equals(c3));
    c1.setValore("4");
    c1.setSeme("cuori");
    System.out.println(c1.vince(c2));
    System.out.println(c1.vince(c3));
    System.out.println("Il punteggio della carta 2 é: "+c2.calcolaPunteggio());
    System.out.print("Carta3 : ");
    System.out.print(c1.getSeme()+ " e ");
    System.out.print(c1.getValore()+" ");
    
    
}    
}
