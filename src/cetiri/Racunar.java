package cetiri;

public class Racunar {
	
	double kolicinaRAMa;
	double kapacitetHD;
	double brzinaProcesora;
	double dijagonalaMonitora;
	double nabavnaCijena;
	
	final double priceFactor=0.1;
	
	public Racunar(double kolicinaRAMa, double kapacitetHD, double brzinaProcesora, double dijagonalaMonitora,
			double nabavnaCijena) {
		super();
		this.kolicinaRAMa = kolicinaRAMa;
		this.kapacitetHD = kapacitetHD;
		this.brzinaProcesora = brzinaProcesora;
		this.dijagonalaMonitora = dijagonalaMonitora;
		this.nabavnaCijena = nabavnaCijena;
	}
	@Override
	public String toString() {
		return "Racunar [kolicinaRAMa=" + kolicinaRAMa + ", kapacitetHD="
				+ kapacitetHD + ", brzinaProcesora=" + brzinaProcesora
				+ ", dijagonalaMonitora=" + dijagonalaMonitora
				+ ", nabavnaCijena=" + nabavnaCijena + ", priceFactor="
				+ priceFactor + "]";
	}
	
	
}










