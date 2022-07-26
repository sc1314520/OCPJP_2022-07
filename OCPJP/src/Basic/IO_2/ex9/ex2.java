package Basic.IO_2.ex9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ex2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis =new FileInputStream(new File("/Users/blc0000421gmail.com/Desktop/io/d.txt"));
		
		byte[] bytes=new byte[10];
		int len=fis.read(bytes);
		
		System.out.println(len); //10 每次讀取的有效字節個數
		System.out.println(Arrays.toString(bytes)); //[49, 48, 48, 65, 66, 67, 68, 69, 66, 67]
		System.out.println(new String(bytes)); // 100ABCDEBC  
		// 若 new byte[2] --> 只會讀到最前面兩個
		
		
		
		FileInputStream fis2 =new FileInputStream(new File("/Users/blc0000421gmail.com/Desktop/io/d.txt"));
		byte[] bytes2 =new byte[1024];
		int len2=0; // 紀錄每次讀到的有效字節個數。
		while((len2=fis2.read(bytes2))!=-1) {
			// String(byte[],int offset,int length)
			
			System.out.println(new String(bytes2,0,len2)); // 100ABCDEBC
		}
		
		fis.close();
	}
}
