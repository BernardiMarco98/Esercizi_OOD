package builder.pattern;

public class BikeBuilder implements VehicleBuilder {

	private final Vehicle bike = new Vehicle();

	public void buildEngine() {
		// TODO Auto-generated method stub
		bike.setEngineType("No engine");
	}

	public void buildSeats() {
		// TODO Auto-generated method stub
		bike.setSeatsNumber(1);
	}

	public void buildDoors() {
		// TODO Auto-generated method stub
		bike.setDoorsNumber(0);
	}

	public void buildWindows() {
		// TODO Auto-generated method stub
		bike.setWindowsNumber(0);
	}

	public void declareVehicleName() {
		// TODO Auto-generated method stub
		bike.setVehicleName("Graziella");
	}

	public void declareVehicleType() {
		// TODO Auto-generated method stub
		bike.setVehicleType("Bicicletta Casual");
	}

	public Vehicle getVehicle() {
		// TODO Auto-generated method stub
		return bike;
	}

}
