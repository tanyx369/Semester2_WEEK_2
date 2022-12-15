import java.awt.Rectangle;

public class Square extends Rectangle
{
	
	int size;
	
	// Constructor
	public Square(int x, int y , int length , int width ) {
		super(x , y , length , width);
		this.size = length *width;
		
	}
	
	public void setLocation(int x , int y) {
		super.setLocation(x, y);
	}
	
	public void setSize(int width , int height) {
		size = width * height;
	}
	
	public int getArea() {
		return size;
	}
	
	
	
	public static void main(String[] args) {
		Square s1 = new Square(1, 4 , 2 , 4);
		System.out.println(s1);
	}
	
	
    
}
