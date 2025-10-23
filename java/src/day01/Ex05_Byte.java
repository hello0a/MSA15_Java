package day01;

public class Ex05_Byte {
	public static void main(String[] args) {
		// byte는 1byte 범위의 정수 데이터 표현
		// 1byte = 8bits (0000 0000) : 2^8 : 256개
		// 양수와 음수로 나누면, -128 ~ 127 범위로 표현 가능
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		// Error
		// Type mismatch : cannot conver from int to byte
		// 자료형(타입)이 불일치, 데이터 범위 벗어남(overflow)
//		byte var5 = 128(int 4byte);
		byte var5 = (byte) 128;
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		
	}
}
