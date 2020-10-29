package mf0227.uf2404.actividad2;

public class Coche extends Vehiculo {

	// ATRIBUTOS (EN PRIVATE PARA QUE SE ACCEDA POR GETTER Y SETTERS)
	private String marca;
	private String modelo;
	private int potencia;
	private int cilindrada;

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

	@Override
	public String toString() {
		return "Coche \n" + getMarca() + " " + getModelo() + " / " + getCilindrada() + "cc / " + getPotencia() + " cv\n"
				+ "Color " + getColor() + ", matrícula " + getMatricula() + "\n";
	}

	// MOSTRADO DE DATOS EN CONSOLA

}
