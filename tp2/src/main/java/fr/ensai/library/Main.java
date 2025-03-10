package fr.ensai.library;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Author tolkien = new Author("J.R.R. Tolkien");

        Book fellowshipOfTheRing = new Book(
                "978-0-618-26025-6",
                "The Fellowship of the Ring",
                tolkien,
                1954,
                423);

        System.out.println(fellowshipOfTheRing.toString());

        Library library = new Library("My Library", new ArrayList<>());
        library.loadBooksFromCSV("books.csv");
        library.addIem(fellowshipOfTheRing);
        Magazine magazine1 = new Magazine("1774-7201", "Closer", "1030", 2025, 50);
        Magazine magazine2 = new Magazine("0397-1635", "Paris-Match", "892", 2021, 83);
        library.addIem(magazine1);
        library.addIem(magazine2);
        library.displayItems();
    }
}