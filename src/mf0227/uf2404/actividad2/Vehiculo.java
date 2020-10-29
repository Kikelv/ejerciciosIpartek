package mf0227.uf2404.actividad2;

public class Vehiculo implements IConducible {

	protected String color;
	protected String matricula;

	public Vehiculo() {
		super();
		this.color = "";
		this.matricula = "";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Vehiculo [color=" + color + ", matricula=" + matricula + "]";
	}

	@Override
	public void arrancar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub

	}

}
