public class Car {

	private int yearModel;
	private String make;
	private int speed;

	public Car(int yrModel, String carMake) {
		yearModel = yrModel;
		make = carMake;
		speed = 0;
	}

	public void setYearModel(int yrModel) {
		yearModel = yrModel;
	}

	public void setMake(String carMake) {
		make = carMake;
	}

	public void setSpeed(int carSpeed) {
		speed = carSpeed;
	}

	public int getYearModel() {
		return yearModel;
	}

	public String getMake() {
		return make;
	}

	public int getSpeed() {
		return speed;
	}

	public void AccelerateSpeed(int speed) {
		speed = speed + 5;
	}

	public void BrakeSpeed(int speed) {
		speed = speed - 5;
	}
}