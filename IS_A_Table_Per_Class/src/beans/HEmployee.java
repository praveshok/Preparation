package beans;

public class HEmployee extends Employee{

	private int Wh;
	//wh is for working hour
	public HEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public HEmployee(int id, String name, String email, int salary, int wh) {
		super(id, name, email, salary);
		Wh = wh;
	}

	public int getWh() {
		return Wh;
	}
	public void setWh(int wh) {
		Wh = wh;
	}
	
	
}
