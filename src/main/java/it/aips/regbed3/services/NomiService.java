package it.aips.regbed3.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.aips.regbed3.entity.Nomi;
import it.aips.regbed3.repo.NomiRepo;

@Service
public class NomiService {

    @Autowired
    private NomiRepo nomiRepo;
    
    public List<Nomi> getNomi() {
    	//questa lista è dabuttare perchè funge da mock per la interrogazione sql
    	List<Nomi> ln=new ArrayList<>();
    	Nomi nm=new Nomi();
    	nm.setId(1L);
    	nm.setNome("gigi");
    	ln.add(nm);
    	nm=new Nomi();
    	nm.setId(2L);
    	nm.setNome("gianna");    	
    	ln.add(nm);
    	return ln; 
    }
}
