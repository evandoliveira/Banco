package modelo;

import java.util.ArrayList;
import java.util.Collection;

public class Agencia extends EntidadeBanco {
	private Long identificador;
	private String nome;
	private Banco banco;
	private Collection<Conta> contas;
	public Agencia (String nome){
		this.nome = nome;
		contas = new ArrayList<Conta>();
	}
	public Long getIdentificador() {
		return identificador;
	}
}
