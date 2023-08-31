package polymorphism;

public class TestMthdRdng extends MethodOver_Riding {
	
	
	
	void show() {
		System.out.println("Method 2");
	}
	
	public static void main(String[] args) {
		
		
		TestMthdRdng t1= new TestMthdRdng();
		t1.show();
		
		MethodOverloading m1= new MethodOverloading();
		m1.show();
		
	}

}
