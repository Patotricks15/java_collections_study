import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class listBooks {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java", "Patrick", 2020, 300));
        books.add(new Book("Algoritmos", "Maria", 2018, 450));
        books.add(new Book("Python", "João", 2022, 200));

        // Simulando que um livro não está disponível
        books.get(1).setAvailable(false); // Algoritmos indisponível

        System.out.println("--- Ordenação Natural (Título A-Z) ---");
        Collections.sort(books);
        printBooks(books);

        System.out.println("\n--- Ordenação por Ano (Mais antigo primeiro) ---");
        books.sort(Book.BY_YEAR);
        printBooks(books);

        System.out.println("\n--- Ordenação por Autor (A-Z) ---");
        books.sort(Book.BY_AUTHOR);
        printBooks(books);

        System.out.println("\n--- Ordenação por Ano (Invertida - Mais recente primeiro) ---");
        books.sort(Book.BY_YEAR.reversed());
        printBooks(books);

        System.out.println("\n--- Demonstração de Iterator (Filtrando Disponíveis) ---");
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.isAvailable()) {
                System.out.println(book.getTitle() + " está disponível!");
            } else {
                System.out.println(book.getTitle() + " NÃO está disponível!");
            }
        }
    }

    private static void printBooks(List<Book> books) {
        for (Book book : books) {
            String status = book.isAvailable() ? "Disponível" : "Indisponível";
            System.out.println(String.format("%-12s | %-10s | %d | %dp | %s",
                    book.getTitle(), book.getAuthor(), book.getYear(), book.getNumberPage(), status));
        }
    }
}