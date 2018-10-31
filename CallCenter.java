//THIS IS JAVA PROGRAMMING LANGUAGE
import java.util.Scanner;
class Callmanager{
	
	public void connect(String number)throws NumberFormatException{
		if(number.length()!=11){
System.out.println("The MTN number you dialled is incorrect please check the number and dail again");	
		throw new NumberFormatException();
		}
		else{
		System.out.println("Calling..."+number);
	}
	}
}
class CallCenter{
	static String number;
	public void dail() {
		Scanner s = new Scanner(System.in);
		System.out.println("Dial Number: ");
		number=s.nextLine();
	}
public static void main (String[] args){
CallCenter cc = new CallCenter();
Callmanager cm = new Callmanager();
try{
	cc.dail();
	cm.connect(number);
}
	catch(NumberFormatException nfe){
		System.out.println("Exception in code");
	}
	finally{
		System.out.println("Thank for using MTN");
	}
}
}	
