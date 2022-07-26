package Basic.Object_oriented.practice3.main;

import Basic.Object_oriented.practice3.method.stu_method3;
/*
 *  建立物件步驟:
 *  	1. field 欄位
 *  	2. constructors 建構式
 *  	3. methods 方法
 */
public class stu3 {
	public static void main(String[] args) {
		 stu_method3 stu =new stu_method3();
		 stu.setChi(50);
		 System.out.println("國文成績: "+stu.getChi());
		 stu.setEng(60);
		 System.out.println("英文成績: "+stu.getEng());
		 System.out.println("總成績: "+stu.getSum());
		 System.out.println("平均成績: "+stu.getAvg());
		 System.out.println("========================");
		 System.out.println(stu); // 物件內有 toString() 方法 --> 可以直接這樣寫。 但物件內未寫 toString() 方法的話，會顯示物件的hashcode位置。
		 System.out.println(stu.toString()); //物件內未寫 toString() 方法的話，會顯示物件的hashcode位置。
	}
}
