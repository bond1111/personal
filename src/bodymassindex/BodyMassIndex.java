package bodymassindex;
import java.util.Scanner;
public class BodyMassIndex {

	public static void main(String[] args) {
		double bodyMassIndex=0.0;
		double userWeightIb=0.0;
		double userHeightIn=0.0;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your weight in pounds");
		userWeightIb= scan.nextDouble();
		scan.nextLine();
		System.out.println("Enter your height in inches");
		userHeightIn= scan.nextDouble();
		scan.nextLine();
		BodyMassIndex user= new BodyMassIndex();
		double weight1= user.convertWeight(userWeightIb);
		double height1= user.convertHeight(userHeightIn);
		
		bodyMassIndex= weight1/Math.pow(height1,2);
		System.out.println("your BMI is"+ bodyMassIndex);
		String diagnosis="";
		
		if(bodyMassIndex<18.5){
			diagnosis="Underweight";
		}
		
		else if(bodyMassIndex<25.0) {
			diagnosis="Normal";
		}
		
		else if(bodyMassIndex<30) {
			diagnosis="Overweight";
		}
		
		
		else  {
			diagnosis= "Obese";
		}
		System.out.println("Given your current height and weight, you are "+ diagnosis);
	}
		
	
	double convertWeight (double weightIB) {
			/*Note that one pound is 0.45359237 kilograms, and one inch is 0.0254
			meters*/
			final double POUND_TO_KG=0.45359237;
			double weightKG= weightIB*POUND_TO_KG;
			double finalWeight=weightKG;
			return finalWeight; 
		}
		
		double convertHeight(double heightIn) {
			final double INCHES_TO_METERS=0.0254;
			double heightInMeters=heightIn*INCHES_TO_METERS;
			double finalHeight=heightInMeters;
			return finalHeight;
		}
		
}


