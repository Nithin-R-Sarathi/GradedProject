package Gradedproject;
import java.util.Scanner;
class CredentialVerification extends OTPGeneration {
	Scanner input=new Scanner(System.in);
	long BankAccountNo=16022000895l;
	long Password=834389;
	void verifyBankAccount(){
		System.out.print("Enter the bank Account no:");
		long AccountVerified=input.nextLong();
		if(BankAccountNo==AccountVerified){
			verifyPassword();
			}
		else{
			System.out.println("Incorrect Account Number");
			verifyBankAccount();
			}
		}
	void verifyPassword(){
		System.out.print("Enter the Password:");
		long PasswordVerified=input.nextLong();
		if(Password==PasswordVerified) {
			System.out.println("Successfull");
			}
		else{
			System.out.println("Incorrect Password");
			verifyPassword();
			}
		}
	}
public class BankAccountDetails {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CredentialVerification vv=new CredentialVerification();
		vv.verifyBankAccount();
	}
}