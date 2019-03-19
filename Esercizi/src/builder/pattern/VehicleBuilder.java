package builder.pattern;

public interface VehicleBuilder {

	public void buildEngine();

	public void buildSeats();

	public void buildDoors();

	public void buildWindows();

	public void declareVehicleName();

	public void declareVehicleType();

	public Vehicle getVehicle();
}
