package oop_mostenire;

public class Student extends Persoana{

    public String facultate;
    public int an;
    public boolean bursier;
    public boolean areRestante;

    public Student(String nume, String prenume, int varsta, String sex, String adresa,
                   String facultate, int an, boolean bursier, boolean areRestante) {
        super(nume, prenume, varsta, sex, adresa);
        this.facultate = facultate;
        this.an = an;
        this.bursier = bursier;
        this.areRestante = areRestante;
    }

    public void infoStudent()
    {
        infoPersoana();
        System.out.println("Facultatea este "+facultate);
        System.out.println("este in anul "+an);
        System.out.println("Are restante?"+areRestante);
        System.out.println("este bursier?");
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public boolean isBursier() {
        return bursier;
    }

    public void setBursier(boolean bursier) {
        this.bursier = bursier;
    }

    public boolean isAreRestante() {
        return areRestante;
    }

    public void setAreRestante(boolean areRestante) {
        this.areRestante = areRestante;
    }
}

