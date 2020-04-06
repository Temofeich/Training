package oop2;

import java.util.Objects;

public class Book {
    private int price;

    public Book(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + // get.Class().getSimpleName() вместо "Book{" => рефлексия,
                // чтобы при замене названия класса toString выводил корректное название класса
                "price=" + price +
                '}';
    }
}
