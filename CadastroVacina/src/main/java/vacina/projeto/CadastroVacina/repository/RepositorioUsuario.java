package vacina.projeto.CadastroVacina.repository;

import javax.validation.constraints.NotNull;

import org.springframework.data.repository.CrudRepository;

import vacina.projeto.CadastroVacina.model.Usuario;
import java.util.Optional;

public interface RepositorioUsuario extends CrudRepository<Usuario,Long> {

	Optional<Usuario> findById(@NotNull Long idUsuario);

	
	
}
