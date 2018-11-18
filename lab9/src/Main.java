import java.util.List;
import java.util.ArrayList;

public class Main {
public static void main(String [] args) {
	BasicCar car = new BasicCar();
	ElectricCar electriccar = new ElectricCar(car);
	HybridCar hybridcar = new HybridCar(car);
	GasCar gascar = new GasCar(car);
	FourWheelDrive fwdelectriccar = new FourWheelDrive(electriccar);
	AirBag abhybridcar = new AirBag(hybridcar);
	AirBag abfwdelectriccar = new AirBag(fwdelectriccar);
	
	List<Car> carList = new ArrayList<Car>();
	carList.add(car);
	carList.add(electriccar);
	carList.add(hybridcar);
	carList.add(gascar);
	carList.add(fwdelectriccar);
	carList.add(abhybridcar);
	carList.add(abfwdelectriccar);
	
	for(Car c:carList) {
		System.out.println(c.describe());
	}
}
}
