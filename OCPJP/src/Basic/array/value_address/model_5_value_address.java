package Basic.array.value_address;

import java.util.Arrays;

public class model_5_value_address {
	public static void main(String[] args) {
		int[] x =new int[] {10,20,30};
		int[] y =new int[] {40,50,60};
		System.out.println(x); // [I@1dbd16a6
		System.out.println(y); // [I@7ad041f3
		System.out.println(x[0]); //10
		System.out.println(y[0]); //40
		x=y; // hashcode 位址＝hashcode 位址 ，一樣是 pass by value --> 消滅(左側被消滅) --> 回收記憶體 --> garbage collection --> gc 
		// x[0]=y[0] 值＝值 pass by values (copy) 
		System.out.println(x); // [I@7ad041f3
		System.out.println(y); // [I@7ad041f3
		// 兩者已指向同一個 hashcode 位置（視為一體）。
		System.out.println(x[0]); // 40
		System.out.println(y[0]); //40
		System.out.println(Arrays.toString(x)); //[40, 50, 60]
		System.out.println(Arrays.toString(y)); //[40, 50, 60]
		x[0]=100; // 其中一個改變，另一個跟著改變！！
		System.out.println(x[0]); //100
		System.out.println(y[0]); //100
		
		//--------------------------------//
		int i=10;
		int j=30;
		System.out.println(i); //10
		System.out.println(j); //30
		i=j; // pass by values 傳值
		System.out.println(i); //30
		System.out.println(j); //30
		j=40; // 其中一個改變，另一個不會跟著改變！！
		System.out.println(i); //30
		System.out.println(j); //40
	}
}
