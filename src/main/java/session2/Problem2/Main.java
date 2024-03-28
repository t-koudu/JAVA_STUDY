package session2.Problem2;

import session2.Problem2.package1.AccessTest;

public class Main {

	public static void main(String[] args) {
		
		AccessTest accesstest  = new AccessTest();
		//public　メソッド
		accesstest.publicMethod();
		//protected メソッド
		accesstest.protectedMethod();
		//private メソッド
		accesstest.privateMethod();
		
	}
	
}
