

public class VehicleTester
{
	
public static void main(String[] args) {
		
		Truck t1 = new Truck("Honda" , "Ea3Z12" , "Jack" , 1000 , 123.8);
		Truck t2 = new Truck("Honda" , "FR32aN9" , "John" , 1300 , 138.6);
		
		Vehicle[] list = {t1, t2};
		
		for(Vehicle v1 : list) {
			System.out.println("Owner's name: " + v1.show_owner() );
			System.out.println("Manufacturer name: " + v1.getManu());
			System.out.println("Engine number: " + v1.getEngine());
		}
		
		
	}
    
}
