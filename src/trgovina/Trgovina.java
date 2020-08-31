package trgovina;
//Main metoda
public class Trgovina {

 
    public static void main(String[] args) {
        //Kreiranje objekata klasa Wine i Chocolate
       Wine wine = new Wine("Barique", 18081, 11.3, 0.7);
        
       Chocolate choco = new Chocolate("Milka", 84000, 1.29, 100);
        
        
        //ispis rezultata
        System.out.println(wine.toString());
        //System.out.println("Cijena vina " + wine.nazivProizvoda + " sa PDV i porezom na alkohol iznosi: " +  wine.ukupnaCijena + " EUR");
        
        System.out.println("");
        
        System.out.println(choco.toString());
        //System.out.println("Cijena cokolade  " + choco.nazivProizvoda + " sa PDV iznosi: " +  choco.cijenaSaPdv + " EUR");

    }
    
}
