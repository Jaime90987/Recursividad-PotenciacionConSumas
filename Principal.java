public class Principal {

	public static void main(String [] args) {
		Potenciacion p1 = new Potenciacion(4,3);
		System.out.println(p1.getPotenciacion());

		Potenciacion p2 = new Potenciacion(4,4);
		System.out.println(p2.getPotenciacion());

		Potenciacion p3 = new Potenciacion(-4,3);
		System.out.println(p3.getPotenciacion());

		Potenciacion p4 = new Potenciacion(-4,4);
		System.out.println(p4.getPotenciacion());

		Potenciacion p5 = new Potenciacion(4,-3);
		System.out.println(p5.getPotenciacion());

		Potenciacion p6 = new Potenciacion(4,-4);
		System.out.println(p6.getPotenciacion());

		Potenciacion p7 = new Potenciacion(-4,-3);
		System.out.println(p7.getPotenciacion());

		Potenciacion p8 = new Potenciacion(-4,-4);
		System.out.println(p8.getPotenciacion() + "\n");


		Potenciacion p10 = new Potenciacion(5,3);
		System.out.println(p10.getPotenciacion());

		Potenciacion p11 = new Potenciacion(5,4);
		System.out.println(p11.getPotenciacion());

		Potenciacion p12 = new Potenciacion(-5,3);
		System.out.println(p12.getPotenciacion());

		Potenciacion p13 = new Potenciacion(-5,4);
		System.out.println(p13.getPotenciacion());

		Potenciacion p14 = new Potenciacion(5,-3);
		System.out.println(p14.getPotenciacion());

		Potenciacion p15 = new Potenciacion(5,-4);
		System.out.println(p15.getPotenciacion());

		Potenciacion p16 = new Potenciacion(-5,-3);
		System.out.println(p16.getPotenciacion());

		Potenciacion p17 = new Potenciacion(-5,-4);
		System.out.println(p17.getPotenciacion());
	}
	
	/*
		4^3 = 64
		4^4 = 256

		-4^3 = -64
		-4^4 = 256

		4^-3 = 0.015625
		4^-4 = 0.00390625

		-4^-3 = -0.015625
		-4^-4 = 0.00390625

		5^3 = 125
		5^4 = 625

		-5^3 = -125
		-5^4 = 625

		5^-3 = 0.008
		5^-4 = 0.0016

		-5^-3 = -0.008
		-5^-4 = 0.0016
	*/
}
