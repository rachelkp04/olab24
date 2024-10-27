package oldshelf;

public class OldSelection1 {

	
	public static String getAgeOrTitle(Object o) {
        if (o instanceof Book1) {
            if (o instanceof Comic1) {
                return ((Comic1) o).getTitle();
            } else if (o instanceof Fiction1) {
                return ((Fiction1) o).getName();
            } else if (o instanceof TextBook1) {
                return ((TextBook1) o).getSubject();
            }
        }
        return "";
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
