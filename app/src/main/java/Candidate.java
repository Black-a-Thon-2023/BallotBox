import java.util.ArrayList;

public class Candidate {
    private String name;
    private String party;
    private String image;
    private ArrayList<String> topic = new ArrayList<>();

    public String getName() {
        return name;
    }
    public String getParty() {
        return party;
    }
    public String getImage() {
        return image;
    }
    public ArrayList<String> getTopic() {
        return topic;
    }
}
