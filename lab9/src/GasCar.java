public class GasCar extends CarDecorator{
GasCar(Car car){
	super(car);
}
@Override
public String describe() {
	return ("Gas " + super.describe());
}
}
