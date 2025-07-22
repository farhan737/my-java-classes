package com.farhan;

import java.util.Scanner;

import com.farhan.others.BonusSalaryHR;

public class Lab2207 {
	static void printBonus(BonusSalaryHR e) {
		if (e.experience < 0)
			System.out.println("invalid experience entered");
		else
			System.out.println("bonus salary: " + e.bonusAmount);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee name: ");
		String ename = sc.nextLine();
		System.out.println("enter employee experience: ");
		int experience = sc.nextInt();
		BonusSalaryHR e1 = new BonusSalaryHR(experience, ename);
		printBonus(e1);
		sc.close();
	}
}
