
import java.util.Scanner;

public class MenuClient {

	public static void main(String[] args) {
		Menu eatAtJoesMenu = new Menu();


		eatAtJoesMenu.append(new MenuItem("Vanilla Ice Cream", Menu.DESSERT, Menu.NOTHEARTHEALTHY, "9.99"));
		eatAtJoesMenu.append(new MenuItem("Chicken Salad Sandwich", Menu.MAIN_DISH, Menu.HEARTHEALTHY, "9.99"));

		eatAtJoesMenu.append(new MenuItem("Crab Dip", Menu.APPETIZER, Menu.NOTHEARTHEALTHY, "8.99"));
		eatAtJoesMenu.append(new MenuItem("Lobster Dinner", Menu.MAIN_DISH, Menu.NOTHEARTHEALTHY, "24.99"));
		eatAtJoesMenu.append(new MenuItem("Grilled Chicken", Menu.MAIN_DISH, Menu.HEARTHEALTHY, "9.99"));

		eatAtJoesMenu.append(new MenuItem("Carrot Cake", Menu.DESSERT, Menu.NOTHEARTHEALTHY, "9.99"));
		eatAtJoesMenu.append(new MenuItem("Salmon", Menu.MAIN_DISH, Menu.HEARTHEALTHY, "9.99"));
		eatAtJoesMenu.append(new MenuItem("Cheeseburger", Menu.MAIN_DISH, Menu.NOTHEARTHEALTHY, "9.99"));

		MenuItem item = null;
		int option;
		Scanner scan = new Scanner(System.in);
		MenuIterator itr;

		// display options
		// displayMenu();
		do {
			displayMenu();
			option = scan.nextInt();
			switch (option) {

			case 1:
				itr = eatAtJoesMenu.getAllItemsItr();
				while (itr.hasNext()) {
					item = itr.next();

					System.out.println(item.getItemName() + " $" + item.getPrice());

				}

				break;

			case 2:
				itr = eatAtJoesMenu.getItemIterator(Menu.APPETIZER);
				while (itr.hasNext()) {
					item = itr.next();
					if(item.getCategory() == Menu.APPETIZER){
						
						System.out.println(item.getItemName() + " $" + item.getPrice());
					}
				
				}
				break;
			case 3:
				itr = eatAtJoesMenu.getItemIterator(Menu.MAIN_DISH);
				System.out.println("-----DISPLAY ALL MAIN DISHES---------");
				while (itr.hasNext()) {
					item = itr.next();
					if(item.getCategory() == Menu.MAIN_DISH){
						
						System.out.println(item.getItemName() + " $" + item.getPrice());
					}
				
				}
				break;
			case 4:
				itr = eatAtJoesMenu.getItemIterator(Menu.DESSERT);
				System.out.println("--------DISPLAY ALL DESSERTS-----");
				while (itr.hasNext()) {
					item = itr.next();
					if(item.getCategory() == Menu.DESSERT){
						
						System.out.println(item.getItemName() + " $" + item.getPrice());
					}
				
				}
				break;
			case 5:
				itr = eatAtJoesMenu.getHeartHealthyItemsItr();
				// display(itr, item);
				while (itr.hasNext()) {
					item = itr.next();
					if (item.getHeartHealthy()) {

						System.out.println(item.getItemName() + " $" + item.getPrice());
					}

				}

				System.out.println("ALL MENU ITEMS");
				break;
			case 6:
				System.out.println("Enter a specified price");
				String p = scan.next();
				
				
				double SpecifiedPrice = Double.parseDouble(p);
				itr = eatAtJoesMenu.getPriceIterator(SpecifiedPrice);
				while (itr.hasNext()) {
					item = itr.next();
					
					double Itemprice = Double.parseDouble(item.getPrice());
					if(Itemprice <= SpecifiedPrice){
						
						System.out.println(item.getItemName() + " $" + Itemprice);
					}
				
				}
				break;
			}
		} while (option != 0);

	}

	

	
	public static void displayMenu() {
		System.out.println("---------MENU OPTIONS--------------");
		System.out.println("1-Display all menu items");
		System.out.println("2-Display all appetizers");
		System.out.println("3-Display all main dishes");
		System.out.println("4-Display all desserts");
		System.out.println("5-Display all heart healthy items");
		System.out.println("6-Display all main dishes under a specified price");
		System.out.println("0-quit");
	}

}