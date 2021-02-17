package carta;
public class Carta {
    
    private String seme;
    private String valore;
    
    public Carta(){
        this.seme = "";
        this.valore = "";
}
    public Carta(String seme, String valore){
        this.seme = seme;
        this.valore = valore;
    
    }
    public void setSeme(String seme){
        this.seme = seme;
    
    }
    public void setValore(String valore){
        this.valore = valore;
    }
    public void set(String seme, String valore){
        setSeme(seme);
        setValore(valore);
    }
    public String getSeme(){
        return this.seme;
    }
    public String getValore(){
        return this.valore;
    }
    public String toString(){
        String s;
        s = "seme: " + this.seme + " e valore: " + this.valore;
        return s;
    }
    public boolean equals(Carta c){
        return this.toString().equals(c.toString()); 
    }
    public int calcolaPunteggio(){
    int punti;
    if(this.valore == "A" || this.valore == "J" || this.valore == "Q" || this.valore == "K"){
        punti = 10;
    }
    else{
    if(this.valore == "*"){
        punti = 25;
    }
    else{
    punti = Integer.parseInt(this.valore);
    }
    }
    return punti;
    }
    public Carta vince(Carta c){
        int valore1, valore2;
    valore1 = calcolaPunteggio(this);
    valore2 = calcolaPunteggio(c);
    
    if(valore1>valore2){
        return this;
    }
    else{
        return c;
    }
    }
    public Carta fondi(Carta c){
        Carta c1 = new Carta();
    if(this.valore != "*" && c.valore != "*"){
        c1.setSeme(this.seme);
        c1.setValore(c.valore);
        return c1;
    }
    else{
        return null;
    }
    }   
}