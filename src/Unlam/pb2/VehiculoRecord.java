package Unlam.pb2;



public record VehiculoRecord(String marca,
		String modelo, Integer numeroDeChasis) {
	
	public VehiculoRecord(Integer numeroDeChasis) {
		this("Peugeot", "308", numeroDeChasis);
	}
}














 



















