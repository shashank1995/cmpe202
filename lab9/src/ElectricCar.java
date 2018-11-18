public class ElectricCar extends CarDecorator{
ElectricCar(Car car){
	super(car);
}
@Override
public String describe() {
	return ("Electric " + super.describe());
}
}
