package ambiental.ambiental.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
// import javax.validation.constraints.NotNull;

@Entity
@Table(name = "imagen")
public class Imagen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idImagen;

    @Column(nullable = false)
    @NotEmpty
    private String urlImagen;

    @ManyToOne(fetch = FetchType.LAZY)
    // @NotNull
    private Publicacion publicacion;

    public Imagen() {
    }

    public Imagen(int idImagen, @NotEmpty String urlImagen, Publicacion publicacion) {
        this.idImagen = idImagen;
        this.urlImagen = urlImagen;
        this.publicacion = publicacion;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    
}
