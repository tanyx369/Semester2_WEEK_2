
public class BeeTester {

	public static void main(String[] args) {
		Apis_Mellifera bee_1 = new Apis_Mellifera("Johor" , "Red" , 123 , 33);
		Apis_Cerana bee_2 = new Apis_Cerana("Klang" , "Blue" , 122 , 35);
		Apis_Cerana_Indica bee_3 = new Apis_Cerana_Indica("Penang" , "Yellow" , 112 ,43);
		
		HoneyBees[] bees = {bee_1 , bee_2 , bee_3};
		int x = 1;
		
		for(HoneyBees b1 : bees) {
			System.out.println("Bee " + x + " location : " + b1.getLocation());
			System.out.println("Bee " + x + " colour: " + b1.getColour());
			System.out.println("Bee " + x + " size: " + b1.getSize());
			x ++;
		}

	}

}
