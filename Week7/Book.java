package Week7;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty=0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public Book(String java_for_dummy, Author khushnud, double price, int qty) {
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[" +
                "name=" + name +
                ",authors=" + Arrays.toString(authors) +
                ",price=" + price +
                ",qty=" + qty +
                ']';
    }
    public String getAuthorNames(){
        String authorNames = "";
        for (int i = 0; i < this.authors.length; i++) {
            authorNames += authors[i].getName()+",";
        }
        return authorNames.substring(0,authorNames.length()-1);
    }
}
