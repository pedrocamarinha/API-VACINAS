package vacina.projeto.CadastroVacina.control;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vacina.projeto.CadastroVacina.form.UsuarioForm;
import vacina.projeto.CadastroVacina.model.Usuario;
import vacina.projeto.CadastroVacina.repository.RepositorioUsuario;

@RestController
@RequestMapping("/usuario")
public class controleUsuario {

	@Autowired
	private RepositorioUsuario repositorioUser;

	@Transactional
	@PostMapping
	public ResponseEntity<Usuario> cadastrar(@RequestBody @Valid UsuarioForm usuarioForm) {

		System.out.println(usuarioForm.getNome());
		
		
		Usuario usuario = usuarioForm.converter();

		repositorioUser.save(usuario);
		return ResponseEntity.created(null).body(usuario);
	}

}
