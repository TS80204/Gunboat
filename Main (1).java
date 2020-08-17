import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner reader= new Scanner(System.in);
		System.out.println("Enter distance to target.\n");
		double distance = reader.nextDouble();
		System.out.println("Enter the height of the battery relative to the height of the water line.\n");
		double height = reader.nextDouble();
		System.out.println("Enter the initial velocity of the shell.\n");
		double velocity = reader.nextDouble();
		
		double a = -4.9*(distance/velocity)*(distance/velocity);
		double b = distance;
		double c = a + height;
		
		double tanTheta = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
		double angle = Math.atan(tanTheta)*180/3.1415926;
		
		System.out.println("The angle is " + angle );
	
		
		
		
	}
}
