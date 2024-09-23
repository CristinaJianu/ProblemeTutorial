package oop_mostenire;

public class Persoana {

    /*
    4 principiiȘ mostenire, abstractizare, incapsulare si polimorfism
    Mostenire=conceptul prin care o clasa copil mosteneste o clasa parinte
    In momentul cand copilul mosteneste parintele trebuie sa apeleze constructorul din parinte
    Acest lucru se realizeaza cu super
    Mostenirea se face la nivel de clasa cu cuv "extends"
    in Java o clasa poate mosteni doar o singura clasa
    incapsularea = conceptul prin care excludem anumite prop/metode
    conceptul se poate aplica la orice nivel de clase
     */

    private String nume;
    private String prenume;
    private int varsta;
    private String sex;
    private String adresa;

    public Persoana(String nume, String prenume, int varsta, String sex, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.adresa = adresa;
    }

    public void infoPersoana(){
        System.out.println("Numele persoanei este "+nume);
        System.out.println("Prenumele persoanei este "+prenume);
        System.out.println("Varsta persoanei este de "+varsta+" ani");
        System.out.println("Sexul persoanei este "+sex);
        System.out.println("Adresa unde locuieste persoana este "+adresa);
    }

    //get da informatia, set iti seteaza informatia


    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getSex() {
        return sex;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
