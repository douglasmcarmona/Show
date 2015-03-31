/**
 * Classe de modelo - Jogadores
 */

class Jogador {
	
	// atributos
	private String strNome;
	private int numCodigo;
	private boolean blnLapide; // true = acessivel	false = inacessivel
	
	// construtores
	public Jogador() {
		this.strNome = "";
		this.numCodigo = 0;
		this.blnLapide = true;
	}
	
	public Jogador(int codigo) {
		this.strNome = "";
		this.numCodigo = codigo;
		this.blnLapide = true;
	}
	
	// gets e sets
	public String getNome() { return this.strNome; }
	public String getCodigo() { return this.numCodigo; }
	public String getLapide() { return this.blnLapide; }
	
	public void setNome(String nome) { this.strNome = nome; }
	public void setNome(int codigo) { this.numCodigo = codigo; }
	public void setNome(boolean lapide) { this.blnLapide = lapide; }
}
