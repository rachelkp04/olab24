package newshelf;

public record TextBook2(String title, String subject) implements IBook {
    @Override
    public String getTitle() {
        return title;
    }
}
