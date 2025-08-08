package farhan.exeperiments;

public class TableOrder {
	public int tableNumber;
	public int itemCost;
	public int itemCount;
	public static int totalBillamount;
	public static double finalBill;

	public TableOrder(int tableNumber, int itemCost, int itemCount) {
		this.tableNumber = tableNumber;
		this.itemCost = itemCost;
		this.itemCount = itemCount;
		subBill();
	}

	public void subBill() {
		totalBillamount += itemCost * itemCount;
	}

	public static void finalBill() {
		finalBill = totalBillamount + (totalBillamount * 0.05);
		System.out.println(finalBill);
	}
}
