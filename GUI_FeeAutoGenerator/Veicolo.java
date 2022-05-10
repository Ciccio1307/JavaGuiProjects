
public abstract class Veicolo {
	private String targa;
	private String marca;
	private String modello;
	private int annImm;
	private int numPass;
	public abstract double calcTassa();
	public Veicolo(String t, String ma, String mo, int i, int n)
	{
		setTarga(t);
		setMarca(ma);
		setModello(mo);
		setAnnImm(i);
		setNumPass(n);
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAnnImm() {
		return annImm;
	}
	public void setAnnImm(int annImm) {
		this.annImm = annImm;
	}
	public int getNumPass() {
		return numPass;
	}
	public void setNumPass(int numPass) {
		this.numPass = numPass;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
}
