package Midterm;
import java.util.Arrays;

public class Book{
    private String name;
    private Author[] authors;
    private double price;
    private int qty=0;

    public Book(String name, Author[] authors, double price, int qty){
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.qty=qty;
    }

    public String getName() {
        return name;
    }

    public String getAuthors() {
        return Arrays.toString(authors);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String authorToStr=authors[0].toString();
        for(int i=1;i< authors.length;i++){
            authorToStr=authorToStr+","+authors[i].toString();
        }
        return "Book{" +
                "name='" + name + '\'' +
                ", author=[" + authorToStr+"]" +
                ", price=" + price +
                ", qty=" + qty +
                " }";
    }
    public String getAuthorNames(){
        String resultAuthor = authors[0].getName();
        for(int i = 1; i < authors.length; i++){
            resultAuthor += "," + authors[i].getName();
        }
        return resultAuthor;
    }
    public String getAuthorEmails(){
        String resultEmail = authors[0].getEmail();
        for(int i = 1; i < authors.length; i++){
            resultEmail += "," + authors[i].getEmail();
        }
        return resultEmail;
    }
    public String getAuthorGenders(){
        String resultGen = String.valueOf(authors[0].getGender());
        for(int i = 1; i < authors.length; i++){
            resultGen += "," + authors[i].getGender();
        }
        return resultGen;
    }


}
