
public class Calculos {
	private double paceMinutos;
	private double paceSegundos;
	private double hora;
	private double minutos;
	private double segundos;
	private double distancia;
	
	
	
	public double getPaceMinutos() {
		return paceMinutos;
	}

	public void setPaceMinutos(double paceMinutos) {
		this.paceMinutos = paceMinutos;
	}

	public double getPaceSegundos() {
		return paceSegundos;
	}

	public void setPaceSegundos(double paceSegundos) {
		this.paceSegundos = paceSegundos;
	}

	public double getHora() {
		return hora;
	}

	public void setHora(double hora) {
		this.hora = hora;
	}

	public double getMinutos() {
		return minutos;
	}

	public void setMinutos(double minutos) {
		this.minutos = minutos;
	}

	public double getSegundos() {
		return segundos;
	}

	public void setSegundos(double segundos) {
		this.segundos = segundos;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public double Tempo(double distancia, double paceMinutos, double paceSegundos) {
		double paceTotal = paceMinutos + (paceSegundos / 60);
		return distancia * paceTotal;
	}
	
	public double Pace(double distancia, double hora, double minutos, double segundos) {
		double tempoTotal = (hora * 60) + minutos + (segundos / 60);
		return tempoTotal / distancia;
	}
	

	public double Distancia(double paceMinutos, double paceSegundos,double hora, double minutos, double segundos) {
		double paceTotal = paceMinutos + paceSegundos;
		double tempoTotal = (hora * 60) + minutos + (segundos / 60);
		return paceTotal / tempoTotal;
	}
}
