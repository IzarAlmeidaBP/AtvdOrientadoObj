package atvd2.entities;

public class Retangulo {

	public double valorA;
	public double valorB;

	public double area() {
		return valorA * valorB;
	}

	public double perimeter() {
		return (valorA + valorB) *2;
	}

	public double diagonal() {
		return Math.sqrt(Math.pow(valorA, 2) + Math.pow(valorB, 2));

	}
	public String toString() {
		
		return "AREA = "+ String.format("%.2f", area())+ "\nPERIMETER = "+ String.format("%.2f", perimeter())+ "\nDIAGONAL = "+String.format("%.2f", diagonal());
	}
}
