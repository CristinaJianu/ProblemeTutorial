package oop_v2;

public class AngajatStudent extends Persoana {
    private String firma;
    private String pozitie;
    private int salariu;
    private String experienta;

    public String facultate;
    public int an;
    public boolean bursier;
    public boolean areRestante;

    public AngajatStudent(String nume, String prenume, int varsta, String sex, String adresa,
                          String firma, String pozitie, int salariu, String experienta,
                          String facultate, int an, boolean bursier, boolean areRestante) {
        super(nume, prenume, varsta, sex, adresa);
        this.firma = firma;
        this.pozitie = pozitie;
        this.salariu = salariu;
        this.experienta = experienta;
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
