package newshelf;

import oldshelf.FictionType;

public class NewSelection {
	// public static String getAgeOrTitle(Object o) {
    //     return switch (o) {
    //         case Comic2 comic when comic.title() != null -> comic.title();
    //         case Fiction2 fiction when fiction.name() != null -> fiction.name();
    //         case TextBook2 textBook when textBook.subject() != null -> textBook.subject();
    //         case IBook book -> "";  // General fallback for IBook types if needed
    //         default -> "";          // For objects that aren't IBook instances
    //     };
    // }

    public static String getAgeOrTitle(Object o) {
        return switch (o) {
            case Comic2(String title, int age) when title != null -> title;
            case Fiction2(String title, String name, FictionType type) when name != null -> name;
            case TextBook2(String title, String subject) when subject != null -> subject;
            case IBook book -> ""; // Fallback for other IBook types
            default -> "";         // Fallback for non-IBook types
        };
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