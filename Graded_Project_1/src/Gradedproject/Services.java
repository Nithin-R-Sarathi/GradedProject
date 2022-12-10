package Gradedproject;
class MainOptions extends CredentialVerification{
	long Balance=23455;
	long TransferAmount=0l;
	long TransferAccountNo=16022778956l;
	long TransferAccountInput;
	long WithdrawAmount=0;
	int Back=0;
	void selectOptions (){
		System.out.println("\n!!!!!!!!!!!! Welcome to Karnataka Bank !!!!!!!!!!!!\n");
		System.out.println("\n\nPlease Select Your Service");
		System.out.println("1)Deposit\n2)Withdraw\n3)Transfer\n4)Check Balance\n5)Logout");
		int Deposit=1, Withdraw=2, Transfer=3,CheckBalance=4,Logout=5;
		System.out.print("\nEnter the Option: ");
		int Options=input.nextInt();
		if(Options>5 || Options<1){
			System.out.println("Please Enter Correct Option.........");
			selectOptions();
		}
		if(Options==Deposit){
			long DepositAmmount;
			System.out.print("Enter the Amount:");DepositAmmount=input.nextLong();
			Balance=Balance+DepositAmmount;
			System.out.println("Amount Rs."+DepositAmmount+" deposited successfully");
			System.out.println("Updated Acount Balance is: "+Balance);
			System.out.println("\nPress 0 to go Back");Back=input.nextInt();
			backOption();
			}
		if(Options==Withdraw){
				System.out.print("Enter Amount to Withdraw:");
				WithdrawAmount=input.nextInt();
				if(WithdrawAmount<=Balance) {
					System.out.println("Processing...........!");
					System.out.println("Your Withdraw Amount is:"+WithdrawAmount+"\nSuccessfull\n               Collect Your Cash");
					Balance=Balance-WithdrawAmount;
					System.out.println("\nPress 0 to go Back");
					Back=input.nextInt();
					backOption();
				}
				else {
					System.out.println("Entered amount is greater than current balance");
					selectOptions();
				}
			}		
		if(Options==Transfer){
			System.out.print("Enter the amount you want to transfer: ");
			TransferAmount=input.nextLong();
			if(TransferAmount>Balance){
				System.out.println("Your Transfer Amount is more than Current Balance!!!!!!!!!!!!!!!!!");
				System.out.println("Please Enter Correct Amount");
				selectOptions();
			}
			else 
				System.out.print("Enter the BankAccount no to which you want to transfer:");
				TransferAccountInput=input.nextLong();
				if(TransferAccountInput==TransferAccountNo){
					int otpStore=Integer.parseInt(String.valueOf(generateOTP(4)));
					System.out.println("Your OTP is "+otpStore);
					System.out.println("Enter the OTP");
					int OTPgeneration=input.nextInt();
					if(OTPgeneration==otpStore){
						System.out.println("OTP verification Successful !!!");
						System.out.println("Processing...........!");
						System.out.println("Amount "+TransferAmount+" transferred successful to BankAccount "+TransferAccountNo);
						System.out.println("Remaining Bank balance is: "+Balance);
						System.out.println("Transaction Status: Success");

						}
					else
						System.out.println("Invalid OTP");
						selectOptions();
						}
				if(TransferAccountInput!=TransferAccountNo){
					System.out.println("Please Enter Valid Bank Account No");
					selectOptions();
					}
				}
		if(Options==CheckBalance){
			System.out.println("Balance = "+Balance);
			System.out.println("\nPress 0 to go Back");
			Back=input.nextInt();
			backOption();
		}
		if(Options==Logout){
			System.out.println("    Login to continue\n\n");
			verifyBankAccount();
			selectOptions();
			}
		}
	void backOption() {
		try{
			if(Back==0){
				selectOptions();
				}
			else{
				System.out.print("Please press 0 to go back:");
				Back=input.nextInt();
				}
			}
		finally{	
			backOption();
			}
		}
	
}