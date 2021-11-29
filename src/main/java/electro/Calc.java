package electro;

public abstract class Calc {
	private double baseTarif=3.5;
	
	public double mul(double indications, double sum) {
		sum+=baseTarif*indications;
		return sum;
	}
	
	public double getBaseTarif() {
		return baseTarif;	
	}
	
	public void setBaseTarif(double tarif) {
		this.baseTarif=tarif;
	}
	
	public void getMultiAll() {

	}


}
