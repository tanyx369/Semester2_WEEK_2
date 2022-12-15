public class Vehicle
{
	String manufacturer_name;
	String engine_number;
	Person owner;
	
	public Vehicle(String manu_name , String engine_num , String name) {
		this.manufacturer_name = manu_name;
		this.engine_number = engine_num;
		this.owner = new Person(name);
	}
	
	public String show_owner() {
		return owner.name;
		// owner.getName()
	}
	
	public String getManu() {
		return this.manufacturer_name;
	}
	
	public String getEngine() {
		return this.engine_number;
	}

	
    
}
