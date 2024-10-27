package oldshelf;

public class TextBook1 extends Book1 {

	private final String subject;
	
	public TextBook1(String title, String subject) {
        super(title);  
        this.subject = subject;  
	}
    
    public String getSubject() {
        return subject;
    }

	public String toString() {
        return "TextBook{" +
                "title='" + super.getTitle() + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

}
