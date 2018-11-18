public class HybridCar extends CarDecorator {
HybridCar(Car car){
	super(car);
}
@Override
public String describe() {
	return ("Hybrid " + super.describe());
}
}
