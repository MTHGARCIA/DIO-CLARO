
public enum EstadosBrasileiro {
	SAO_PAULO ("SP","São Paulo"),
	RIO_JANEIRO ("RJ","Rio de Janeiro"),
	PIAUI ("PI", "PIauí"),
	MARANHAO ("MA","Maranhão"),
	CEARA("CE","Ceará")
	;
	
	private String nome;
	private String sigla;
	
	private EstadosBrasileiro(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
		
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
}

