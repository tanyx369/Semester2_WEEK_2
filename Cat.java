public class Cat extends Pet
{
	int number_mouse_caught ;
	String favourite_food;
	
	public Cat(String name ,int num_mouse_caught , String food) {
		super(name);
		this.number_mouse_caught = num_mouse_caught;
		this.favourite_food = food;
	}
	
	@Override
	public void sound() {
		super.sound();
		System.out.println("Cat *meow meow* !");
	}
	
	public void setNum(int number) {
		this.number_mouse_caught = number;
	}
	
	public int getNum() {
		return this.number_mouse_caught;
	}
	
	public void setFood(String food) {
		this.favourite_food = food;
	}
	
	public String getFood() {
		return this.favourite_food;
	}
	
	public String toString() {
		return "Favourite food: " + getFood() + "\n" + "Number of mouse caught: " + getNum();
	}
    
}
