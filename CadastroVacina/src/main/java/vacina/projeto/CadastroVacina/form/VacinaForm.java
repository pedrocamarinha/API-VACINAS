package vacina.projeto.CadastroVacina.form;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import vacina.projeto.CadastroVacina.model.Usuario;
import vacina.projeto.CadastroVacina.model.Vacina;
import vacina.projeto.CadastroVacina.repository.RepositorioUsuario;

public class VacinaForm {
	@NotBlank
	private String nome_vacina;
	@NotNull
	private Long idUsuario;

	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate data_realizada = LocalDate.now();

	public String getNome_vacina() {
		return nome_vacina;
	}

	public void setNome_vacina(String nome_vacina) {
		this.nome_vacina = nome_vacina;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public LocalDate getData_realizada() {
		return data_realizada;
	}

	public void setData_realizada(LocalDate data_realizada) {
		this.data_realizada = data_realizada;
	}

	public Vacina converter(RepositorioUsuario usuarioRepository) {

		Optional<Usuario> usuarioOp = usuarioRepository.findById(idUsuario);

		Usuario usuario = null;
		if (usuarioOp.isPresent()) {
			usuario = usuarioOp.get();
		}

		return new Vacina(nome_vacina, usuario, data_realizada);
	}

}
