
public class ListaPessoas {

	private static Pessoa [] pessoas = new Pessoa[10];
	private static int quantidadePessoas = 0;
	
	public static void addPessoa(Pessoa pessoa){
		pessoas[quantidadePessoas] = pessoa;
		PessoaView.displayPessoa(pessoas[0]);
		quantidadePessoas++;
	}
	
	public void removePessoa(Pessoa pessoa){
		
		
		quantidadePessoas--;
	}
	
	public Pessoa getPessoa(int index){
		return pessoas[index];
	}
	
}
