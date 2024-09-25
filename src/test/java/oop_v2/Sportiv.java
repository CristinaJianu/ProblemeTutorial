package oop_v2;

public class Sportiv extends Persoana{

    private String echipa;
    private boolean sportEchipa;
    private int pozitie;
    private String experienta;

    public Sportiv(String nume, String prenume, int varsta, String sex, String adresa,
                   String echipa, boolean sportEchipa, int pozitie, String experienta) {
        super(nume, prenume, varsta, sex, adresa);
        this.echipa = echipa;
        this.sportEchipa = sportEchipa;
        this.pozitie = pozitie;
        this.experienta = experienta;
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
