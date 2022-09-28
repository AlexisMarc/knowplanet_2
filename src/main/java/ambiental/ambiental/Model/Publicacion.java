package ambiental.ambiental.Model;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "publicacion")
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPublicacion;
    @NotEmpty
    private String titulo;
    @NotEmpty
    @Column(length = 12)
    private String fecha;
    @NotNull
    private Boolean Estado=false;

    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario idUsuarioFK;

    @OneToMany(mappedBy = "publicacion", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Imagen> imagen;

    @OneToMany(mappedBy = "publicacion", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Descripcion> descripcion;

    @OneToMany(mappedBy = "publicacion", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Prueba> prueba;

    @ManyToOne(fetch = FetchType.LAZY)
    private Categoria categoria;

    public Publicacion() {
    }

    

    public Publicacion(int idPublicacion, @NotEmpty String titulo, @NotEmpty String fecha, @NotNull Boolean estado,
            Usuario idUsuarioFK, List<Imagen> imagen, List<Descripcion> descripcion, List<Prueba> prueba,
            Categoria categoria) {
        this.idPublicacion = idPublicacion;
        this.titulo = titulo;
        this.fecha = fecha;
        Estado = estado;
        this.idUsuarioFK = idUsuarioFK;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.prueba = prueba;
        this.categoria = categoria;
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

    public List<Descripcion> getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(List<Descripcion> descripcion) {
        this.descripcion = descripcion;
    }



    public List<Prueba> getPrueba() {
        return prueba;
    }



    public void setPrueba(List<Prueba> prueba) {
        this.prueba = prueba;
    }



    public Categoria getCategoria() {
        return categoria;
    }



    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    
    
}
