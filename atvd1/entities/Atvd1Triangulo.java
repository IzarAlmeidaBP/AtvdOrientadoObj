package atvd1.entities;

public class Atvd1Triangulo {
	
	
	public double valorA;
	public double valorB;
	public double valorC;
	
	public double area() {
		double p = (valorA + valorB + valorC) / 2;
		return Math.sqrt(p*(p - valorA)* (p - valorB)* (p - valorC));
	}
}
