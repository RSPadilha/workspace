
public class Endereco {

	private String bairro, cidade, complemento, rua;
	private int cep, numero;
	
	public Endereco(String bairro, String cidade, String complemento, String rua, int cep, int numero) {
		this.bairro = bairro;
		this.cidade = cidade;
		this.complemento = complemento;
		this.rua = rua;
		this.cep = cep;
		this.numero = numero;
	}
	//uml do rafael errado?(sem getters)

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getRua() {
		return rua;
	}

	public int getCep() {
		return cep;
	}

	public int getNumero() {
		return numero;
	}

}
