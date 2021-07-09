package teach;

public class Car {
	int speed;
	String name;
	String Expense;
	int Tyres;
	
	public Car() {
		this.speed=10;
		this.name="'Bullock cart";
		this.Tyres=4;
	}
	public Car(String Nam, int spd) {
		this.name=Nam;
		this.speed=spd;
		this.Tyres=4;
	}
	public Car(String Nam, int spd,String expense) {
		this.name=Nam;
		this.speed=spd;
		this.Expense=expense;
		this.Tyres=4;
	}

	public static void main(String[] args) {
		
		
		Car c1=new Car("BMW",500);
		Car c2=new Car("Honda",300);
		
		Car c3=new Car();
		Car c4=new Car();
		
		Car racer=new Car("Honda",300,"Costly");
		
		c1.printSpeed();
		c2.printSpeed();
		racer.printSpeed();
		c3.printSpeed();
		c4.printSpeed();
	}
	
	public void printSpeed() {
		System.out.println("The speed of "+ name+" is "+speed);
	}


}
