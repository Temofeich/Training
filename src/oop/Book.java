package oop;

public class Book {

    private String title;
    private String author;
    private int price;

    public Book(){
    }
    public Book(String title,String author,int price){
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public void setInfo(String title,String author, int price){
        this.author = author;
        this.title = title;
        this.price = price;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }



}
