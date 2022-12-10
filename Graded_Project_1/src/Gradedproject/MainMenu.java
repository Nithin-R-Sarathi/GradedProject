package Gradedproject;
public class MainMenu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Credential verification\n");
		System.out.println("Welcome to login page\n");
		CredentialVerification bankAccountLogin=new CredentialVerification();
		bankAccountLogin.verifyBankAccount();
		MainOptions mainMenu=new MainOptions();
		mainMenu.selectOptions();
		}
}                 