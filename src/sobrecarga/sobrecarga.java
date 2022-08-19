package sobrecarga;

public class sobrecarga {

	public static void main(String[] args) {
		// Programa princiapal
		lobo lobi = new lobo();
        lobi.emititSom();
        cachorro dog = new cachorro();
        dog.emititSom();
        
        dog.reagir(2,12.5f);
        dog.reagir(17,4.5f);
	}

}
