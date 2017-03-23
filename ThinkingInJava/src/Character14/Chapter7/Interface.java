package Character14.Chapter7;

public interface Interface{
	void doSomething();
	void somethingElse(String args);
}
class RealObject implements Interface{
	public void doSomething(){
		System.out.println("doSomething");
	}
	public void somethingElse(String arg){
		System.out.println("somethingElse" + arg);
	}
}
