package Collection.ArrayList.program1;

public class Customer {
    int id;
    String name;
    String journey_type;
    
    public Customer(int id,String name,String journey_type) {
    	this.id=id;
    	this.name=name;
    	this.journey_type=journey_type;
    }

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", journey_type=" + journey_type + "]";
	}
    
    
}
