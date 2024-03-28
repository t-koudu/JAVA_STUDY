package session2.Problem4.Problem4_2;

public class Cat extends Animal implements RunInterface{
	
	private final int CAT_SPEED = 10;

	public Cat(String call){
		super.call = call;
	}

	@Override
	public int run(RoadDataBean bean) {
		return bean.getDistance()/CAT_SPEED;
		
	}

}
