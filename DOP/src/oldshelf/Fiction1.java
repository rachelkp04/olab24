package oldshelf;

public class Fiction1 extends Book1 {

	private String name;
	private final FictionType type;
	
	
	public Fiction1(String title, FictionType type) {
        super(title);
        this.name = title; 
        this.type = type;  
    }
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FictionType getType() {
        return type;
    }

	public String toString() {
        return "Fiction{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

}
