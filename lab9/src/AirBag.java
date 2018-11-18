public class AirBag extends CarDecorator{
AirBag(Car car){
	super(car);
}
@Override
public String describe() {
	return (super.describe() + " with Air Bag");
}
}
