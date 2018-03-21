
public class Bicycle {

	String model;
	int wheels;

	public Bicycle(String model, int wheels) {
		super();
		this.model = model;
		this.wheels = wheels;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	@Override
	public String toString() {
		return "This " + model + " bike has " + wheels + " wheels.";
	}
	
	
}
