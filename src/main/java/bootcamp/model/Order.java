package bootcamp.model;

public class Order {

    private final long id;
    private final String content;

    public Order(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    
    public String getMoreStuff() {
    	return "All these things";
    }
}