package newshelf;

public record Comic2(String title, int ageOfMainCharacter) implements IBook {
    @Override
    public String getTitle() {
        return title;
    }
}
