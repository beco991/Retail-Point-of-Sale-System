package trgovina;
//Klasa Chocolate
public class Chocolate extends Product {
    
    public int tezina;
    
    //konstruktor
    
    public Chocolate(String nazivProizvoda, int barKod, double osnovnaCijena, int tezina){ 
    super(nazivProizvoda, barKod, osnovnaCijena);
    this.tezina = tezina;
    }
  
     @Override
    public String toString() {
        return super.toString() + " " + "Tezina: " + tezina + "gr";
        //return "Artikal: " + nazivProizvoda + ", Tezina:" + tezina + "gr," + " Bar Kod: " + barKod + ", Cijena: " + osnovnaCijena + " EUR, PDV: " + POREZ + "%" ;
    }
    
}
