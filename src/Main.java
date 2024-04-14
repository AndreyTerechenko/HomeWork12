
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Уильман", "Шекспир");
        Book book1 = new Book(1623, "Гамлет", author1);
        Author author2 = new Author("Джордж", "Мартин");
        Book book2 = new Book(1996, "Игра престолов", author2);
        System.out.println(book1.getBookTitle() + " произведение " + author1.getName() + " " + author1.getLastName() +
                " " + book1.getYear() + " года");
        System.out.println(book2.getBookTitle() + " произведение " + author2.getName() + " " + author2.getLastName() +
                " " + book2.getYear() + " года");


    }
}
// Надеюсь все правильно.
// все проверенно, все работает, данные что author что book и принимают и передают. принт выводит. объекты созданы.