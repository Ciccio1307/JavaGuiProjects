import java.time.*;
public class DataDiCalendario {
	private short mese,anno,giorno;
	private String stringa;
	private String gDs[]= {"giovedi'","venerdi'","sabato","domenica","lunedi","martedi'","mercoledi'"};
	private String ar[]={"Gennaio","Febbraio","Marzo","Aprile","Maggio","Giugno","Luglio","Agosto","Settembre","Ottobre","Novembre","Dicembre"};
	private String g[]= {"Sabato","Domenica","Lunedì","Martedì","Mercoledì","Giovedì","Venerdì"};
	private short gg[]={/*gennaio */ (short)31, /*febbraio */(short)28,/*marzo */(short)31, /*aprile */(short)30,/*maggio */(short)31,/*giugno */(short)30,/*luglio */(short)31,/*agosto */(short)31,/*settembre */(short)30,/*ottobre */(short)31,/*novembre */(short)30,/*dicembre */(short)31};
	
	
	public DataDiCalendario(short m,short a,short g)
	{
		mese=m;
		anno=a;
		giorno=g;
	}
	public DataDiCalendario(String s)
	{
		stringa=s;
	}
	public void setMese(short a )
	{
		mese=a;
	}
	public void setAnno(short a )
	{
		anno=a;
	}
	public void setGiorno(short a )
	{
		giorno=a;
	}
	public short getMese( )
	{
		return mese;
	}
	public short getAnno( )
	{
		return anno;
	}
	public short getGiorno( )
	{
		return giorno;
	}
	public String toString()
	{
		return (giorno+" / "+mese+" / "+anno );
	}
	
	public boolean bis()
	{
		if(anno%400==0 || (anno%100>0 && anno%4==0))
		{
		return false;	
		}else {
			return true;
		
	}
	}
	
		public short dateDifference(DataDiCalendario inizio, DataDiCalendario finale)
		{
			
			boolean c;
			short dayI=0;
			short dayF=0;
			for(short i=0; i<(inizio.getAnno())-1;i++)
			{
				c=inizio.bis();
				if(c==true && inizio.getAnno()!=0 )
				{
					dayI=(short) (dayI+366);
				}else {
					dayI=(short) (dayI+365);
				}
				
			}
			for(short i=0; i<(inizio.getMese()-1);i++)
			{
				if(inizio.getMese()==2)
				{
					c=inizio.bis();
					if(c==true)
					{
						dayI=(short) (dayI+29);
					}else {
						dayI=(short) (dayI+28);
					}
				}
			dayI= (short) (dayI+gg[i]);
			}
			dayI=(short) (dayI+inizio.getGiorno());
			
			
			for(short i=0; i<(finale.getAnno())-1;i++)
			{
				c=inizio.bis();
				if(c==true && finale.getAnno()!=0 )
				{
					dayF=(short) (dayF+366);
				}else {
					dayF=(short) (dayF+365);
				}
				
			}
			for(short i=0; i<(finale.getMese()-1);i++)
			{
				if(finale.getMese()==2)
				{
					c=finale.bis();
					if(c==true)
					{
						dayF=(short) (dayI+29);
					}else {
						dayF=(short) (dayI+28);
					}
				}
			dayF=(short) (dayF+gg[i]);
			}
			dayF=(short) (dayF+finale.getGiorno());
			dayF=(short) (dayF-dayI);
			return dayF;
		}
		public boolean verifyDate()
		{
				boolean c;
			if(giorno>31)
			{
				return false;
			}
			if(mese>12)
			{
				return false;
			}
			if(mese==4 && giorno>30)
			{
				return false;
			}
			if(mese==6 && giorno>30)
			{
				return false;
			}
			if(mese==9 && giorno>30)
			{
				return false;
			}
			if(mese==11 && giorno>30)
			{
				return false;
			}
			if(c=bis()==false && mese==2 && giorno>28)
			{
				return false;
			}
			return true;
			
		}
		public String giornoDellaSettimana()
		{
			DataDiCalendario anno1920 = new DataDiCalendario((short)01,(short)01,(short)1920);
			short i= (short) (anno1920.dateDifference(anno1920, this)%7);
			return gDs[i+2];
		}
	public String toStringCompl()
	{
		return "Data: "+giorno+" "+ar[mese-1]+" "+anno+" giorno della settimana: "+"Bisestile: "+bis();
	}
	
}
