package review01;

public class ex05 {

	public static void main(String[] args) {
		byte flag1 =0b00000001;
		byte flag2 =0b00000010;
		byte flag3 =0b00000100;
		byte flag4 =0b00001000;

		byte result = 0b00000000;

		result=(byte)(result|flag1);
		System.out.println(Integer.toBinaryString(result));

		result=(byte)(result|flag2);
		System.out.println(Integer.toBinaryString(result));

		result=(byte)(result|flag3);
		System.out.println(Integer.toBinaryString(result));

		result=(byte)(result&~flag1);
		System.out.println(Integer.toBinaryString(result));


		System.out.println("-------------");
		int a=10, b=20;

		System.out.println(a==10 && b==20);
		System.out.println(a>10 && b==20);
		System.out.println(a==10 && b==20);
		System.out.println(a<10 && b>20);

		System.out.println(a==10 || b==20);
		System.out.println(a>10 || b==20);
		System.out.println(a==10 || b==20);
		System.out.println(a<10 || b>20);





	}//main

}//class
