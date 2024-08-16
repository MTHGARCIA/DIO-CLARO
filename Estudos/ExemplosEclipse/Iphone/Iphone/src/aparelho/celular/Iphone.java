package aparelho.celular;

import apps.discador.Discando;
import apps.discador.tocando.AtenderLigacao;
import apps.navegador.Navegador;
import apps.reprodutor.musica.TocandoMusica;

public class Iphone  {
	public static void main(String[] args) {
		
		Discando ligacao = new Discando();
		Navegador navegar = new Navegador();
		TocandoMusica musica = new TocandoMusica();
		AtenderLigacao atender = new AtenderLigacao();
	
		musica.tocarMusica();
		musica.pausarMusica();
		musica.selecionarMusica();
		
		
		atender.atender();
		atender.correioDeVoz();
		
		ligacao.discando();
		ligacao.ligar();
		ligacao.iniciarCorreioVoz();
		
		navegar.navegando();
		navegar.adicionarNovaAba();
		navegar.atualizandoPagina();
	

	}
}
