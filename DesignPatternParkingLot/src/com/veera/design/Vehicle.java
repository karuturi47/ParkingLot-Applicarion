/**
 * 
 */
package com.veera.design;

/**
 * @author Veera
 *
 */
public class Vehicle {
	
	public String licensePlate;
	public String color;
	public VehicleSize vehicleSize;
	
	/**
	 * @param licensePlate the licensePlate to set
	 */
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the vehicleSize
	 */
	public VehicleSize getVehicleSize() {
		return vehicleSize;
	}
	/**
	 * @param vehicleSize the vehicleSize to set
	 */
	public void setVehicleSize(VehicleSize vehicleSize) {
		this.vehicleSize = vehicleSize;
	}
	
	
	

}
