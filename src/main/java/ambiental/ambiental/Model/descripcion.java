package ambiental.ambiental.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "descripcion")
public class descripcion {
    @Id
    private int id;

    @NotEmpty
    private String descripcion;
    @ManyToOne(fetch = FetchType.LAZY)
    private Publicacion publicacion;
    public descripcion() {
    }
    public descripcion(int id, @NotEmpty String descripcion, Publicacion publicacion) {
        this.id = id;
        this.descripcion = descripcion;
        this.publicacion = publicacion;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Publicacion getPublicacion() {
        return publicacion;
    }
    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }


    
}
