package session2.Problem4.Problem4_1;

public class Dog extends Animal {
	
	private final int DOG_SPEED = 5;

	Dog(String call){
		super.call = call;
	}

	@Override
	int run(int distance) {
		return distance/DOG_SPEED;
	}

}
