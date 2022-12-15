public class Dog extends Pet
{

	String breed;
	boolean MKA_registered;

	public Dog(String name ,String breed , boolean MKA) {
		super(name);
		this.breed = breed;
		this.MKA_registered = MKA;
	}
	
	@Override
	public void sound() {
		super.sound();
		System.out.println("Dog *bark bark* !");
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setMKA(boolean mka) {
		this.MKA_registered = mka;
	}
	
	public String getMKA() {
		
		if(this.MKA_registered == true) {
			return "MKA is registered";
		}
		else {
			return "MKA is not registered";
		}
	}
	
	public String toString() {
		return "Breed: " + getBreed() + "\n" + getMKA();
	}
	
}
