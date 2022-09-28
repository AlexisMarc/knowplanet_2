package ambiental.ambiental.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty
    private String categoria;

    private Boolean estado=true;

    @OneToMany(mappedBy = "categoria", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Publicacion> publicacion;

    public Categoria(int id, @NotEmpty String categoria, Boolean estado, List<Publicacion> publicacion) {
        this.id = id;
        this.categoria = categoria;
        this.estado = estado;
        this.publicacion = publicacion;
    }

    public Categoria() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public List<Publicacion> getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(List<Publicacion> publicacion) {
        this.publicacion = publicacion;
    }




    
}

