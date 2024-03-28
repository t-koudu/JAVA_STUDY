package session2.Problem4.Problem4_2;

public class Car implements RunInterface{
	
	private final int CAR_SPEED = 15;

	@Override
	public int run(RoadDataBean bean) {
		return bean.getDistance()/CAR_SPEED;
	}

}
