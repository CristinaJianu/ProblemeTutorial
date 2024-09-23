package oop_mostenire;

public class Sportiv extends Persoana{

    private String echipa;
    private boolean sportEchipa;
    private int pozitie;
    private String experienta;

    public Sportiv(String nume, String prenume, int varsta, String sex, String adresa,
                   String echipa, boolean sportEchipa, int pozitie, String experienta) {
        super(nume, prenume, varsta, sex, adresa);
        this.echipa = echipa;
        this.sportEchipa = sportEchipa;
        this.pozitie = pozitie;
        this.experienta = experienta;
    }

    public void mananca(){
        System.out.println("Sportivul mananca dupa antrenament ");
    }

    public void infoSportiv()
    {
        infoPersoana();
        System.out.println("Echipa la care joaca sportivul este "+echipa);
        System.out.println("Joaca intr- echipa sau singur? "+sportEchipa);
        System.out.println("Care e pozitia jucatorului "+pozitie);
        System.out.println("Experienta pe care o are este de "+experienta+" ani");
    }

    public String getEchipa() {
        return echipa;
    }

    public void setEchipa(String echipa) {
        this.echipa = echipa;
    }

    public boolean isSportEchipa() {
        return sportEchipa;
    }

    public void setSportEchipa(boolean sportEchipa) {
        this.sportEchipa = sportEchipa;
    }

    public int getPozitie() {
        return pozitie;
    }

    public void setPozitie(int pozitie) {
        this.pozitie = pozitie;
    }

    public String getExperienta() {
        return experienta;
    }

    public void setExperienta(String experienta) {
        this.experienta = experienta;
    }
}
