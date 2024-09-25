package oop_v1;

public class Persoana {

    /*
    4 principiiȘ mostenire, abstractizare, incapsulare si polimorfism
    Mostenire=conceptul prin care o clasa copil mosteneste o clasa parinte
    In momentul cand copilul mosteneste parintele trebuie sa apeleze constructorul din parinte
    Acest lucru se realizeaza cu super
    Mostenirea se face la nivel de clasa cu cuv "extends"
    in Java o clasa poate mosteni doar o singura clasa
    Incapsularea = conceptul prin care excludem anumite prop/metode
    conceptul se poate aplica la orice nivel de clase
    !!!Polimorfism=conceptul prin care o metoda poate avea implementari diferite
    Este de 2 feluri : static (overload) si dinamic (override)
    Dinamic= intr o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite
    Polimorfismul Dinamic se regaseste doar cand este aplicat conceptul de mostenire
    Static=actiunea prin care putem avea metode cu acelasi nume insa diferentiara fiind facuta prin
            numar/tip parametric


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

    //polimorfism dinamic

    public void mananca() {
        System.out.println("Persoana mananca cand ii este foame ");
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
