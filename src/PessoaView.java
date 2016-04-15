import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import com.senac.SimpleJava.Console;

public class PessoaView {

	public static void execute(){
		ListaPessoas.addPessoa(criaPessoa());
	}
	
	public static void displayPessoa(Pessoa pessoa){
		Console.println("Nome completo: " + pessoa.getNomeCompleto());
		Console.println("Data de Nascimento: " + pessoa.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Console.println("Idade: " + pessoa.getIdade());
	}
	
	public static Pessoa criaPessoa(){
		String nome, sobrenome;
		String [] dataNascimentoString;
		LocalDate dataNascimento;
		int dia, mes, ano;
		nome = Console.readLine("Nome: ");
		sobrenome = Console.readLine("Sobrenome: ");
		dataNascimentoString = Console.readLine("Data Nascimento(dd/mm/aaaa): ").split("/");
		/*DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MMM-dd");
		 LocalDate dt = dtf.parseLocalDate(yourinput);*/ //TESTAR
		//ou LocalDate date = LocalDate.parse("2005-nov-12", formatter);
		dia = Integer.parseInt(dataNascimentoString[0]);
		mes = Integer.parseInt(dataNascimentoString[1]);
		ano = Integer.parseInt(dataNascimentoString[2]);
		dataNascimento = LocalDate.of(ano, mes, dia);
		return new Pessoa(nome, sobrenome, dataNascimento);
	}
}
