package com.AnonymousInnerClasses.Example;

public interface Vehicle {

	public int getNoofWheels();

	 class DefaultVehicle implements Vehicle {

		@Override
		public int getNoofWheels() {
			// Default implementation of Vehicle interface
			return 2;
		}

	}
	 
	 
}

class Bus  extends Vehicle.DefaultVehicle implements Vehicle {

	@Override
	public int getNoofWheels() {
		return 6;
	}

}

class TestVehicleNow {

	public static void main(String[] args) {

		Bus bus = new Bus();
		int wheels = bus.getNoofWheels();

		Vehicle.DefaultVehicle d = new Vehicle.DefaultVehicle();
		int defaultWheels = d.getNoofWheels();

		System.out.println(wheels + " .... " + defaultWheels);

	}
}