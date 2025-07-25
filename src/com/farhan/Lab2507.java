package com.farhan;

public class Lab2507 {

	public static void main(String[] args) {
		recurse(0);
	}
	static void recurse(int n) {
		n++;
		if(n < 10) recurse(n);
	}
}
