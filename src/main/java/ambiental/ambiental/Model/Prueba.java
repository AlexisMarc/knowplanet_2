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
@Table(name="Prueba")
public class Prueba {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty    
    private String pregunta;
    @NotEmpty    
    private String imagen;
    @NotEmpty    
    @Column( length=1000)
    private String respuesta;
    @NotEmpty
    private Boolean estado;

    @ManyToOne(fetch = FetchType.LAZY)
    private Publicacion publicacion;
    
    public Prueba() {
    }

    public Prueba(Integer id, @NotEmpty String pregunta, @NotEmpty String imagen,
            @NotEmpty String respuesta, @NotEmpty Boolean estado, Publicacion publicacion) {
        this.id = id;
        this.pregunta = pregunta;
        this.imagen = imagen;
        this.respuesta = respuesta;
        this.estado = estado;
        this.publicacion = publicacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    
}