package oop_v1;

public class AngajatSportivStudent extends Persoana implements AngajatInterface,SportivInterface,StudentInterface{

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

    public AngajatSportivStudent(String nume, String prenume, int varsta, String sex, String adresa,
                                 String firma, String pozitie, int salariu, String experienta,
                                 String facultate, int an, boolean bursier, boolean areRestante,
                                 String echipa, boolean sportEchipa, int pozitie1, String experienta1) {
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
        System.out.println("Angajatul trb sa ajunga la birou intre 8 si 17");
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul trb sa munceasca intre 8 si 17");
    }

    @Override
    public void nuAreAbsente() {
        System.out.println("Angajatul nu trb sa aiba absente");
    }

    @Override
    public void respectaConduita() {
        System.out.println("Angajatul trb sa respecte conduita");
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
