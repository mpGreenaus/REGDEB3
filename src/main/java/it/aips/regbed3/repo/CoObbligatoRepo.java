package it.aips.regbed3.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import it.aips.regbed3.entity.CoObbligato;

public interface  CoObbligatoRepo extends JpaRepository<CoObbligato, Long>{

	 //Optional<CoObbligato> findByCUAA(String cUAA); è OK manca DB e la config

}
