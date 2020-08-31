package trgovina;
//klasa Wine
public class Wine extends Product {
    
    //atributi
    public double zapreminaBoce;
    final int DODATNI_POREZ = 10;
    
    
     //konstruktor
    public Wine(String nazivProizvoda, int barKod, double osnovnaCijena, double zapreminaBoce){
    super(nazivProizvoda, barKod, osnovnaCijena);
    this.zapreminaBoce = zapreminaBoce;
    }
    
    //Override metode za racunanje cijene iz klase Product
    @Override
    public double racunanjeCijene(){
        cijenaSaPdv = super.racunanjeCijene() + ((super.racunanjeCijene() * DODATNI_POREZ) / 100);
       //ukupnaCijena = osnovnaCijena + ((osnovnaCijena * POREZ)/100) + (((osnovnaCijena + ((osnovnaCijena * POREZ)/100)) * DODATNI_POREZ) / 100); 
       return cijenaSaPdv;
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + "Zapremina boce: " + zapreminaBoce + "l";
        //return "Artikal: " + nazivProizvoda + ", Zapremina boce:" + zapreminaBoce + "l," + " Bar Kod: " + barKod + ", Cijena: " + osnovnaCijena + " EUR, PDV: " + POREZ + "%" ;
    }
    

    
}
