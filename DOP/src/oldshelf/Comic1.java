package oldshelf;

public class Comic1 extends Book1 {

    private final int ageOfMainCharacter;

    // Constructor without age
    public Comic1(String title) {
        super(title);
        this.ageOfMainCharacter = 0;
    }
    
    // Constructor with age
    public Comic1(String title, int ageOfMainCharacter) {
        super(title);
        this.ageOfMainCharacter = ageOfMainCharacter;
    }

    // Override toString to add comic-specific details
    @Override
    public String toString() {
        return super.toString() + // call to superclass's toString
                "\nType: Comic" +
                "\nAge Of Main Character: " + ageOfMainCharacter;
    }

    // Override hashCode
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (title != null ? title.hashCode() : 0); // Use title's hashCode if it's not null
        result = 31 * result + ageOfMainCharacter;
        return result;
    }

    // Override equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comic1 comic = (Comic1) o;

        if (ageOfMainCharacter != comic.ageOfMainCharacter) return false;
        return title != null ? title.equals(comic.title) : comic.title == null;
    }
}
