package builder.pattern;

public class CarBuilder implements VehicleBuilder {

	private final Vehicle car = new Vehicle();

	public void buildEngine() {
		// TODO Auto-generated method stub
		car.setEngineType("4V Diesel");
	}

	public void buildSeats() {
		// TODO Auto-generated method stub
		car.setSeatsNumber(5);
	}

	public void buildDoors() {
		// TODO Auto-generated method stub
		car.setDoorsNumber(5);
	}

	public void buildWindows() {
		// TODO Auto-generated method stub
		car.setWindowsNumber(6);
	}

	public void declareVehicleName() {
		// TODO Auto-generated method stub
		car.setVehicleName("PANDA");
	}

	public void declareVehicleType() {
		// TODO Auto-generated method stub
		car.setVehicleType("Macchina Utilitaria");
	}

	public Vehicle getVehicle() {
		// TODO Auto-generated method stub
		return car;
	}

}
