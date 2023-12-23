package org.cruiz.springcloud.msvc.cursos.repository;

import org.cruiz.springcloud.msvc.cursos.entity.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Long> {
}
