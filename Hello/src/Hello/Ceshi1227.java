package Hello;

public class Ceshi1227 {
	public static void main(String[] args){
		int age1=24;
		int age2=18;
		int age3=36;
		int age4=27;
		int sum=(age1+age2+age3+age4);
		double avg = sum/4.0;
		int minus = age1 - age2;
		int newAge = age1-- ;
		System.out.println("总和:" +  sum);
		System.out.println("平均年龄： " + avg);
		System.out.println("年龄差： " + minus);
		System.out.println("年龄自减：" + newAge);
		int Age1=24 ;
		int NewAge= --Age1 ;
		int newAge1= Age1-- ;
		System.out.println(NewAge + "::" + newAge1);
	}
}
