package firstgithub;

public class HelloWorld {
	private String name;
	private int age;
	

	
	public HelloWorld(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public static void main(String[] args) {
		
		HelloWorld  hw = new HelloWorld("Sajan", 40);
		System.out.println("How are you " + hw.getName() + " you are now  " +  hw.getAge());
		
		


	}

}
