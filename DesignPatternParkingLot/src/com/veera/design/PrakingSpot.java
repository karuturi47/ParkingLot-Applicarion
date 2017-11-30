/**
 * 
 */
package com.veera.design;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Veera
 *
 */
public class PrakingSpot {
	
	public Vehicle vehicle;
	public static Integer small=100;
	public static Integer medium=100;
	public static Integer large=100;
	public static Integer exLarge=100;
	
	public static Map avaliableSpot;
	static
	{
		avaliableSpot=new HashMap<String, Integer>();
		avaliableSpot.put("Small", small);
		avaliableSpot.put("Medium", medium);
		avaliableSpot.put("Large", large);
		avaliableSpot.put("ExLarge", exLarge);
		
	}
	
	
	
	public PrakingSpot(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}



	public boolean isParkingSpotAvalible(Vehicle vehicle)
	{
		if(avaliableSpot.get(String.valueOf(vehicle.getVehicleSize()))!=null && !String.valueOf(vehicle.getVehicleSize()).equals(new Integer(0)))
			return true;
		else
			return false;		
	}
	
	public void placingCar(Vehicle vehicle)
	{
		if (VehicleSize.exLarge.equals(vehicle.getVehicleSize())) {
			exLarge = exLarge - 1;
		} else if (VehicleSize.Large.equals(vehicle.getVehicleSize())) {
			large = large - 1;
		} else if (VehicleSize.Medium.equals(vehicle.getVehicleSize())) {
			medium = medium - 1;
		} else if (VehicleSize.Small.equals(vehicle.getVehicleSize())) {
			small = small - 1;
		}

	}
	
	
	public void removing(Vehicle vehicle)
	{
		if (VehicleSize.exLarge.equals(vehicle.getVehicleSize())) {
			exLarge = exLarge + 1;
		} else if (VehicleSize.Large.equals(vehicle.getVehicleSize())) {
			large = large + 1;
		} else if (VehicleSize.Medium.equals(vehicle.getVehicleSize())) {
			medium = medium +1;
		} else if (VehicleSize.Small.equals(vehicle.getVehicleSize())) {
			small = small + 1;
		}

	}
	
	
	
	

	
	
	
	
	
	
	

}
