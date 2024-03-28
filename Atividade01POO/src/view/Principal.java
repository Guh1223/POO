package view;

import model.Circulo;

public class Principal {
	
	
	public static void main(String[] args) {
		double raio = 3;
		Circulo c1 = new Circulo(raio);
		
		double perimetro = c1.getPerimetro();
		double area = c1.getArea();
		
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Area: " + area);
		
	}
}
