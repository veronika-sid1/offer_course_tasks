package objects_classes_creation_2;

public class Book {
    String title;
    String author;

    public static void main(String[] args) {
        Book book = new Book("Евгений Онегин", "А.С.Пушкин");
        Book book1 = new Book("Отцы и дети", "И.С.Тургенев");
        book.printInfo();
        book1.printInfo();
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void printInfo() {
        System.out.println("Название: " + this.title + ", Автор: " + this.author);
    }
}
