package rebecasarai.github.com.exercisescatalog;

/**
 * Created by rsgonzalez on 16/10/2017.
 */

public class Repository {
    private String url, nombre;

    public Repository(String url, String nombre) {
        this.url = url;
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
