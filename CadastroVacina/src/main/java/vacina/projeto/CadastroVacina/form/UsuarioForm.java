package vacina.projeto.CadastroVacina.form;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

import vacina.projeto.CadastroVacina.model.Usuario;

public class UsuarioForm {
	@NotBlank
	private String nome;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	private String cpf;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataNascimento;

	public UsuarioForm() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Usuario converter() {
		return new Usuario(nome, email, cpf, dataNascimento);
	}

}
