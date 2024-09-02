package obiectConstructor;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MasinaTest {

    @Test
    public void testMasinaMethod(){
//        Masina masina1=new Masina("dacia","Logan",2015,"roz",
//                Arrays.asList("-AC","-Airbag"),"benzina");
//        masina1.prezentareMasina();
//        masina1.calculImpozit();
//
//
//        System.out.println();
//        Masina masina=new Masina("dacia","Duster",2025,"mov",
//                Arrays.asList("-AC","-Airbag"),"motorina");
//        masina.prezentareMasina();
//        masina.calculImpozit();
//
        System.out.println();
        Masina masina2=new Masina(2300,"benzina",Arrays.asList("-AC","-Airbag"),"roz",2000,"Dacia","Logan");
        masina2.prezentareMasina();
        masina2.calculImpozit();

        masina2.calculReducere(10);
    }
}

//definim un sportiv 
