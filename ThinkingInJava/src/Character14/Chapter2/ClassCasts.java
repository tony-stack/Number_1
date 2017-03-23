package Character14.Chapter2;
class Building{}
class House extends Building{}
public class ClassCasts {
	public static void main(String[] args){
		Building b = new House();
		Class<House> houseType = House.class;
		House h = houseType.cast(b);
		h = (House)b;
	}
}
