package oop_mostenire;

public class Angajat extends Persoana {

    private String firma;
    private String pozitie;
    private int salariu;
    private String experienta;

    public Angajat(String nume, String prenume, int varsta, String sex, String adresa,
                   String firma, String pozitie, int salariu, String experienta) {
        super(nume, prenume, varsta, sex, adresa);
        this.firma = firma;
        this.pozitie = pozitie;
        this.salariu = salariu;
        this.experienta = experienta;
    }

    public void infoAngajat() {
        infoPersoana();
        System.out.println("Firma la care lucreaza angajatul este " + firma);
        System.out.println("Pozitia la care se afla acum angajatul este " + pozitie);
        System.out.println("Salariul pe care il primeste angajatul este de " + salariu);
        System.out.println("Experienta pe care o are angajatul este " + experienta);
    }

    public void mananca() {
        super.mananca();
        System.out.println("Angajatul mananca cand are pauza ");
    }

    //polimorfism static

    public void marire() {
        System.out.println("Angajatul  primeste marirea anuala standard.");
    }

    public void marire(int procent) {
        System.out.println("Angajatul  primeste marirea anuala de " + procent + " %");
    }

    public void marire(String grad) {
        System.out.println("Angajatul  primeste gradul  " + grad);
    }

    public void marire(int procent, String grad) {
        System.out.println("Angajatul  primeste gradul  " + grad+ "si marirea anuala de"+procent+" %.");
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getFirma() {
        return firma;
    }

    public String getPozitie() {
        return pozitie;
    }

    public int getSalariu() {
        return salariu;
    }

    public String getExperienta() {
        return experienta;
    }

    public void setPozitie(String pozitie) {
        this.pozitie = pozitie;
    }

    public void setExperienta(String experienta) {
        this.experienta = experienta;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }
}
