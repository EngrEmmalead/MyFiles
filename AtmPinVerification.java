import java.util.*;

class AtmPinVerification{
	boolean flag = true;
	int counter;
	void verifyPin(){
		Scanner s = new Scanner(System.in);
		while(flag){
		System.out.print("Enter Pin: ");
		int pin = s.nextInt();
		if (pin != 1234) {
			System.out.println("invalid Pin!");
			counter++;
			if(counter==3){
				System.out.println("Maximum Trial exceeded!\nContact admin!!!");
				break;
			}
		}
		else{
	
		 menu();
			System.out.print("Any more transaction? 1=y, 2=n : ");
			int res=s.nextInt();
			if(res==2){
				flag=false;
			}
		
		}
	}
	}	
	
	void QuickTeller(){
			Scanner s = new Scanner(System.in);
			System.out.println("RECHARGE MOBILE");
			System.out.println("1: MTN\n2: AIRTEL\n3: GLO\n4: Exit");
			int input2 = s.nextInt();
			if(input2==1){
			System.out.println("Enter Amount");
                            int input = s.nextInt();
                            System.out.println("you have recharged MTN "+ input);
                        }
                        else if
                            (input2==2){
			System.out.println("Enter Amount");
                            int input = s.nextInt();
                            System.out.println("you have recharged AIRTEL "+ input);
                        }
                         else if
                            (input2==3){
			System.out.println("Enter Amount");
                            int input = s.nextInt();
                            System.out.println("you have recharged GLO "+ input);
							}
			int Amount1;
			 Balance();		
					for(int Balance=52020; Amount1>0; Balance-=Amount1){
						while (Amount1>0){
								--Balance;
			System.out.println("Your balance is "+ Balance);			
						}		
					
			
					}		
					/*else*/ {AtmPinVerification vr= new AtmPinVerification();
                         vr.verifyPin();
                         }
					
				
     void menu(){ 
		Scanner x = new Scanner(System.in);
		System.out.println("Welcome to FIRST BANK \nEnter"); 
		System.out.println("1: Balance \n2: QuickTeller\n3: Withdrawer\n4: Exit");
		int input = x.nextInt();
		switch(input){
			case 1 : 
			Balance();
			//System.out.println("Your availabe balance is =N=52020.00");
			break;
			case 2 :
			QuickTeller();
			break;
			case 3: 
			System.out.println("Service not availabe");
			break;
			case 4 :
			System.out.println("Goodbye and thank you for using First Bank");
			break;
			default : 
			System.out.println("Invalid Selection\n Enter number b/w 1-4");
			break;
		}
	}
	 //} 
}
	 public static void main(String[] args){
		AtmPinVerification fbn = new AtmPinVerification();
		fbn.verifyPin();
		
	}

    
}
	
	
	
	
	
