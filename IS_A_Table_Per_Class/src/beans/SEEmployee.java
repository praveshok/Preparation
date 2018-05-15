package beans;

public class SEEmployee extends Employee {

	private String tool;
	public SEEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public SEEmployee(int id, String name, String email, int salary, String tool) {
		super(id, name, email, salary);
		this.tool = tool;
	}

	public String getTool() {
		return tool;
	}
	public void setTool(String tool) {
		this.tool = tool;
	}
	
	
}
