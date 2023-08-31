package polymorphism;

public class MethodOverloading {
	
	
	void show(int...a) {
		 System.out.println("Im method 1");
	}
	
	
	void show(int b) {
		 System.out.println("Im method 2");
	}
	
	
	void show(String a,int b,int c) {
		 System.out.println("Im method 2");
	}
	public static void main(String[] args) {
		
		MethodOverloading m=new MethodOverloading();
		m.show('a');
	}

}
