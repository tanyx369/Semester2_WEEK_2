

public class PetTester
{
    public static void main(String[]args)
    {
    	Dog dog = new Dog("Ah Meng" ,"Husky" , true);
		Dog dog2 = new Dog("Ah Tong" , "Gogi" , true);
		Dog dog3 = new Dog("Bobby" , "German_Sherphad" , false);
		
		Cat cat = new Cat("Happy" ,12 , "fish");
		Cat cat2 = new Cat("Poppy",34 , "milk");
		Cat cat3  = new Cat("Koko",33 , "Roti");
		
		Pet[] pets = {dog , dog2, dog3 , cat , cat2 , cat3};
		
		for(Pet pet : pets) {
			if (pet.getClass() == Dog.class) {
				pet.sound();
				System.out.println(pet);
			}
			else if(pet.getClass() == Cat.class) {
				pet.sound();
				System.out.println(pet);
			}
		}
    }
}
