package oop_v1;

import org.testng.annotations.Test;

public class MostenireTest {

    @Test
    public void testMethod() {
        Angajat angajat = new Angajat("Jianu", "Cristina", 20, "feminin",
                "Bucuresti","Deloitte", "Intern", 5000, "fara experienta");
        angajat.infoAngajat();

        System.out.println();

        System.out.println(angajat.getVarsta());
        angajat.setVarsta(21);
        System.out.println(angajat.getVarsta());

        angajat.mananca();
        angajat.marire();
        angajat.marire(20);
        angajat.marire("senior");
        angajat.marire(10,"intern");
        angajat.munceste();
        angajat.respectaConduita();
        angajat.ajungeLaTimpLaBirou();
        angajat.nuAreAbsente();

        Sportiv sportiv = new Sportiv("Jianu", "Cristina", 20, "feminin",
                "Bucuresti","FCSB", true, 5, "incepator");

        sportiv.infoSportiv();

        sportiv.mergeLaAntrenament();
        sportiv.saMananceProteine();
        sportiv.saMeargaLaConcursuri();

        System.out.println();
        Student student=new Student("Jianu", "Cristina", 20, "feminin",
                "Bucuresti","CIBE",3,false,false);

        student.infoStudent();

        student.saNuAibaRestante();
        student.mergeLaCursuri();
        student.saStieSaCopieze();
        student.trebuieSaInvete();
    }
}
