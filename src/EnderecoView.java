import com.senac.SimpleJava.Console;

public class EnderecoView {

	public void execute(){
		
	}
	
	public void displayEndereco(Endereco endereco){
		Console.println("Cep: " + endereco.getCep());
		Console.println("Cidade: " + endereco.getCidade());
		Console.println("Bairro: " +endereco.getBairro());
		Console.println("Rua: " + endereco.getRua());
		Console.println("Numero: " +endereco.getNumero());
		Console.println("Complemento: " + endereco.getComplemento());
	}
	
	public Endereco criaEndereco(){
		String bairro, cidade, complemento, rua;
		int cep, numero;
		cep = Console.readInt("Cep: ");
		cidade = Console.readLine("Cidade: ");
		bairro = Console.readLine("Bairro: ");
		rua = Console.readLine("Rua: ");
		numero = Console.readInt("Numero: ");
		complemento = Console.readLine("Complemento: ");
		return new Endereco(bairro, cidade, complemento, rua, cep, numero);
	}
	
}
