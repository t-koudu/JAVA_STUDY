package session2.Problem4.Problem4_2;

public class Dog extends Animal implements RunInterface{
	
	private final int DOG_SPEED = 5;

	public Dog(String call){
		super.call = call;
	}

	@Override
	public int run(RoadDataBean bean) {
		return bean.getDistance()/DOG_SPEED;
	}
}
