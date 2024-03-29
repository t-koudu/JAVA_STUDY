package session2.Problem4.Problem4_1;

public abstract class Animal {
	protected String call;
	
	public void crying() {
		System.out.println("鳴き声：" + call);
	}
	
	abstract int run(int distance);

}
