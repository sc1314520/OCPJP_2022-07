package Basic.Concurrency.main;

public class Person {
	private String name;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name) {
		super();
		this.name = name;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println(name+"  "+i);
		}
	}
}
