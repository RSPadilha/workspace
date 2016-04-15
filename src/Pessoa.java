import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {

	private String nome, sobrenome; 
	private LocalDate dataNascimento;
	
	public Pessoa(String nome, String sobrenome, LocalDate dataNascimento){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
	}

	public String getNomeCompleto(){
		return nome + " " + sobrenome;
	}
	
	public int getIdade(){
		LocalDate hoje = LocalDate.now();
		long diferencaAnos = ChronoUnit.YEARS.between(dataNascimento, hoje);
		return (int) diferencaAnos;
		}
	
	public LocalDate getDataNascimento(){
		return dataNascimento;
	}
	
}
