// 24. Sa se implementeze clasele Cosmetice, Sampon, CremaFata, CremaCorp, 
// AfterShave, GelDeDus, cu căte 3 instanţe fiecare, pentru care să se afişeze toate câmpurile.
package com.mycompany.curs9_24;

// Clasa Cosmetice (clasa de bază)
class Cosmetice {
    protected String denumire;
    protected double pret;
    protected String tip;

    public Cosmetice(String denumire, double pret, String tip) {
        this.denumire = denumire;
        this.pret = pret;
        this.tip = tip;
    }

    public void afiseaza() {
        System.out.println("Denumire: " + denumire);
        System.out.println("Pret: " + pret + " RON");
        System.out.println("Tip: " + tip);
    }
}

// Clasa Sampon (subclasa)
class Sampon extends Cosmetice {
    private int volum;

    public Sampon(String denumire, double pret, int volum) {
        super(denumire, pret, "Sampon");
        this.volum = volum;
    }

    @Override
    public void afiseaza() {
        super.afiseaza();
        System.out.println("Volum: " + volum + " ml");
    }
}

// Clasa CremaFata (subclasa)
class CremaFata extends Cosmetice {
    private String tipTen;

    public CremaFata(String denumire, double pret, String tipTen) {
        super(denumire, pret, "Crema pentru fata");
        this.tipTen = tipTen;
    }

    @Override
    public void afiseaza() {
        super.afiseaza();
        System.out.println("Tip ten: " + tipTen);
    }
}

// Clasa CremaCorp (subclasa)
class CremaCorp extends Cosmetice {
    private String aroma;

    public CremaCorp(String denumire, double pret, String aroma) {
        super(denumire, pret, "Crema pentru corp");
        this.aroma = aroma;
    }

    @Override
    public void afiseaza() {
        super.afiseaza();
        System.out.println("Aroma: " + aroma);
    }
}

// Clasa AfterShave (subclasa)
class AfterShave extends Cosmetice {
    private String tipParfum;

    public AfterShave(String denumire, double pret, String tipParfum) {
        super(denumire, pret, "After shave");
        this.tipParfum = tipParfum;
    }

    @Override
    public void afiseaza() {
        super.afiseaza();
        System.out.println("Tip parfum: " + tipParfum);
    }
}

// Clasa GelDeDus (subclasa)
class GelDeDus extends Cosmetice {
    private int volum;

    public GelDeDus(String denumire, double pret, int volum) {
        super(denumire, pret, "Gel de dus");
        this.volum = volum;
    }

    @Override
    public void afiseaza() {
        super.afiseaza();
        System.out.println("Volum: " + volum + " ml");
    }
}

public class Curs9_24 {
    public static void main(String[] args) {
        // Creare obiecte pentru fiecare tip de produs cosmetic
        Sampon sampon1 = new Sampon("Sampon Anti-Matreata", 25.0, 250);
        Sampon sampon2 = new Sampon("Sampon Hidratare", 30.0, 300);
        Sampon sampon3 = new Sampon("Sampon Revitalizant", 35.0, 350);

        CremaFata crema1 = new CremaFata("Crema Fata Hidratanta", 45.0, "Uscat");
        CremaFata crema2 = new CremaFata("Crema Fata Regeneranta", 50.0, "Normal");
        CremaFata crema3 = new CremaFata("Crema Fata Anti-Aging", 60.0, "Matur");

        CremaCorp cremaCorp1 = new CremaCorp("Crema Corp Fina", 40.0, "Lavanda");
        CremaCorp cremaCorp2 = new CremaCorp("Crema Corp Citron", 35.0, "Citronella");
        CremaCorp cremaCorp3 = new CremaCorp("Crema Corp Vanilie", 42.0, "Vanilie");

        AfterShave afterShave1 = new AfterShave("AfterShave Fresh", 25.0, "Citrice");
        AfterShave afterShave2 = new AfterShave("AfterShave Mentol", 28.0, "Mentol");
        AfterShave afterShave3 = new AfterShave("AfterShave Relax", 30.0, "Lavanda");

        GelDeDus gelDeDus1 = new GelDeDus("Gel Dus Sensitiv", 18.0, 250);
        GelDeDus gelDeDus2 = new GelDeDus("Gel Dus Revitalizant", 22.0, 300);
        GelDeDus gelDeDus3 = new GelDeDus("Gel Dus Hidratare", 20.0, 350);

        // Afișare detalii pentru fiecare produs
        System.out.println("Produse Sampon:");
        sampon1.afiseaza();
        sampon2.afiseaza();
        sampon3.afiseaza();

        System.out.println("\nProduse Crema Fata:");
        crema1.afiseaza();
        crema2.afiseaza();
        crema3.afiseaza();

        System.out.println("\nProduse Crema Corp:");
        cremaCorp1.afiseaza();
        cremaCorp2.afiseaza();
        cremaCorp3.afiseaza();

        System.out.println("\nProduse AfterShave:");
        afterShave1.afiseaza();
        afterShave2.afiseaza();
        afterShave3.afiseaza();

        System.out.println("\nProduse Gel de Dus:");
        gelDeDus1.afiseaza();
        gelDeDus2.afiseaza();
        gelDeDus3.afiseaza();
    }
}
