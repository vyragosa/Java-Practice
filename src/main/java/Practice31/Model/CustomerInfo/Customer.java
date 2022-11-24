package Practice31.Model.CustomerInfo;

public final class Customer {
	private final String firstName;
	private final String lastName;
	private final int age;
	private final Address address;
	private final static Customer NOT_MATURE_UNKNOWN_CUSTOMER = new Customer(null, null, 18, Address.getEmptyAddress());
	private final static Customer MATURE_UNKNOWN_CUSTOMER = new Customer(null, null, 0, Address.getEmptyAddress());

	public Customer(String firstName, String lastName, int age, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		if(address == null) {
			return Address.getEmptyAddress();
		}
		return address;
	}

	public static Customer getMatureUnknownCustomer() {
		return MATURE_UNKNOWN_CUSTOMER;
	}

	public static Customer getNotMatureUnknownCustomer() {
		return NOT_MATURE_UNKNOWN_CUSTOMER;
	}

	@Override
	public String toString() {
		return String.join(" ", firstName, lastName,String.valueOf(age), address.toString());
	}
}
