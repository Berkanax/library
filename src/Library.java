public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.2";

        Book book1 = new Book();
        book1.title = "Zbuntowana";
        book1.author = "Veronica Roth";
        book1.releaseDate = 2012;
        book1.pages = 367;
        book1.publisher = "Amber";
        book1.isbn = "9788324153497";


        System.out.println(appName);
        System.out.println("### Książki dostepnę w bibliotece ###");
        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.releaseDate);
        System.out.println(book1.pages);
        System.out.println(book1.publisher);
        System.out.println(book1.isbn);
    }
}
