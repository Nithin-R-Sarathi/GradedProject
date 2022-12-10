package Gradedproject;
import java.util.Random;
public class OTPGeneration {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(generateOTP(4));	 
	}
	protected static char[] generateOTP(int length) {
	      String numbers = "87474984";
	      Random random = new Random();
	      char[] otp = new char[length];
	      for(int i = 0; i< length ; i++) {
	         otp[i] = numbers.charAt(random.nextInt(numbers.length()));
	      }
	      return otp;
	}
}
