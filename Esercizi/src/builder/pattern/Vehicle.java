package builder.pattern;

public class Vehicle {
	
	private String vehicleName;
	private String vehicleType;
	private String engineType;
	private int seatsNumber;
	private int windowsNumber;
	private int doorsNumber;
	
	
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public int getSeatsNumber() {
		return seatsNumber;
	}

	public void setSeatsNumber(int seatsNumber) {
		this.seatsNumber = seatsNumber;
	}
	public int getWindowsNumber() {
		return windowsNumber;
	}
	public void setWindowsNumber(int windowsNumber) {
		this.windowsNumber = windowsNumber;
	}
	public int getDoorsNumber() {
		return doorsNumber;
	}
	public void setDoorsNumber(int doorsNumber) {
		this.doorsNumber = doorsNumber;
	}
	
	public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("--------------"+vehicleName+"--------------------- \n");
        stringBuilder.append(" Type: ");
        stringBuilder.append(vehicleType);
        stringBuilder.append("\n Engine: ");
        stringBuilder.append(engineType);
        stringBuilder.append("\n Seats: ");
        stringBuilder.append(seatsNumber);
        stringBuilder.append("\n Windows: ");
        stringBuilder.append(windowsNumber);
        stringBuilder.append("\n Doors: ");
        stringBuilder.append(doorsNumber);
         
        return stringBuilder.toString();
    }
	
}
