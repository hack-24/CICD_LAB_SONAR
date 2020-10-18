
public class Test1 {
	private int n=10;
	public void f1(int n1) {
		
		n1=10;
	}

	public static void main(String[] args) {
		int n2=20;
		System.out.println("Hello World");
		
		if(n2==10) {
			
			System.out.println("False Part");
		}
		
		Test1 t1=new Test1();
		t1.f1(20);
		
	}

}
