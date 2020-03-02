package enity;

public class studentenity {
	private String name;
	private String number;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public studentenity(String name, String number, int age) {
		super();
		this.name = name;
		this.number = number;
		this.age = age;
	}
	
	
	
}
