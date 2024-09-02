package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    //acesta este un comm
    /*
    clasa=sablon care defineste comportamentul unei entitati din viata reala
    intr un fisier java recunoastem o clasa  dupa cuvantul cheie "class"
    intr un fisier java putem avea mai multe clase diferentiate prin numele acestora (nu se face asa ceva niciodata)
    o clasa contine variabile si metode
    variabile= proprietatea unei clase
    varianila este de 2 feluri (globala si locala)
    globala= variabila pe care o definesti la inceputul clasei si are vizibilitate asupra intregului fisier
    locala= variabila pe care o definesti intr o metoda si are vizibilitate doar in metoda
    var globala trb sa contina un access control (public) , tip de data si un nume
    o var nu trb sa contina mereu o valoare
    double vs float
    double calcule complexe
    float calcule simple
    metoda = actiunea unei clase si o clasa are mai multe metode care se diferentiaza prin nume
     */
    public String nume;
    public String prenume;
    public int varsta;
    public double inaltime;
    public float greutate;
    public String adresa;
    public char sex;
    public boolean areRestante;

    //metodele pot fi void si return
    //void are rol sa execute actiunea si sa o afiseze
    //o metoda cu void trb sa contina : access control(public) void numeMetoda () { }
    //ctrl a=>ctrl alt l

    @Test
    public void prezentareStudent() {
        nume = "Jianu";
        prenume = "Cristina";
        varsta = 20;
        inaltime = 1.55;
        greutate = 47.1f;
        adresa = "Bucuresti";
        sex = 'f';
        areRestante = true;

        //concatenare = lipirea unuia sau a mai multor string uri (+)
        //print=afiseaza val si ramane pe rand curent
        //println=afiseaza val si sare la randul urmator
      //  System.out.print(nume+" "+prenume+" "+varsta+" "+" "+inaltime+" "+greutate+" "+adresa+" "+sex+" "+areRestante+" ");

        System.out.println("numele studentului este "+nume);
        System.out.println("prenumele studentului este "+prenume);
        System.out.println("varsta studentului este "+varsta);
        System.out.println("inaltimea studentului este "+inaltime);
        System.out.println("greutatea studentului este "+greutate);
        System.out.println("sexul studentului este "+sex);
        System.out.println("adresa studentului este "+adresa);
        System.out.println("Studentul are restante? "+areRestante);
    }


}
