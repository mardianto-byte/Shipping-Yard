package KapalFactory;

import Kapal.Kapal;
import Kapal.KapalPesiar;
import Kapal.PerahuLayar;
import Kapal.PerahuMotor;

public class KapalFactory {

    public Kapal createKapal(String type){
        Kapal kapal = null;

        if  (type.equals("Layar")){
            kapal = new PerahuLayar();
        } else if (type.equals("Pesiar")){
            kapal = new KapalPesiar();
        } else if (type.equals("Motor")){
            kapal = new PerahuMotor();
        }
        return kapal;
    }

}
