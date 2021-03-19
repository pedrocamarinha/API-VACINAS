package vacina.projeto.CadastroVacina.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
public class Vacina {
	@NotBlank
	private String nome_vacina;
	@ManyToOne
	private Usuario usuario;
	@Id
	@GeneratedValue()
	private Long id_vacina;
	@JsonFormat(pattern = "dd/MM/yyyy")

	private LocalDate data_realizada = LocalDate.now();

	
	
	
	public Vacina() {
		
	}
	




	public Vacina(@NotBlank String nome_vacina, Usuario usuario, LocalDate data_realizada) {
		super();
		this.nome_vacina = nome_vacina;
		this.usuario = usuario;
		this.data_realizada = data_realizada;
	}





	public String getNome_vacina() {
		return nome_vacina;
	}




	public void setNome_vacina(String nome_vacina) {
		this.nome_vacina = nome_vacina;
	}




	public Usuario getUsuario() {
		return usuario;
	}




	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}




	public Long getId_vacina() {
		return id_vacina;
	}




	public void setId_vacina(Long id_vacina) {
		this.id_vacina = id_vacina;
	}




	public LocalDate getData_realizada() {
		return data_realizada;
	}




	public void setData_realizada(LocalDate data_realizada) {
		this.data_realizada = data_realizada;
	}
	

}
