package com.farhan.others;

public class Book {

    public String printDisc(int bookId, String title, String author, int price, double discount) {
        return "the price of the book titled: " + title + " from author: " + author + " is " + price
                + " after applying the discount " + discount
                + " the price is " + (price - ((discount / 100) * price));
    }
}
