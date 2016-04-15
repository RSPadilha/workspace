
public class ListaEnderecos {

	private Endereco [] enderecos = new Endereco[10];
	private int quantidadeEnderecos = 0;
	
	public void addEndereco(Endereco endereco){
		enderecos[quantidadeEnderecos] = endereco;
		quantidadeEnderecos++;
	}
	
	public void removeEndereco(Endereco endereco){
		for (int i = 0; i < quantidadeEnderecos; i++) {
			if(endereco == enderecos[i]){
				enderecos[i] = enderecos[i+1];
			}//outofbounds????
		}
		quantidadeEnderecos--;
	}
	
	public Endereco getEndereco(int index){
		return enderecos[index];
	}
	
}
