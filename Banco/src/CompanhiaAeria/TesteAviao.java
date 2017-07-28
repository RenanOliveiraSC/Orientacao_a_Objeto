package CompanhiaAeria;

public class TesteAviao {

	public static void main(String[] args) {
		try {
			Boing boing = new Boing(0, 500d);
			Boing boing2 = new Boing(30, 1000d);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
