package model;

public class Circulo {

	public double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double getPerimetro() {
		double perimetro = (2 * raio) * 3.14;
		return perimetro;
	}
	
	public double getArea() {
		double area = (raio * raio) * 3.14;
		return area;
	}
	
}
