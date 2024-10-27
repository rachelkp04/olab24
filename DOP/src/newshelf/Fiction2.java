package newshelf;
import oldshelf.FictionType;


public record Fiction2(String title, String name, FictionType type) implements IBook {
    @Override
    public String getTitle() {
        return title;
    }
}
