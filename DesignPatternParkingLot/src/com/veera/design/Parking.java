/**
 * 
 */
package com.veera.design;

/**
 * @author Veera
 *
 */
public class Parking {
	
	
	public static void main(String args[])
	{
		Vehicle car=new Car();
		placeVehicle(car);
	}
	
	
	public static void placeVehicle(Vehicle vehicle) {
		PrakingSpot ps=new PrakingSpot(vehicle) ;
		
		if(ps.isParkingSpotAvalible(vehicle))
		{
			ps.placingCar(vehicle);
			System.out.print("car was sucessfully parked");
		}
		else
		{
			System.out.print("No Parking avaliable for this vehicle");
		}
		
	}
	
	
	public void removingVehicle(Vehicle vehicle)
	{
		PrakingSpot ps=new PrakingSpot(vehicle) ;
		
		ps.removing(vehicle);
	}

}
