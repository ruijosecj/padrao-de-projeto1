import factory.CarroFactory;
import model.Carro;

public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\n### Polo");
		Carro polo = CarroFactory.orderCarro("Polo");
		System.out.println(polo);
        
        System.out.println("\n\n### OnixLT");
		Carro onixLT = CarroFactory.orderCarro("OnixLT");
		System.out.println(onixLT);
    }
}
