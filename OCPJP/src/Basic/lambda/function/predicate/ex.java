package Basic.lambda.function.predicate;

import java.util.function.Predicate;

/*
 *   predicate:
 *   	對某種數據類型進行判斷，結果返回一個 boolean 值。 --> test(T t)
 */
public class ex {
	public static boolean checkString(String s,Predicate<String> pre) {
		
		return pre.test(s);
	}
	public static void main(String[] args) {
		
		String s="abcde";
		
		boolean b= checkString(s,(String str)->{
			return str.length()>5;
		});
		System.out.println(b);
		
		// 優化寫法
		boolean b2= checkString(s,str->str.length()>5);
		System.out.println(b2);
	}
}
