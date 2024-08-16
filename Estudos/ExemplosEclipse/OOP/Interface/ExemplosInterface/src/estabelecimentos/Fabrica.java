package estabelecimentos;


import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.Multifuncional.EquipamentoMultifuncional;
import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.Deskjet;

public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		//Deskjet deskjet = new Deskjet();
		//Scanner scanner = new Scanner();
		
		
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		
		copiadora.copiar();
		digitalizadora.digitalizar();
		impressora.imprimir();
	}
}
