package Character14.Chapter7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * 使用Method.invoke()将请求转发给被代理的对象，并传入必要的参数；可以通过传递其他的参数，来过滤某些方法的调用。
 * 使用代理来编写一个系统以实现事务，其中，代理在被代理的调用执行成功时（不抛出任何异常）执行提交，而在其执行失败时执行回滚
 * @author ZML
 *
 */
class DynamicProxyHandler implements InvocationHandler{
	private Object proxied;
	public DynamicProxyHandler(Object proxied){
		this.proxied = proxied;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("**** proxy: " + proxy.getClass() + ",method: " + method + ", args:" + args);
		if(args != null){
			for(Object arg : args){
				System.out.println("  " + arg);
			}
		}
		return method.invoke(proxied, args);
	}
}
public class SimpleDynamicProxy {
	public static void consumer(Interface iface){
		iface.doSomething();
		iface.somethingElse("bonobo");
	}
	public static void main(String[] args){
		RealObject real = new RealObject();
		consumer(real);
		Interface proxy = (Interface)Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{ Interface.class}, new DynamicProxyHandler(real));
		consumer(proxy);
	}
}
