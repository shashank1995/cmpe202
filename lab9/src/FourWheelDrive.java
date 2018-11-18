public class FourWheelDrive extends CarDecorator{
FourWheelDrive(Car car){
	super(car);
}
@Override
public String describe() {
	return (super.describe() + " with Four Wheel Drive");
}
}
