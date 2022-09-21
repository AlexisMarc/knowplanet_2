package ambiental.ambiental.Service;

import ambiental.ambiental.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// -------------------------------------------------------------ANOTACIÓN REPOSITORIO----------------------------------------------------//

@Repository
// -------------------------------------------------------------JPA LIBRERIA HEREDADA POR LA INTERFAZ PARA USAR BD----------------------------------------------------//

public interface UsuarioValidacion extends JpaRepository<Usuario, Integer> {

    // -------------------------------------------------------------QUERY PERSONALIZADA QUE NOS DEVUELVE EL USUARIO SI EXISTE----------------------------------------------------//

    @Query( value = "SELECT * FROM usuario u WHERE u.email_usuario = ?1 AND u.clave_usuario = ?2",
            nativeQuery = true)
    public Usuario validacionUsuario(String emailUsuario, String claveUsuario);
}
