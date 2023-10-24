package com.pandiaaman.springAnnotationBasics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehicleConfiguration {

	@Bean("vehicleOne")
	public Vehicle getVehicle() {
		return new Vehicle(1,"Toyota");
	}
}
