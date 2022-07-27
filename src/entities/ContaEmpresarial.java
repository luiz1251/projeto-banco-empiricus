package entities;

import conta.Conta;

public class ContaEmpresarial extends Conta {
	private float emprestimoEmpresa;

	public ContaEmpresarial(int numero, String cpf) {
		super(numero, cpf);
		this.setEmprestimoEmpresa(10000);
	}
	
	public void pedirEmprestimo(float valorDoEmprestimo) {
		if(valorDoEmprestimo <= getEmprestimoEmpresa()) {
			credito(valorDoEmprestimo);
			setEmprestimoEmpresa(getEmprestimoEmpresa() - valorDoEmprestimo);
		}
	}

	public float getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(float emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
}
