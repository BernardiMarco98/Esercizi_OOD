package builder.pattern;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleBuilder carBuilder = new CarBuilder();
		VehicleBuilder motoBuilder = new MotoBuilder();
		VehicleBuilder bikeBuilder = new BikeBuilder();

		Director carDirector = new Director(carBuilder);
		Director motoDirector = new Director(motoBuilder);
		Director bikeDirector = new Director(bikeBuilder);

		carDirector.build();
		motoDirector.build();
		bikeDirector.build();

		Vehicle car = carBuilder.getVehicle();
		Vehicle moto = motoBuilder.getVehicle();
		Vehicle bike = bikeBuilder.getVehicle();

		System.out.println(car);
		System.out.println(moto);
		System.out.println(bike);

	}
}
