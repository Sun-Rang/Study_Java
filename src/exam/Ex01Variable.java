package exam;

import javax.swing.plaf.synth.SynthColorChooserUI;

public class Ex01Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정수형 변수 num에 5를 대입한 후,
		// num을 출력해주세요

		int num = 5;
		// syso -> 자동완성
		System.out.println(num);

		// 자료형 (Data Type)
		// 1. 논리형 (boolean) : 1bit, 1byte(Java 메모리 최소단위)
		boolean isLight = true;
		boolean isRain = false;

		// 2. 문자형 (char) : 2byte
		char ch1 = 'M';
		char ch2 = 'z';
		char ch3 = '1';

		// 3. 정수형
		// byte, short, int, long
		// byte : 1byte (8bit) 2^8 = 256
		// -128 ~ 127
		byte age = 127;
		age += 1;
		System.out.println(age);
		// short : 2byte (16bit) 2^16 = 65536
		
		short lunch = 10000;
		
		// int : 4byte(32bit) 2^32 = 42억~
		int salary = 150000000;
		
		// long : 8byte (64bit) 2^64 = 1800경~
		long popular = 7000000000l;
		
		// 4. 실수형
		// float : 4byte
		float weight = 95.5f;
		
		
		// double : 8byte
		double PI = 3.1415926535;
		
		// Type Casting (자료형 변환)
		byte num2 = (byte)128;
		// 명시적 형변환 (Explicit Type Casting)
		
		System.out.print("num2 : ");
		System.out.println(num2);
		
		short money = 30000;
		
		int num3 = money;
		// 암시적(묵시적) 형변환 (Implicit Type Casting)
		
		long pop = 7000000000L;
		float height = (float)169.1; // 명시적 형변환 가능
		
		// 그 외 Data Type
		// String
		String name = "나예호";
		
		// 기본 data type 8가지
		// reference type
		
	}

}
