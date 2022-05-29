package esJavaList;




class Eccezione extends java.lang.Exception {
}

public class Garage {
    static final int NUMERO_POSTI = 25;
    private VeicoloInGarage posti[];
    
    public Garage() {
        posti = new VeicoloInGarage[NUMERO_POSTI];
    }
    
    public int ingressoVeicolo(Veicolo veicolo, int ora, int minuti) throws Eccezione {
        int posizione;
        VeicoloInGarage tmp = new VeicoloInGarage(veicolo.clone(), ora, minuti);
                
        for (posizione=0; posizione<NUMERO_POSTI; posizione++) 
           if (posti[posizione] == null)
           {
            posti[posizione] = tmp;
            return posizione+1;
           }
        throw new Eccezione();
    }
    
    public double uscitaVeicolo(int posizione, int ore, int minuti) throws Eccezione {
        int oreSosta, minutiSosta;
        double costo;
        
        if (posizione<1 || posizione>NUMERO_POSTI)
          throw new Eccezione();
        if (posti[posizione-1] == null)
          throw new Eccezione();
        oreSosta = ore - posti[posizione-1].getOraArrivo();
        if (minuti >= posti[posizione-1].getMinutiArrivo())
          minutiSosta = minuti - posti[posizione-1].getMinutiArrivo();
        else
            {
             oreSosta--;
             minutiSosta = 60 - (minuti - posti[posizione-1].getMinutiArrivo());
           }
        costo = posti[posizione-1].getVeicolo().costoParcheggio(oreSosta, minutiSosta);
        posti[posizione-1] = null;
        return costo;
    }

    public VeicoloInGarage[] statoPosizioni() {
        VeicoloInGarage[] stato = new VeicoloInGarage[NUMERO_POSTI];
        
        for (int posizione=0; posizione<NUMERO_POSTI; posizione++)
           if (posti[posizione] != null)
             stato[posizione] = new VeicoloInGarage(posti[posizione]);
        
        return stato;
    }
    
    public static void main(String args[]) {
        Garage garage = new Garage();
        ConsoleInput input = new ConsoleInput();
        int scelta, tipo, ore, minuti, posizione;
        String marca, modello, tipoAlimentazione;
        int cilindrata, annoImmatricolazione, capacitaCarico, numeroPosti, tempiMotore;
        double importo;
        Veicolo veicolo = null;
        
        do {
            System.out.println("0) fine");
            System.out.println("1) ingresso veicolo");
            System.out.println("2) uscita veicolo");
            scelta = input.readInt();
            
            switch (scelta) {
                case 1:     System.out.println("1) furgone");
                            System.out.println("2) autovettura");
                            System.out.println("3) motocicletta");
                            tipo = input.readInt();
                            if (tipo <=0 || tipo>3) {
                                System.out.println("Tipo di veicolo sconosciuto!");
                                break;
                            }
                            System.out.println("Ore? ");
                            ore = input.readInt();
                            System.out.println("Minuti? ");
                            minuti = input.readInt();
                            if (ore <0 || ore>23 || minuti<0 || minuti>59) {
                                System.out.println("Orario errato!");
                                break;
                            }
                            System.out.println("Marca? ");
                            marca = input.readLine();
                            System.out.println("Modello? ");
                            modello = input.readLine();
                            System.out.println("Tipo di alimentazione? ");
                            tipoAlimentazione = input.readLine();
                            System.out.println("Cilindrata? ");
                            cilindrata = input.readInt();
                            System.out.println("Anno di immatricolazione? ");
                            annoImmatricolazione = input.readInt();
                            if (tipo == 1) {
                                System.out.println("Capacità di carico? ");
                                capacitaCarico = input.readInt();
                                veicolo = new Furgone(capacitaCarico, annoImmatricolazione, marca, modello, tipoAlimentazione, cilindrata);
                            }
                            if (tipo == 2) {
                                System.out.println("Numero di posti? ");
                                numeroPosti = input.readInt();
                                veicolo = new Autovettura(numeroPosti, annoImmatricolazione, marca, modello, tipoAlimentazione, cilindrata);
                            }
                            if (tipo == 3) {
                                System.out.println("Tempi motore? ");
                                tempiMotore = input.readInt();
                                veicolo = new Motocicletta(tempiMotore, annoImmatricolazione, marca, modello, tipoAlimentazione, cilindrata);
                            }
                            try {
                                posizione = garage.ingressoVeicolo(veicolo, ore, minuti);
                                System.out.println("Veicolo parcheggiato nella posizione "+posizione);
                            }
                            catch (Eccezione e) {
                                System.out.println("Parcheggio pieno!");
                            }
                            break;
                case 2:     System.out.println("Posizione? ");
                            posizione = input.readInt();
                            System.out.println("Ore? ");
                            ore = input.readInt();
                            System.out.println("Minuti? ");
                            minuti = input.readInt();
                            if (ore <0 || ore>23 || minuti<0 || minuti>59) {
                                System.out.println("Orario errato!");
                                break;
                            }
                            try {
                                importo = garage.uscitaVeicolo(posizione, ore, minuti);
                                System.out.println("Importo da pagare "+importo);
                            }
                            catch (Eccezione e) {
                                System.out.println("Posizione errata!");
                            }
                            break;
            }
        
        } while (scelta != 0);
    }
}
