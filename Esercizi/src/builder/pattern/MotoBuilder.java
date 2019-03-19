package builder.pattern;

public class MotoBuilder implements VehicleBuilder {

	private final Vehicle moto = new Vehicle();

	public void buildEngine() {
		// TODO Auto-generated method stub
		moto.setEngineType("125cc");
	}

	public void buildSeats() {
		// TODO Auto-generated method stub
		moto.setSeatsNumber(2);
	}

	public void buildDoors() {
		// TODO Auto-generated method stub
		moto.setDoorsNumber(0);
	}

	public void buildWindows() {
		// TODO Auto-generated method stub
		moto.setWindowsNumber(0);
	}

	public void declareVehicleName() {
		// TODO Auto-generated method stub
		moto.setVehicleName("R125");
	}

	public void declareVehicleType() {
		// TODO Auto-generated method stub
		moto.setVehicleType("Moto Sportiva");
	}

	public Vehicle getVehicle() {
		// TODO Auto-generated method stub
		return moto;
	}

}