package oldshelf;

public class OldSelection1 {

	
	public static String getAgeOrTitle(Object o) {
        return switch (o) {
            case Comic1 comic -> comic.getTitle();
            case Fiction1 fiction -> fiction.getName();
            case TextBook1 textBook -> textBook.getSubject();
            case Book1 book -> "";  // Covers any other `Book1` type, if needed
            default -> "";          // Covers cases where `o` is not a `Book1`
        };
    }
    

	public static void main(String[] args) {
        
        Comic1 comic = new Comic1("Superman", 30);
        Fiction1 fiction = new Fiction1("The Hobbit", FictionType.Fantasy);
        TextBook1 textBook = new TextBook1("Physics", "Science");

        System.out.println("Comic Title: " + getAgeOrTitle(comic));      
        System.out.println("Fiction Name: " + getAgeOrTitle(fiction));   
        System.out.println("TextBook Subject: " + getAgeOrTitle(textBook)); 

        String nonBook = "Not a Book";
        System.out.println("Non-book object: " + getAgeOrTitle(nonBook)); 
    }

}
