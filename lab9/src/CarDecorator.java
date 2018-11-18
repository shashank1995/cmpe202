public abstract class CarDecorator implements Car {
protected Car car;
public CarDecorator(Car car) {
	this.car = car;
}
@Override
public String describe() {
	return car.describe();
}
}
