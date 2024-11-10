public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        System.out.println("Details of book1:");
        book1.printBookDetails();

        System.out.println("\nUpdating book1's title...");
        book1.setTitle("The Great Gatsby - Updated Edition");
        System.out.println("Updated Title: " + book1.getTitle());

        Book book2 = new Book();
        System.out.println("\nDetails of book2:");
        book2.printBookDetails();
    }
}
