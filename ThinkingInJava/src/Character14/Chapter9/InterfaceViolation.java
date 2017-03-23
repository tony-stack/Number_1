package Character14.Chapter9;

class B implements A{
	public void f(){
		System.out.println("This is B.f()");
	}
	public void g(){
		System.out.println("This is B.g()");
	}
}
public class InterfaceViolation {
	public static void main(String[] args){
		A a = new B();
		a.f();
		// a.g();
		System.out.println(a.getClass().getName());
		if(a instanceof B){
			B b = (B)a;
			b.g();
		}
	}
}
