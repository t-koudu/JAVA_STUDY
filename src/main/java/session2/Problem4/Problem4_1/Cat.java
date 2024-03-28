package session2.Problem4.Problem4_1;

public class Cat extends Animal{
	
	private final int CAT_SPEED = 10;

	Cat(String call){
		super.call = call;
	}

	@Override
	int run(int distance) {
		return distance/CAT_SPEED;
	}

}
