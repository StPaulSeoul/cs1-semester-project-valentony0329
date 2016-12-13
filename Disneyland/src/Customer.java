
public class Customer extends People {
	int familyNumber;
	Staff helper; 
	
	public Customer(String name, int familyNumber) {
		super(name);
		this.familyNumber = familyNumber;
	}
	
	public void approaches() {
		System.out.println("(A customer enters)");
		this.helper.approaches();
	}
	
	public void purchases() {
		System.out.println(this.name + ": I'd like to purchase " + this.familyNumber+ " tickets for our family!");
		this.helper.takesOrder(this.familyNumber);
	}
	
	public void entersPark() {
		System.out.println("(The kids look excited and the family enters the Disneyland.)");
	}
	
	public static void main(String[] ARGS) {
		
		Customer myCustomer = new Customer("Paul", 5); 
		Staff myStaff = new Staff("Bruce");
		
		myCustomer.helper = myStaff;
		myStaff.Customer = myCustomer;
		
		myCustomer.approaches();
	}
}
