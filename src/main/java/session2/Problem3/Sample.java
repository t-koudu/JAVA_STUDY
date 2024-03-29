package session2.Problem3;

public class Sample {
	
	//クラス変数
	static int cass_val;
	//インスタンス変数
	int instance_val;
	
	public int getCass_val() {
		return cass_val;
	}
	public void setCass_val(int cass_val) {
		Sample.cass_val = cass_val;
	}
	
	//staticメソッド
	public static void staticMethod() {
		System.out.println("staticMethod");
	}
}
