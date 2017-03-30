package Hello;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HelloWorld {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("3");
		list.add("2");
		Set<String> set = new HashSet<String>(list);
		System.out.println(set);
	}
}
