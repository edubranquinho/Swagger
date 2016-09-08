package br.com.oppy.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.oppy.model.Usuario;
import br.com.oppy.repository.Usuarios;

@RestController
public class UsuarioResource {

	@Autowired
	Usuarios usuarios;

	@RequestMapping(value = "/api/usuarios", method = RequestMethod.GET)
	public ResponseEntity<List<Usuario>> buscaUsuarios() {
		System.out.println("Buscando todos os usuarios");
		List<Usuario> todosUsuarios = usuarios.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(todosUsuarios);
	}

}
