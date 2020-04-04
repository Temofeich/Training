package oop;

public class StartBook {
    public static void main(String[] args) {

        Book book1 = new Book("Java", "Ekkel", 300);
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getPrice());

        Book book2 = new Book();
        book2.setInfo("C++", "Straustrup", 400);
        System.out.println(book2.getTitle());
        System.out.println(book2.getAuthor());
        System.out.println(book2.getPrice());

        Book book3 = new Book();
        book3.setTitle("java");
        book3.setAuthor("Ekkel");
        book3.setPrice(310);
        System.out.println(book3.getTitle());
        System.out.println(book3.getAuthor());
        System.out.println(book3.getPrice());
    }
}