package teach;

public class Animal {
	static String Name;
	public static void main(String[] args) {

		Animal a1=new Animal();
		a1.Name="Dog";
		a1.whatName();

		Animal a2=new Animal();
		a2.Name="Pig";

		a2.whatName();
	}

	public void whatName() {
		System.out.println("The name is "+Name);
	}
}
