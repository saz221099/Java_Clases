package org.cruiz.springcloud.msvc.usuarios.repositories;

import org.cruiz.springcloud.msvc.usuarios.models.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario,Long> {
    Usuario findFirstById(Integer id);
    Boolean existsByEmail(String Email);
}
