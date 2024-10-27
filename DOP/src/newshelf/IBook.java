package newshelf;

public sealed interface IBook permits Comic2, Fiction2, TextBook2 {
    String getTitle();
}