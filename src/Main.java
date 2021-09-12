import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> fl=new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit s1 = new Fruit(101,"Apple",1000);
		fl.add(s1);
		fl.add(new Fruit(102,"Orange",1500));
		fl.add(new Fruit(103,"Kiwi",2000));
		fl.add(new Fruit(104,"Peach",2500));
		fl.add(new Fruit(105,"Pineapple",9000));
		fl.add(new Fruit(106,"Strawberry",5000));
		fl.add(new Fruit(107,"Watermelon",7000));
		fl.add(new Fruit(108,"Grape",3500));
		fl.add(new Fruit(109,"Plum",3000));
		fl.add(new Fruit(110,"Banana",1300));
		
		Collections.sort(fl, s1.new FruitComparator());
		for(Fruit s : fl) {
			System.out.println(s.toString());
		}
	}

}
