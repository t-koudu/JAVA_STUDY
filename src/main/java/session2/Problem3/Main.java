package session2.Problem3;

public class Main {

	public static void main(String[] args) {

		//staticメソッド呼び出し
		Sample.staticMethod();
		
		//1回目Sampleクラス呼び出し
		Sample sample1 = new Sample();
		sample1.instance_val = 10;
		sample1.setCass_val(20);
		
		//2回目Sampleクラス呼び出し
		Sample sample2 = new Sample();
		sample2.instance_val = 30;
		sample2.setCass_val(40);
		
		//変数の値確認
		System.out.println("[1回目]インスタンス変数：" + sample1.instance_val);
		System.out.println("[1回目]クラス変数：" + sample1.getCass_val());
		System.out.println("[2回目]インスタンス変数：" + sample2.instance_val);
		System.out.println("[2回目]クラス変数：" + sample2.getCass_val());
	}	
}
