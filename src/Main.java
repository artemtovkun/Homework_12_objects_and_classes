public class Main {
    public static void main(String[] args) {
        Author author = new Author("Андрей","Моргунов");
        System.out.println(author);

        System.out.println("========");

        Author author1 = new Author("Сергей", "Кузнецов");
        System.out.println(author1);

        System.out.println("========");

        Book book = new Book("Война и мир", author, 1864);
        System.out.println(book);

        System.out.println("========");

        Book book1 = new Book("Секреты рыбалки", author1, 2012);
        System.out.println(book1);

        System.out.println("========");

        book.setYearOfPublication(1905);
        System.out.println("Новый год публикации книги 'Война и мир' - " +book.getYearOfPublication());

        System.out.println("========");

        book1.setYearOfPublication(2015);
        System.out.println("Новый год публикации книги 'Секреты рыбалки' - " +book1.getYearOfPublication());

    }

}

