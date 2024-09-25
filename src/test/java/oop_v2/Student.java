package oop_v2;

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

    @Override
    public void ajungeLaTimpLaBirou() {

    }

    @Override
    public void munceste() {

    }

    @Override
    public void nuAreAbsente() {

    }

    @Override
    public void respectaConduita() {

    }

    @Override
    public void mergeLaAntrenament() {

    }

    @Override
    public void saMananceProteine() {

    }

    @Override
    public void saMeargaLaConcursuri() {

    }

    @Override
    public void mergeLaCursuri() {

    }

    @Override
    public void trebuieSaInvete() {

    }

    @Override
    public void saNuAibaRestante() {

    }

    @Override
    public void saStieSaCopieze() {

    }
}
