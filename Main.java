import java.util.*;

public class Main {

	public static void main(String[] args) {

		System.out.println("PROGRAM STARTED");
		String s = Menu.getString("hihi : ");
		int v = Menu.getIntegerInputWithRange(0, 10);
		s = Menu.getString("hihi : ");
		v = Menu.getIntegerInputWithRange(0, 10);
		s = Menu.getString("hihi : ");
		v = Menu.getIntegerInputWithRange(0, 10);

		System.out.println("String enter is :" + s);
		System.out.println("In enter is :" + v);

		ShopKeeper shopKeeper1 = new ShopKeeper(0, "shoperKeerp1", 23, 10000);
		ShopKeeper shopKeeper2 = new ShopKeeper(0, "shoperKeerp2", 23, 10000);
		ShopKeeper shopKeeper3 = new ShopKeeper(0, "shoperKeerp3", 23, 10000);
		ShopKeeper shopKeeper4 = new ShopKeeper(0, "shoperKeerp4", 23, 10000);
		ShopKeeper shopKeeper5 = new ShopKeeper(0, "shoperKeerp5", 23, 10000);

		ShopKeeper[] shopkeepers = new ShopKeeper[] { shopKeeper1, shopKeeper2,
				shopKeeper3, shopKeeper4, shopKeeper5 };
		Shop shop = new Shop("SHOP1", "WALI AHMED", 100, shopkeepers);

		while (true) {
			int val = shop.displayMenu(0);
			int actionVal = Menu.getIntegerInputWithRange(-1, val);
			shop.performAction(actionVal);
		}

	}
}