package rebecasarai.github.com.exercisescatalog;


public class Exercises {
    private String name;
    private String descrip;
    private int thumbnail;

    public Exercises() {
    }

    public Exercises(String name, String descrip, int thumbnail) {
        this.name = name;
        this.descrip = descrip;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
