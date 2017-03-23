package Character14.Chapter2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo01 {
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		String[] str = {"abc","dkasfj"};
		Collections.addAll(list, str);
		System.out.println(list);
	}
}
