
public class AutoveTrad extends Veicolo {
	private double pow;
	public AutoveTrad(String t, String ma, String mo, int i, int n, double p)
	{
		super(t,ma,mo,i,n);
		setPow(p);
	}
	public  double calcTassa()
	{
		double t=0;
		t=pow*2.5;
		return t;
	}
	public double getPow() {
		return pow;
	}
	public void setPow(double pow) {
		this.pow = pow;
	}
	public String toString()
	{
		return("AUTO A GASOLIO O BENZINA  "+"MARCA "+getMarca()+" TARGA "+getTarga()+" MODELLO "+" ANNO IMMATRICOLAZIONE "+getAnnImm()+" NUMERO PASSEGGERI ESCLUSO CONDUCENTE "+getNumPass()+" POTENZA SVILUPPATA "+ getPow()+" HP TASSE DA PAGARE ANNUALMENTE "+ calcTassa()+" EURO" );
	}
}
