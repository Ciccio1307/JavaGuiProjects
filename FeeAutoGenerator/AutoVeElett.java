
public class AutoVeElett extends Veicolo {
	private double pow;
	public  AutoVeElett (String t, String ma, String mo, int i, int n, double p)
	{
		super(t,ma,mo,i,n);
		setPow(p);
		
	}
	public  double calcTassa()
	{
		return 0;
		
		
	}
	public double getPow() {
		return pow;
	}
	public void setPow(double pow) {
		this.pow = pow;
	}
	public String toString()
	{
		return("AUTO ELETTRICA  "+"MARCA "+getMarca()+" TARGA "+getTarga()+" MODELLO "+" ANNO IMMATRICOLAZIONE "+getAnnImm()+" NUMERO PASSEGGERI ESCLUSO CONDUCENTE "+getNumPass()+" POTENZA SVILUPPATA "+ getPow()+" HP NESSUNA TASSA DA PAGARE ANNUALMENTE  " );
	}
}
