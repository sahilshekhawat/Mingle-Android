package evs.project.mingle;

/**
 * Created by iiitd on 19/9/14.
 */
public class CustomObject {

    private String name;
    private String text;
    private String time;

    public CustomObject(String name, String text, String time) {
        this.name = name;
        this.text = text;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public String getTime(){
        return time;
    }
}
