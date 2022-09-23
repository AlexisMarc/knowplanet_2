package ambiental.ambiental.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name="descripcion")
public class descripcion {
    @Id
    private int iddes;

    @Column(length = 15000)
    @NotEmpty
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    private Publicacion publicacion;
    
    public descripcion(){

    }
    
    public descripcion( @NotEmpty String descripcion, Publicacion publicacion) {
        this.descripcion = descripcion;
        this.publicacion = publicacion;
    }
    
    public descripcion(int iddes, @NotEmpty String descripcion, Publicacion publicacion) {
        this.iddes = iddes;
        this.descripcion = descripcion;
        this.publicacion = publicacion;
    }

    public int getIddes() {
        return iddes;
    }

    public void setIddes(int iddes) {
        this.iddes = iddes;
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
