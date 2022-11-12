public class CoffeeShop {

	private String name;
	private MenuItem[] menu;
	String orders[];
	
	public void addOrder(String item) {
		if (isExist(item)) {
			int i;
			for(i = 0; i < this.orders.length; i++) {
				if(this.orders[i] == null) this.orders[i] = item;
			}
		}
		 System.out.println("this item is currently unavailable");
	}
	
	public boolean isExist(String item) {
		for(int i = 0; i < this.menu.length; i++) {
			if(item.equals(this.menu[i].name)) return true;
		}
		return false;
	}
}
