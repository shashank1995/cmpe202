import java.util.List;
import java.util.ArrayList;

public class MainwithLambda {
public static void main(String [] args) {
	BasicCar car = new BasicCar();
	Car electriccar = ()->"Electric " + car.describe();
	Car hybridcar = ()->"Hybrid " + car.describe();
	Car gascar = ()->"Gas " + car.describe();
	Car fwdelectriccar = ()->electriccar.describe() + " with Four Wheel Drive";
	Car abhybridcar = ()->hybridcar.describe() + " with Air Bag";
	Car abfwdelectriccar = ()->fwdelectriccar.describe() + " with Air Bag";
	
	List<Car> carList = new ArrayList<Car>();
	carList.add(car);
	carList.add(electriccar);
	carList.add(hybridcar);
	carList.add(gascar);
	carList.add(fwdelectriccar);
	carList.add(abhybridcar);
	carList.add(abfwdelectriccar);
	
	carList.forEach(c->System.out.println(c.describe()));
 }
}
