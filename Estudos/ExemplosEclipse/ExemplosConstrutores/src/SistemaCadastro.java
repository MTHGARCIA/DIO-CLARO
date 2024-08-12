
public class SistemaCadastro {

	public static void main(String[] args) {
		
		
		Pessoa marcos = new Pessoa("1234", "Matheus");
		
		marcos.setEndereco("Rua Das Marias");
		
		System.out.println(marcos.getNome() + " - " + marcos.getCpf());
	}

}
