
public class Staff extends People {
	Customer Customer; 
	
	public Staff(String name) {
		super(name);
	}
	
	public void approaches () {
		System.out.println(this.name + ": Welcome to the Disneyland! How may I help you?");
		this.Customer.purchases();
	}
	
	public void takesOrder(int familyNumber) {
		System.out.println(this.name + ": Alright! Here's the tickets and the chages. Have fun!!");
		this.Customer.entersPark (); 
	}

}
