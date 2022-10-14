package com.jhonatan.uxsolutions.feriados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "feriados", path = "feriados")
public interface FeriadosRepository extends JpaRepository<feriados, Long>{

}
