package variabilaMetoda;

import org.testng.annotations.Test;

public class Animal {
    public String rasa;
    public boolean esteMamifer;
    public String culoare;
    public int varsta;
    public double greutate;

    @Test
    public void metodaTest() {

        //prezentareAnimal("caine", true, "maro", 2, 20.1);
        //prezentareAnimal("pisica", true, "alba", 3, 5.2);
        prezentareAnimal("soarece", true, "gri", 1, 2.2);
    }

    //!o clasa sa aiba o singura metoda de test

    public void prezentareAnimal(String param1, boolean param2, String param3, int param4, double param5) {
        int pret = 50;
        System.out.println();
        System.out.println("pretul animalului este de " + pret + " de lei");
        System.out.println("Animalul este " + param1);
        System.out.println("Este mamifer? " + param2);
        System.out.println("Este de culoare  " + param3);
        System.out.println("Animalul are varsta de  " + param4 + " ani si greutatea de " + param5 + " kg");
        System.out.println(" ");
    }


}
