package pckg_coll_2;

public class Robot {

    private int id;
    private String description;
    private static int cntID = 100;

    public Robot(String desc){
        this.id = cntID++;
        this.description = desc;

    }


    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
