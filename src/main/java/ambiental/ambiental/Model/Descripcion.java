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

@Entity
@Table(name="descripcion")
public class Descripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iddes;

    @Column(length = 15000)
    @NotEmpty
    private String descripcion;

    private Integer tipo;

    @ManyToOne(fetch = FetchType.LAZY)
    private Publicacion publicacion;
    
    public Descripcion(){

    }
    


    public Descripcion(int iddes, @NotEmpty String descripcion, Integer tipo, Publicacion publicacion) {
        this.iddes = iddes;
        this.descripcion = descripcion;
        this.tipo = tipo;
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



    public Integer getTipo() {
        return tipo;
    }



    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }
    

    
}
