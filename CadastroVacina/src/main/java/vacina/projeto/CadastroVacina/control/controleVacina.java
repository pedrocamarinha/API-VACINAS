package vacina.projeto.CadastroVacina.control;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vacina.projeto.CadastroVacina.form.VacinaForm;
import vacina.projeto.CadastroVacina.model.Vacina;
import vacina.projeto.CadastroVacina.repository.RepositorioUsuario;
import vacina.projeto.CadastroVacina.repository.RepositorioVacina;

@RestController
@RequestMapping("/vacina")
public class controleVacina {

	@Autowired
	private RepositorioVacina repositorioVacina;
	
	@Autowired
	private RepositorioUsuario repositorioUsuario;

	@Transactional
	@PostMapping
	public ResponseEntity<Vacina> cadastrar(@RequestBody @Valid VacinaForm vacinaForm) {

		
		
		
		Vacina vacina = vacinaForm.converter(repositorioUsuario);

		repositorioVacina.save(vacina);
		return ResponseEntity.created(null).body(vacina);
	}

}