package oop_v1;

public class SportivStudent extends Persoana implements SportivInterface,StudentInterface{
    private String echipa;
    private boolean sportEchipa;
    private int pozitie;
    private String experienta;

    public String facultate;
    public int an;
    public boolean bursier;
    public boolean areRestante;

    public SportivStudent(String nume, String prenume, int varsta, String sex, String adresa,
                          String echipa, boolean sportEchipa, int pozitie, String experienta,
                          String facultate, int an, boolean bursier, boolean areRestante) {
        super(nume, prenume, varsta, sex, adresa);
        this.echipa = echipa;
        this.sportEchipa = sportEchipa;
        this.pozitie = pozitie;
        this.experienta = experienta;
        this.facultate = facultate;
        this.an = an;
        this.bursier = bursier;
        this.areRestante = areRestante;
    }

    @Override
    public void mergeLaAntrenament() {
        System.out.println("sa mearga la antrenament");
    }

    @Override
    public void saMananceProteine() {
        System.out.println("sa manance proteine");
    }

    @Override
    public void saMeargaLaConcursuri() {
        System.out.println("sa mearga la concursuri");
    }

    @Override
    public void mergeLaCursuri() {
        System.out.println("Studentul trb sa mearga la cursuri");
    }

    @Override
    public void trebuieSaInvete() {
        System.out.println("Studentul trb sa invete");
    }

    @Override
    public void saNuAibaRestante() {
        System.out.println("Studentul nu trb sa aiba restante");
    }

    @Override
    public void saStieSaCopieze() {
        System.out.println("Studentul trb sa stie sa copieze");
    }
}
