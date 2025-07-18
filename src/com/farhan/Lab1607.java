package com.farhan;

import com.farhan.others.TableOrder;

public class Lab1607 {
	
	static void printValues(TableOrder t) {
		System.out.println(t.tableNumber);
		System.out.println(t.itemCount);
		System.out.println(t.itemCost);
		System.out.println(TableOrder.totalBillamount);
	}
	
	public static void main(String[] args) {
		
		TableOrder t1  = new TableOrder(1, 2, 150);
		printValues(t1);
		TableOrder t2 = new TableOrder(2, 3, 200);
		printValues(t2);
		TableOrder.finalBill();
	}

}
