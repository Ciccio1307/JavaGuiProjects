
public class AutoVeIdro extends Veicolo {
	private double pow;
	public  AutoVeIdro (String t, String ma, String mo, int i, int n, double p)
	{
		super(t,ma,mo,i,n);
		pow=p;
		
	}
	public  double calcTassa()
	{
		double t=0;
		double anno;
		anno=2020-getAnnImm();
		if(anno==1)
		{
			return t;
		}
		anno=anno-1;
		anno=anno*0.1;
		t=pow*anno;
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
		return("AUTO A GAS 	IDROGENO  "+"MARCA "+getMarca()+" TARGA "+getTarga()+" MODELLO "+" ANNO IMMATRICOLAZIONE "+getAnnImm()+" NUMERO PASSEGGERI ESCLUSO CONDUCENTE "+getNumPass()+" POTENZA SVILUPPATA "+ getPow()+" HP TASSE DA PAGARE ANNUALMENTE "+ calcTassa()+" EURO" );
	}
	
	
	}
	

