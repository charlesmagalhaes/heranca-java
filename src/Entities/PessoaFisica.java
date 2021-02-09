package Entities;

public class PessoaFisica extends Contribuinte {
	
	private double gastosSaude;

	

	public PessoaFisica(String name, double rendaAnual, double gastosSaude) {
		super(name, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double calculoTaxa() {
		if (getRendaAnual() < 20000.00) {
			
			return (getRendaAnual()*0.15) - (gastosSaude * 0.50);
		} else {
			
			return (getRendaAnual()*0.25) - (gastosSaude * 0.50);
		}
		
	}
	
	
	

}
