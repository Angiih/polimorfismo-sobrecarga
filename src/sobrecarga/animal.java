package sobrecarga;

public abstract class animal {

	protected float peso;
	protected int idade;
	protected int membro;
	
	public abstract void emititSom();

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getMembro() {
		return membro;
	}

	public void setMembro(int membro) {
		this.membro = membro;
	}

	
	
}
