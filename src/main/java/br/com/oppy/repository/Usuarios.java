package br.com.oppy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.oppy.model.Usuario;

@Repository
public interface Usuarios extends JpaRepository<Usuario, String> {

}
