package tema1;

import obiectConstructor.Masina;
import org.testng.annotations.Test;

import java.util.Arrays;

public class SportivTest {
    @Test
    public void testSportivMethod(){
        Sportiv sportiv1=new Sportiv("Iancu","Andrei",2000,"FCSB",Arrays.asList("-Dinamo","-CFR"),100000);
       sportiv1.prezentareSportiv();

        System.out.println();
        Sportiv sportiv=new Sportiv("Iosif","Alin",2002,"Dinamo",
                Arrays.asList("-CFR","-Rapid"),10202);
        sportiv.prezentareSportiv();

    }
}
