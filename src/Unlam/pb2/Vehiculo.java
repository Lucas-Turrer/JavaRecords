package Unlam.pb2;

import java.util.Objects;

public class Vehiculo {
	
	
	private final String marca;
	private final String modelo;
	private final Integer numeroDeChasis;
	
	public Vehiculo(String marca, String modelo,
			Integer numeroDeChasis) {
		this.marca = marca;
		this.modelo = modelo;
		this.numeroDeChasis = numeroDeChasis;
	}
	@Override
	public int hashCode() {
		return Objects.hash(numeroDeChasis);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true; 
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(numeroDeChasis, other.numeroDeChasis);
	} 
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", numeroDeChasis=" 
	+ numeroDeChasis + "]";
	}
	
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public Integer getNumeroDeChasis() {
		return numeroDeChasis;
	}
	
}
