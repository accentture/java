package FromJavascriptToJava.Arrays;

import org.json.JSONObject;

import java.util.*;

public class SortArrays {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();

        Book book1 = new BookImplementation("The Telling", "Ursula K. Le_Guin");
        Book book2 = new BookImplementation("Harry Potter", "Harry Potter");
        Book book3 = new BookImplementation("Frankenstein; or, The Modern Prometheus", "Mary Shelley");
        Book book4 = new BookImplementation("Frankenstein; or, The Modern Prometheus", "Mary Shelley");
        Book book5 = new BookImplementation("Warcross", "Marie Lu");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        Collections.sort(books ,(b1, b2) -> {
            int result = b1.name.compareTo(b2.name);
            System.out.println("------result" + result);
            return result;

        });
        System.out.println("------books " + books.toString());

        String[] names = {"Zeus", "Alejandro", "Mariano", "Beto", "Hugo"};
        int[] nums = { 99, 23, 66, 98, 23,76, 1, 7};
        Arrays.sort(names);
        Arrays.sort(nums);

        System.out.println("names : " + Arrays.toString(names));
        System.out.println("nums : " + Arrays.toString(nums));
    }

}
