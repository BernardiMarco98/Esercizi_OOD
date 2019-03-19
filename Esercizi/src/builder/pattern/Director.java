package builder.pattern;

public class Director {

	VehicleBuilder vehicleBuilder;

	public Director(VehicleBuilder vehicleBuilder) {

		this.vehicleBuilder = vehicleBuilder;
	}

	public Vehicle build() {

		this.vehicleBuilder.buildEngine();
		this.vehicleBuilder.buildDoors();
		this.vehicleBuilder.buildWindows();
		this.vehicleBuilder.buildSeats();
		this.vehicleBuilder.declareVehicleName();
		this.vehicleBuilder.declareVehicleType();

		return this.vehicleBuilder.getVehicle();
	}
}
