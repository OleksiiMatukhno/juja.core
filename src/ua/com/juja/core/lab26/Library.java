package ua.com.juja.core.lab26;

import java.util.Arrays;

class Issue {
    private String name;
    private int countPages;

    public Issue(String name, int countPages) {
        this.name = name;
        this.countPages = countPages;
    }

    public String toPrint() {
        return "Issue{" +
                "name=" + name +
                ",countPages=" + countPages +
                "}";
    }

    @Override
    public String toString() {
        return toPrint();
    }

    public int getCountPages() {
        return countPages;
    }

    public String getName(){
        return name;
    }

}

class Journal extends Issue {
    private String yearJournal;
    private String numberJournal;

    public Journal(String nameJournal, int countPages, String yearJournal, String numberJournal) {
        super(nameJournal, countPages);
        this.yearJournal = yearJournal;
        this.numberJournal = numberJournal;
    }

    @Override
    public String toPrint() {
        return "Journal{" +
                "name=" + getName() +
                ",countPages=" + getCountPages() +
                ",year=" + yearJournal +
                ",number=" + numberJournal +
                "}";
    }
}

class Book extends Issue {

    private String authorBook;

    public Book(String name, int countPages, String authorBook) {
        super(name, countPages);
        this.authorBook = authorBook;
    }

    @Override
    public String toPrint() {
        return "Book{" +
                "name=" + getName() +
                ",countPages=" + getCountPages() +
                ",author=" + authorBook +
                "}";
    }
}

public class Library {

    public String printCatalog(Issue[] catalog) {
        StringBuilder builder = new StringBuilder();
        for (Issue item : catalog) {
            builder.append(item.toPrint());
        }
        return builder.toString();
        /*String result = "";
        for (int i = 0; i < catalog.length; i++) {
            result += catalog[i].toPrint();
        }
        for (Issue item : catalog) {
            result += item.toPrint();
        }
        return result;*/
    }
}