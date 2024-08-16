package apps.discador.tocando;

public class AtenderLigacao implements CelularTocando{

	public void CelularTocando() {
		System.out.println("Celular tocando");
		
		
	}
	
	public void atender() {
		System.out.println("Atender a ligação");
	
	}
	
	public void correioDeVoz() {
		System.out.println("Você perdeu a ligação e tem uma nova mensagem no correrio de voz");
		
	}

}
