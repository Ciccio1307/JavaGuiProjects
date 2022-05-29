package ese4CinfJAVAvisu;

public class Pila {
	private int a[] = new int[1000];
	private int dimensione=0;
	private int stackPointer=-1; //posizione ultimo elemento
	private boolean statusFlag=true;
	
	public Pila(int dimensione)
	{
		this.dimensione=dimensione;
	}
	
	public int getDimensione ()
	{
		return dimensione;
	}
	
	public void setDimensione (int dimensione)
	{
		this.dimensione=dimensione;
	}
	
	public void push (int n)
	{
		if (free()>0)
		{
			stackPointer++;
			a[stackPointer] = n;
			statusFlag=true;
		}
		else {
			statusFlag=false;
		}
	}

	public int pop ()
	{
		if (busy()>0)
		{
			statusFlag=true;
			stackPointer--;
			return a[stackPointer+1];
		}
		else
		{
			statusFlag=false;
			return -1;
		}
	}
	// elementi presenti nello stack
	public int busy() 
	{
		return stackPointer+1;
	}
	
	// elementi liberi
	public int free() 
	{
		return dimensione-(stackPointer+1);
	}
	
	boolean fail() 
	{
		return !statusFlag;
	}
	public String toString()
	{
		return "Array di "+dimensione+" elementi. "+busy()+" elementi occupati. "+free()+" elementi liberi.";
	}
	public String list()
	{
		String s="Contenuto lista:\n";
		for (int i=0; i<busy(); i++)
			s=s+a[i]+" ";
		s=s+"\n***************\n";
		return s;
	}
}