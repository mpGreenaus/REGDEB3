package it.aips.regbed3.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.aips.regbed3.entity.Soggetto;

public interface  SoggettoRepo extends JpaRepository<Soggetto, Long>{

	//Optional<Soggetto> findByCUAA(String cUAA);  //è OK manca DB e configurazioni

}
