package session1.Problem1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> orgList = new ArrayList<String>();
		orgList.add("aaa");
		orgList.add("bbb");
		orgList.add("ccc");
		
		//deepcopy
		deepCopyTest(orgList);
		System.out.println("deepCopyTest実行後：" + Arrays.toString(orgList.toArray()));
		
		//shallowcopy
		shallowCopyTest(orgList);
		System.out.println("shallowCopyTest実行後：" + Arrays.toString(orgList.toArray()));
		

	}
	
	
	private static ArrayList<String> deepCopyTest(ArrayList<String> list) {
		ArrayList<String> deepCopyList = new ArrayList<String>(list);
		deepCopyList.add("deepCopy");
		return deepCopyList;
	}

	private static ArrayList<String> shallowCopyTest(ArrayList<String> list) {
		ArrayList<String> shallowCopy = list;
		shallowCopy.add("shallowCopy");
		return shallowCopy;
	}

}
