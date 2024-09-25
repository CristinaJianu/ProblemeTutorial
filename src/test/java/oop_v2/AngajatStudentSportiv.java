package oop_v2;

public class AngajatStudentSportiv extends Persoana {
    private String firma;
    private String pozitie;
    private int salariu;
    private String experienta;

    public String facultate;
    public int an;
    public boolean bursier;
    public boolean areRestante;

    private String echipa;
    private boolean sportEchipa;
    private int pozitie1;
    private String experienta1;

    public AngajatStudentSportiv(String nume, String prenume, int varsta, String sex,
                                 String adresa, String firma, String pozitie, int salariu,
                                 String experienta, String facultate, int an, boolean bursier,
                                 boolean areRestante, String echipa, boolean sportEchipa,
                                 int pozitie1, String experienta1) {
        super(nume, prenume, varsta, sex, adresa);
        this.firma = firma;
        this.pozitie = pozitie;
        this.salariu = salariu;
        this.experienta = experienta;
        this.facultate = facultate;
        this.an = an;
        this.bursier = bursier;
        this.areRestante = areRestante;
        this.echipa = echipa;
        this.sportEchipa = sportEchipa;
        this.pozitie1 = pozitie1;
        this.experienta1 = experienta1;
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
