package newshelf;

import oldshelf.FictionType;

public class NewSelection {
	public static String getAgeOrTitle(Object o) {
        if (o instanceof IBook book) {
            if (o instanceof Comic2 comic) {
                return comic.title();
            } else if (o instanceof Fiction2 fiction) {
                return fiction.name();
            } else if (o instanceof TextBook2 textBook) {
                return textBook.subject();
            }
        }
        return "";
    }

	public static void main(String[] args) {
        // Test cases for NewSelection
        Comic2 comic = new Comic2("Superman", 30);
        Fiction2 fiction = new Fiction2("The Hobbit", "Bilbo", FictionType.Fantasy);
        TextBook2 textBook = new TextBook2("Physics", "Science");

        System.out.println("Comic Title: " + getAgeOrTitle(comic));      // Should print the title of the Comic
        System.out.println("Fiction Name: " + getAgeOrTitle(fiction));   // Should print the name of the Fiction
        System.out.println("TextBook Subject: " + getAgeOrTitle(textBook)); // Should print the subject of the TextBook

        // Testing with an object that's not a book
        String nonBook = "Not a Book";
        System.out.println("Non-book object: " + getAgeOrTitle(nonBook)); // Should return empty string
    }
}