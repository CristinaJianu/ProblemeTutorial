package obiectConstructor;

import java.util.List;

public class Masina {

    /*
    constructor = are ca rol sa initializeze variabilele unei clase
    recunoastem un constr intr-o clasa dupa numele acestuia
    de cele mai multe ori constructorul este public
    intr-o clasa putem avea mai multi constr care se diferentiaza prin nr/tipul de param
    o clasa contine intotdeauna un constr default(nu are param)
    constr pot fi de 2 tipuri cu param/fara param


    obiect=instanta unei clase
    dintr-o clas putem sa definim mai multe obiecte care sa aiba valori dif pt proprietati
    in mom in care avem un obiect de tipul unei clase putem accesa variabile/metode din clasa respectiva
    obiectele se diferentiaza prin numele acestora
    recunoastem un obiect dupa cuv cheie "new"
    structura: tipObiect numeObiect=new tipObiect ()
     */

    public String marca;
    public String model;
    public int an;
    public String culoare;
    public List<String> dotariInterioare;
    public String motorizare;
    public int pret;
    public int pretFinal;

    public Masina(String marca, String model, int an, String culoare, List<String> dotariInterioare, String motorizare) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.culoare = culoare;
        this.dotariInterioare = dotariInterioare;
        this.motorizare = motorizare;
    }

    public Masina(int pret, String motorizare, List<String> dotariInterioare, String culoare, int an, String model, String marca) {
        this.pret = pret;
        this.motorizare = motorizare;
        this.dotariInterioare = dotariInterioare;
        this.culoare = culoare;
        this.an = an;
        this.model = model;
        this.marca = marca;
    }

    public void prezentareMasina() {
        System.out.println("Marca masinii este " + marca);
        System.out.println("Culoarea masinii este " + culoare);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Dotarile masinii sunt urmatoarele");
        for (int i = 0; i < dotariInterioare.size(); i++) {
            System.out.println(dotariInterioare.get(i));
        }
//        for (String s : dotariInterioare) {
//            System.out.println(s);
//        }
        System.out.println("Anul masinii este " + an);
        System.out.println("Monitorizarea masinii este " + motorizare);
       calculPret();

    }

    //determinam impozitul in fct de anul de fabricatie
    //<2000 500 ron
    //2005-2015 300 ron
    //>2020 100 ron

    public void calculImpozit() {
        if (an <= 2000) {
            System.out.println("impozitul este 500");
        } else if (an >= 2005 && an <= 2015) {
            System.out.println("impozitul este 300");
        } else if (an >= 2020) {
            System.out.println("impozitul este 100");
        }
    }

    //determinam pretul standard si final in fct de dotari

    public void calculPret() {
        if (pret != 0) {
            System.out.println("pretul de pornire este " + pret);
        }
        if (dotariInterioare.isEmpty()) {
            System.out.println("pretul final este " + pret);
        } else {
            int dotari=0;
            for(int i=0; i<dotariInterioare.size(); i++)
            {
                switch (dotariInterioare.get(i)){
                    case "-AC":
                        dotari=dotari+1000;
                        break;
                    case "-Airbag":
                        dotari=dotari+2000;
                        break;
                }
            }
            System.out.println("pretul dotarilor final este "+dotari);
            pretFinal=pret+dotari;
            System.out.println("pretul final este "+pretFinal);
        }
    }

    //aplicam reducere

    public void calculReducere(int procentReducere)
    {
        int reducere=(pretFinal*procentReducere)/100;
     pretFinal=pretFinal-reducere;
        System.out.println("s-a aplicat o reducere de "+procentReducere+" din pretul final");
        System.out.println("pretul final este "+pretFinal);
    }

}
