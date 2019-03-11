package cetiri;

public class Laptop extends Racunar {
	
	public Laptop(double kolicinaRAMa, double kapacitetHD, double brzinaProcesora, double dijagonalaMonitora,
			double nabavnaCijena, double trajanjeBaterije) {
		super(kolicinaRAMa, kapacitetHD, brzinaProcesora, dijagonalaMonitora, nabavnaCijena);
		this.trajanjeBaterije = trajanjeBaterije;
	}
	double trajanjeBaterije;
	final double priceFactor=0.15;
	
	@Override
	public String toString() {
		return "Laptop [trajanjeBaterije = " + trajanjeBaterije +  ", kolicinaRAMa = "
				+ kolicinaRAMa + ", kapacitetHD = " + kapacitetHD + ", brzinaProcesora = " + brzinaProcesora
				+ ", dijagonalaMonitora = " + dijagonalaMonitora + ", Cijena = " + (this.priceFactor+1) * nabavnaCijena + "]";
	}
	
	
}



