package apps.reprodutor.musica;

public  class TocandoMusica  implements Musica{
	
	
	public void tocarMusica() {
		System.out.println("Tocando Musica");
		
	}
	public void pausarMusica() {
		System.out.println("Musica Pausada");
		
	}
	
	public void selecionarMusica() {
		System.out.println("Selecionando Musica");
	}
}
