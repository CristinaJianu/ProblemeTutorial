package tema1;

import java.util.List;

public class Sportiv {
    public String nume;
    public String prenume;
    public int anNastere;
    public String echipaActuala;
    public List<String> echipeCV;
    public int pret;

    public Sportiv(String nume, String prenume, int anNastere, String echipaActuala, List<String> echipeCV) {
        this.nume = nume;
        this.prenume = prenume;
        this.anNastere = anNastere;
        this.echipaActuala = echipaActuala;
        this.echipeCV = echipeCV;
    }

    public Sportiv(String nume, String prenume, int anNastere, String echipaActuala, List<String> echipeCV, int pret) {
        this.nume = nume;
        this.prenume = prenume;
        this.anNastere = anNastere;
        this.echipaActuala = echipaActuala;
        this.echipeCV = echipeCV;
        this.pret = pret;
    }

    public void prezentareSportiv() {
        System.out.println("Numele lui este " + nume);
        System.out.println("prenumele lui este " + prenume);
        System.out.println("Este nascut in anul  " + anNastere);
        System.out.println("Dotarile masinii sunt urmatoarele");
        for (int i = 0; i < echipeCV.size(); i++) {
            System.out.println(echipeCV.get(i));
        }
        System.out.println("Echipa la care joaca acum este  " + echipaActuala);

       // calculPret();


    }
}
