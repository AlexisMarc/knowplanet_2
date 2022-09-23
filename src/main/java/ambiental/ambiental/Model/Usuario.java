package ambiental.ambiental.Model;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;

    @Pattern(regexp = "^[a-zA-ZÀ-ÿ\u00f1\u00d1]+(\s*[a-zA-ZÀ-ÿ\u00f1\u00d1]*)*[a-zA-ZÀ-ÿ\u00f1\u00d1]+$")
    @Column(name = "nombreUsuario",length = 30)
    private String nombreUsuario;

    @Pattern(regexp = "^[a-zA-ZÀ-ÿ\u00f1\u00d1]+(\s*[a-zA-ZÀ-ÿ\u00f1\u00d1]*)*[a-zA-ZÀ-ÿ\u00f1\u00d1]+$")
    @Column(name = "apellidoUsuario",length = 30)
    private String apellidoUsuario;

    @Email(message = "Email no válido", regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
    @NotEmpty(message = "Email no puede estar vacío")
    @Column(name = "emailUsuario", length = 70)
    private String emailUsuario;

    @Pattern(regexp = "^[a-zA-ZÀ-ÿ\u00f1\u00d1]+(\s*[a-zA-ZÀ-ÿ\u00f1\u00d1]*)*[a-zA-ZÀ-ÿ\u00f1\u00d1]+$")
    @NotEmpty
    @Column(name = "rolUsuario", length = 20)
    private String rolUsuario = "USUARIO";

    @NotEmpty
    @Column(name = "claveUsuario", length = 200)
    private String claveUsuario;

    @Column(name="estadoUsuario")
    private boolean estadoUsuario ;

    @OneToMany(mappedBy = "idUsuarioFK", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Publicacion> publicacion;
    //----------------------------------CONSTRUCTORES--------------------------------//

    public Usuario(Integer idUsuario, String nombreUsuario, String apellidoUsuario, String emailUsuario, String rolUsuario, String claveUsuario, boolean estadoUsuario, List<Publicacion> publicacion) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.emailUsuario = emailUsuario;
        this.rolUsuario = rolUsuario;
        this.claveUsuario = claveUsuario;
        this.estadoUsuario = estadoUsuario;
        this.publicacion = publicacion;
    }

    public Usuario(String nombreUsuario, String apellidoUsuario, String emailUsuario, String rolUsuario, String claveUsuario, boolean estadoUsuario, List<Publicacion> publicacion) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.emailUsuario = emailUsuario;
        this.rolUsuario = rolUsuario;
        this.claveUsuario = claveUsuario;
        this.estadoUsuario = estadoUsuario;
        this.publicacion = publicacion;
    }

    public Usuario() {
    }

    public Usuario(String emailUsuario, String claveUsuario) {
        this.emailUsuario = emailUsuario;
        this.claveUsuario = claveUsuario;
    }
    //----------------------------------MÉTODOS ACCESORES--------------------------------//

  

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }


    public String getEmailUsuario() {
        return emailUsuario;
    }
    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }
    public String getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public boolean isEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(boolean estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public List<Publicacion> getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(List<Publicacion> publicacion) {
        this.publicacion = publicacion;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }
}