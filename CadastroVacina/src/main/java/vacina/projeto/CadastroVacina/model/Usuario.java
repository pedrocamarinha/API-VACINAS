package vacina.projeto.CadastroVacina.model;

import java.time.LocalDate;
import javax.validation.constraints.Past;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity

public class Usuario {
	@NotBlank
	private String nome;
	@NotBlank
	@Email
	@Column(unique=true)
	private String email;
	@NotBlank
	@Column(unique=true)
	private String cpf;
	@Past
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataNascimento;


	@Id
	@GeneratedValue()
	private Long id;

	public Usuario() {

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario(@NotBlank String nome, @NotBlank @Email String email, @NotBlank String cpf,
			LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	
}
