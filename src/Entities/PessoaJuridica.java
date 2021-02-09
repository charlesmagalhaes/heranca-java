package Entities;

public class PessoaJuridica extends Contribuinte {
	
	private int numeroFuncionarios;

	

	public PessoaJuridica(String name, double rendaAnual, int numeroFuncionarios) {
		super(name, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double calculoTaxa() {
		
		if (numeroFuncionarios > 10) {
			
			
			return getRendaAnual() * 0.14;
			
		}else {
			
			
			return getRendaAnual() * 0.16;
			
		}
		
		
	}

	
	
	

}
