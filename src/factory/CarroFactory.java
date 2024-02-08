package factory;

import model.Carro;
import model.OnixLT;
import model.OnixLTZ;
import model.Polo;
import model.Virtus;

public class CarroFactory {
    public static Carro orderCarro(String modelo) {
		Carro device = null;

		if (modelo.equals("OnixLT")) {
				device = new OnixLT();
		} else if (modelo.equals("OnixLTZ")) {
				device = new OnixLTZ();
		} else if (modelo.equals("Polo")) {
            device = new Polo();
		} else if (modelo.equals("Virtus")) {
            device = new Virtus();
        }
		device.getHardware();
		

		return device;
	}
}
