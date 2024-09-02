package obiectConstructor.hotel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hotel {
    public String nume;
    public String adresa;
    public String tara;
    public String oras;
    public String stele;
    public int nrCamere;
    public boolean micDejun;
    public int nrEtaje;
    public List<String> facilitati;
    int pretPornire;

    public Hotel() {
        nume = "Imperial House";
        adresa = "Str. Mamaia";
        tara = "Romania";
        oras = "Constanta";
        stele = "***";
        nrCamere = 40;
        micDejun = true;
        nrEtaje = 6;
        facilitati = Arrays.asList("wi-fi", "piscina", "TV");
        pretPornire = 1000;
    }

    public void prezentareHotel() {
        System.out.println("numele hotelului este  " + nume);
        System.out.println("adresa hotelului este  " + adresa);
        System.out.println("tara hotelului este  " + tara);
        System.out.println("orasul hotelului este  " + oras);
        System.out.println("stelele alocate hotelului sunt  " + stele);
        System.out.println("hotelul are camere in nr de  " + nrCamere);
        System.out.println("hotelul are mic dejun?  " + micDejun);

    }

    public void pretOferta(Map<String, String> oferta) {
        System.out.println("pretul initial este "+pretPornire);
        for (String optiune : oferta.keySet()) {
            if (optiune.equals("Durata oferta")) {
                //clientul are dorinta de a avea oferta valabilitate mai mare
                //se calculeaza pretul pe baza mai multor intervale

                String[] parts = oferta.get(optiune).split(" ");
                int number = Integer.parseInt(parts[0]);

                if (number < 5) {
                    pretPornire = pretPornire + 100;

                }
                if (number > 5 && number < 10) {
                    pretPornire = pretPornire + 200;

                } else {
                    pretPornire = pretPornire + 300;
                }
            }
            if (optiune.equals("Perioada sedere")) {
                //clientul are dorinta de a avea oferta valabilitate mai mare
                //se calculeaza pretul pe baza mai multor intervale

                String[] parts = oferta.get(optiune).split(" ");
                int number = Integer.parseInt(parts[0]);

                if (number < 5) {
                    pretPornire = pretPornire + 1000;

                }
                if (number > 5 && number < 10) {
                    pretPornire = pretPornire + 2000;

                } else {
                    pretPornire = pretPornire + 3000;
                }
            }

            if (optiune.equals("nr persoane")) {
                //clientul are dorinta de a avea oferta valabilitate mai mare
                //se calculeaza pretul pe baza mai multor intervale

                String[] parts = oferta.get(optiune).split(" ");
                int number = Integer.parseInt(parts[0]);

                if (number < 3) {
                    pretPornire = pretPornire + 1000;

                }
                if (number ==3) {
                    pretPornire = pretPornire + 2000;

                } else {
                    pretPornire = pretPornire + 3000;
                }
            }

            if (optiune.equals("offseason")) {
                //clientul are dorinta de a avea oferta valabilitate mai mare
                //se calculeaza pretul pe baza mai multor intervale

                if (oferta.get(optiune).equals("da")) {
                    pretPornire = pretPornire + 1080;

                }
                else {
                    pretPornire = pretPornire + 300;
                }
            }
            System.out.println("pretul final este "+pretPornire);



        }
    }

}



