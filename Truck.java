public class Truck extends Vehicle
{
	double load_capacity; 
	double towing_capacity;
	
	public Truck(String manu_name , String engine_num , String name , double load , double towing) {
		super(manu_name , engine_num, name);
		this.load_capacity = load;
		this.towing_capacity = towing;
	}
	
	public void setLoad(double load) {
		this.load_capacity = load;
	}
	
	public double getLoad() {
		return this.load_capacity;
	}
	
	public void setTowing(double towing) {
		this.towing_capacity = towing;
	}
	
	public double getTowing() {
		return this.towing_capacity;
	}
    
}
