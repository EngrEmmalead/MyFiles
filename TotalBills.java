import java.util.Scanner;

class CustomerItems{
String Item1,Item2,Item3,Item4;
double Amount1,Amount2,Amount3,Amount4,total; 


void getItems(){
	Scanner can = new Scanner(System.in);
	System.out.println("\n Collecting Items");
	
	System.out.print("Enter Item 1 : ");
	Item1=can.nextLine(); 
	
	System.out.print("Enter Item 2 : ");
	Item2=can.nextLine(); 
	
	System.out.print("Enter Item 3 : ");
	Item3=can.nextLine();
	
		System.out.print("Enter Item 4: ");
	Item4=can.nextLine(); 
	
	System.out.print("\n");
	
	System.out.print("Enter Amount 1 : ");
	Amount1=can.nextDouble();
	
	System.out.print("Enter Amount 2 : ");
	Amount2=can.nextDouble();
	 
	System.out.print("Enter Amount 3 : ");
	Amount3=can.nextDouble();

	System.out.print("Enter Amount 4 : ");
	Amount4=can.nextDouble();
	
	total=Amount1+Amount2+Amount3+Amount4;
	System.out.println("\n");
	}
	
void printCustomersItem(){
	System.out.println("printing amout paid for different items");
	System.out.println("\n");
	System.out.println(Item1+" : "+Amount1+"\n"+Item2+" : "+Amount2+"\n"+Item3+" : "+Amount3+"\n"+Item4+" : "+Amount4+"\n"+"Total Bill: "+total);

}
 
}

class TotalBills{
	public static void main(String args[]){
		CustomerItems James = new CustomerItems();
		 James.getItems();
		 James.printCustomersItem();
	
		 
		
		
	}
	
	
}


