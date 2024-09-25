package oop_v1;

public class AngajatStudent extends Persoana implements AngajatInterface, StudentInterface {

    private String firma;
    private String pozitie;
    private int salariu;
    private String experienta;

    public String facultate;
    public int an;
    public boolean bursier;
    public boolean areRestante;

    public AngajatStudent(String nume, String prenume, int varsta, String sex, String adresa, String firma,
                          String pozitie, int salariu, String experienta, String facultate, int an,
                          boolean bursier, boolean areRestante) {
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
