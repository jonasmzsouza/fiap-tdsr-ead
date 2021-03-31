package br.com.fiap.exception;

public class VeiculoNotFoundException extends Exception {

	public VeiculoNotFoundException() {
		super("Ve�culo n�o encontrado");
	}

	public VeiculoNotFoundException(String msg) {
		super(msg);
	}

}
