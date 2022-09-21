package ambiental.ambiental.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "publicacion")
public class Publicacion {
    @Id
    private int idPublicacion;
    @NotEmpty
    private String titulo;
    @NotEmpty
    @Column(length = 12)
    private String fecha;
    @NotNull
    private Boolean Estado;

    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario idUsuarioFK;

    @OneToMany(mappedBy = "publicacion", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Imagen> imagen;

    @OneToMany(mappedBy = "publicacion", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<descripcion> descripcion;

    public Publicacion() {
    }

    public Publicacion(int idPublicacion, @NotEmpty String titulo, @NotEmpty String fecha, @NotNull Boolean estado,
            Usuario idUsuarioFK, List<Imagen> imagen, List<ambiental.ambiental.Model.descripcion> descripcion) {
        this.idPublicacion = idPublicacion;
        this.titulo = titulo;
        this.fecha = fecha;
        Estado = estado;
        this.idUsuarioFK = idUsuarioFK;
        this.imagen = imagen;
        this.descripcion = descripcion;
    }

    public int getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(int idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Boolean getEstado() {
        return Estado;
    }

    public void setEstado(Boolean estado) {
        Estado = estado;
    }

    public Usuario getIdUsuarioFK() {
        return idUsuarioFK;
    }

    public void setIdUsuarioFK(Usuario idUsuarioFK) {
        this.idUsuarioFK = idUsuarioFK;
    }

    public List<Imagen> getImagen() {
        return imagen;
    }

    public void setImagen(List<Imagen> imagen) {
        this.imagen = imagen;
    }

    public List<descripcion> getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(List<descripcion> descripcion) {
        this.descripcion = descripcion;
    }

    
    
}
