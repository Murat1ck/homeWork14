public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Author mBulgakov = new Author("Михаил", "Булгаков");
        Book firstBook = new Book(mBulgakov, "Мастер и Маргарита", 1928);
        Book secondBook = new Book(mBulgakov, "Белая гвардия", 1925);
        firstBook.setPublishingYear(1926);
        firstBook.getPublishingYear();
        System.out.println(firstBook.getPublishingYear());
    }
}



