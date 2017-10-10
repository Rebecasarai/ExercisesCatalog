package rebecasarai.github.com.exercisescatalog;


import android.content.Intent;

public class Exercises {
    private String name;
    private String descrip;
    private int thumbnail;
    private Intent execIntent;

    public Exercises() {
    }

    public Exercises(String name, String descrip, int thumbnail, Intent execIntent) {
        this.name = name;
        this.descrip = descrip;
        this.thumbnail = thumbnail;
        this.execIntent = execIntent;
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

    public Intent getExecIntent() {
        return execIntent;
    }

    public void setExecIntent(Intent execIntent) {
        this.execIntent = execIntent;
    }
}
