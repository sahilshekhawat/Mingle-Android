package evs.project.mingle;

/**
 * Created by DEEPANSHU on 30-11-2014.
 */

public class User {
    private String name;
    private int img_id;
    private String source;
    private String destination;
    public String getName() {
        return name;
    }
    public int getimgid() {
        return img_id;
    }
    public String getSource() {
        return source;
    }
    public String getDestination() {
        return destination;
    }
    public User(String name, int img_id, String source, String destination) {
        super();
        this.name = name;
        this.img_id = img_id;
        this.source = source;
        this.destination = destination;
    }


}
