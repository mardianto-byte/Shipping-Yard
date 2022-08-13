package KapalFactory;

import Kapal.Kapal;

import java.util.ArrayList;

public class Galangan {
    KapalFactory factory;
    ArrayList<Kapal> listKapal;

    public Galangan(KapalFactory factory){
        this.factory = factory;
        listKapal = new ArrayList<>();
    }

    public Kapal orderKapal(String type){
        Kapal kapal;

        kapal = factory.createKapal(type);

        if (kapal != null){
            kapal.build();

            listKapal.add(kapal);

            // System.out.println("---list kapal---");
            // for(Kapal c: listKapal){
            //     System.out.println(c.getNama());
            // }

        } else {
            System.err.println("Tipe " + type + " tidak tersedia");
        }
        return kapal;
    }

    public String showKapal(){
        String list = "";
        for(Kapal kapal: listKapal){
            list += kapal.getNama() + " , ";
        }
        return list;
    }
}
