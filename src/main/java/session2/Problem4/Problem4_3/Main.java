package session2.Problem4.Problem4_3;

import session2.Problem4.Problem4_2.Car;
import session2.Problem4.Problem4_2.Cat;
import session2.Problem4.Problem4_2.Dog;
import session2.Problem4.Problem4_2.RoadDataBean;
import session2.Problem4.Problem4_2.RunInterface;

public class Main {

	public static void main(String[] args) {
		RunInterface[] interfaceArray = {new Car(), new Cat("ニャー!!"), new Dog("ワンワン!!")};
		
		RoadDataBean bean = new RoadDataBean();
		bean.setDistance(1000);
		
		for(RunInterface runIf : interfaceArray) {
			System.out.println(runIf.run(bean) + "秒");
		}
		
		
		Cat cat = new Cat("meow!!");
		cat.crying();
		Dog dog = new Dog("bow wow!!");
		dog.crying();
	}
}
