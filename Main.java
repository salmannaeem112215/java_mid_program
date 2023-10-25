
public class Main {

	public static void main(String[] args) {

		System.out.println("PROGRAM STARTED");
		Shop shop1 = Shop.dummy(0);
		Shop shop2 = Shop.dummy(1);
		Shop shop3 = Shop.dummy(2);

		shop1.menu();
		shop2.menu();
		shop3.menu();

	}
}