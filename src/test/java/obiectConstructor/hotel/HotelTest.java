package obiectConstructor.hotel;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class HotelTest {
    @Test
    public void testMethod()
    {
        Map<String,String> oferta= new HashMap<>();
        oferta.put("Durata oferta","15 zile");
        oferta.put("Perioada sedere","7 nopti");
        oferta.put("nr persoane","4");
        oferta.put("offseason","da");

        Hotel imperial =new Hotel();
        imperial.prezentareHotel();
        imperial.pretOferta(oferta);
    }
}
