package mf0227.uf2404.actividad2;

public class Coche extends Vehiculo {

	// ATRIBUTOS
	protected String marca;
	protected String modelo;
	protected int potencia;
	protected int cilindrada;

	// CONSTRUCTOR DEL COCHE
	public Coche() {
		super();
		this.marca = "";
		this.modelo = "";
		this.color = "";
		this.matricula = "";
		this.potencia = 0;
		this.cilindrada = 0;
	}

	// GETTERS Y SETTERS
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	// MOSTRADO DE DATOS EN CONSOLA
	@Override
	public String toString() {
		return "Coche \n" + marca + " " + modelo + " / " + cilindrada + "cc / " + potencia + " cv\n" + "Color " + color
				+ ", matrícula " + matricula + "\n";

	}

}
