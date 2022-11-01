public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Author bulgakov = new Author("Михаил", "Булгаков");
        Book firstBook = new Book("Михаил", "Мастер и Маргарита", 1928);
        Book secondBook = new Book("Михаил", "Белая гвардия", 1925);
        firstBook.setPublishingYear(1926);
        firstBook.getPublishingYear();
        System.out.println(firstBook.getPublishingYear());
    }
}



