package Character14.Chapter9;
class C implements A{
	public void f(){
		System.out.println("public C.f()");
	}
	public void g(){
		System.out.println("public C.g()");
	}
	public void u(){
		System.out.println("package C.u()");
	}
	protected void v(){
		System.out.println("protected C.v()");
	}
	@SuppressWarnings("unused")
	private void w(){
		System.out.println("private C.w()");
	}
}
public class HiddenC {
	public static A makeA(){
		return new C();
	}
}
