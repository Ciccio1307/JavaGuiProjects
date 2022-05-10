
public class AutoVeGas extends Veicolo {
	private double pow;
	private int typeGas; //0 = GPL   1 = metano  
	
	public  AutoVeGas (String t, String ma, String mo, int i, int n, double p,int type)
	{
		super(t,ma,mo,i,n);
		pow=p;
		typeGas=type;
	}
	
	public  double calcTassa()
	{
		double t=0;
		int anno;
		anno=2020-getAnnImm();
		if(anno<5)
		{
			return t;
		}
		if (typeGas==0)
		{
			t=pow*0.75;
		}
		if (typeGas==1)
		{
			t=pow*0.5;
		}
		
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
		String tipo;
		if(typeGas==0)
		{
			tipo="GPL";
			
		}else
		{
			tipo="METANO";
		}
		return("AUTO A GAS "+tipo+" MARCA "+getMarca()+" TARGA "+getTarga()+" MODELLO "+" ANNO IMMATRICOLAZIONE "+getAnnImm()+" NUMERO PASSEGGERI ESCLUSO CONDUCENTE "+getNumPass()+" POTENZA SVILUPPATA "+ getPow()+" HP TASSE DA PAGARE ANNUALMENTE "+ calcTassa()+" EURO" );
	}
	
}
