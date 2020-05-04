package lession2;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r1 = new Rectangle ();
		Rectangle r2 = new Rectangle (5,10);
		
		System.out.println(r1);
		System.out.println("Площа прямокутника 1 = "+r1.area());
		System.out.println("Периметр прямокутника 1 = "+r1.perimetr());

		System.out.println(r2);
		System.out.println("Площа прямокутника 2 = "+r2.area());
		System.out.println("Периметр прямокутника 2 = "+r2.perimetr());
		
		System.out.println("____________________");
		Circle c1 = new Circle (1,2);
		System.out.println(c1);
		System.out.println("Площа кола = "+c1.area());
		System.out.println("Периметр кола = "+c1.perimetr());
		
		
	}

}
