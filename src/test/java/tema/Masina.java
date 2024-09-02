package tema;

import org.testng.annotations.Test;

public class Masina {
    public String marca;
    public int pret;
    public String culoare;
    public boolean esteNoua;
    public float inaltime;
    public char valuta;
    public String uMasura;

    @Test

    public void prezentareMasina() {
        marca = "BMW";
        pret = 10000;
        valuta = 'E';
        culoare = "verde";
        esteNoua = false;
        inaltime = 66.65f;
        uMasura = "in";

        System.out.println("Masina prezentata este " + marca);
        System.out.println("Pretul masinii este de " + pret + " " + valuta);
        System.out.println("Culoarea masinii este " + culoare + " ,iar inaltimea ei este de " + inaltime + " " + uMasura);
        System.out.println("Masina este noua?" + esteNoua);


    }


}
