package oop_v1;

public class AngajatSportiv extends Persoana implements AngajatInterface,SportivInterface{

    private String echipa;
    private boolean sportEchipa;
    private int pozitie;
    private String experienta;

    private String firma;
    private String pozitie1;
    private int salariu;
    private String experienta1;

    public AngajatSportiv(String nume, String prenume, int varsta, String sex, String adresa, String echipa,
                          boolean sportEchipa, int pozitie, String experienta, String firma, String pozitie1,
                          int salariu, String experienta1) {
        super(nume, prenume, varsta, sex, adresa);
        this.echipa = echipa;
        this.sportEchipa = sportEchipa;
        this.pozitie = pozitie;
        this.experienta = experienta;
        this.firma = firma;
        this.pozitie1 = pozitie1;
        this.salariu = salariu;
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
}
