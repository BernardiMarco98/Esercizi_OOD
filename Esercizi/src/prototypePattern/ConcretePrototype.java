package prototypePattern;

public class ConcretePrototype implements Prototype{

	private String name;
	
	public Object clone(){
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setName(String nameObject) {
		// TODO Auto-generated method stub
		this.name = nameObject;
	}
	
	
}
