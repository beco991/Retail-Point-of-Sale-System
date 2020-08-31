package trgovina;
//Osnovna klasa Product sa osnovnim atributima i metodom za racunanje cijene sa PDV
abstract class Product {
    
    public String nazivProizvoda;
    public int barKod;
    public double osnovnaCijena;
    public final int POREZ = 20;
    
    public double cijenaSaPdv;
    
    
    public Product(String nazivProizvoda, int barKod, double osnovnaCijena){
    this.nazivProizvoda = nazivProizvoda;
    this.barKod = barKod;
    this.osnovnaCijena = osnovnaCijena;
    
    }
    
    @Override
    public String toString() {
        return "Artikal: " + nazivProizvoda + " Bar Kod: " + barKod + ", Cijena: " + racunanjeCijene() + " EUR, PDV: " + POREZ + "%" ;
    }
    
    public double racunanjeCijene(){
        cijenaSaPdv = osnovnaCijena + ((osnovnaCijena * POREZ)/100);
        return cijenaSaPdv;
    }
}
