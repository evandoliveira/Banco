package modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import util.UtilData;

public class Conta extends EntidadeBanco {

	private Long identificador;

	private int numero;

	private Date dataAbertura;

	private double saldo;
	
	private Cliente titular;

	private Collection<Transacao> transacoes;
	
	private Agencia agencia;

	// construtor padrão da classe Conta que define a data de criação da conta e inicializa o array de transacao
	public Conta() {

		dataAbertura = UtilData.data();
		movimento = new ArrayList();
	}

	// construtor com dois parametros
	public Conta( Cliente nome, int nconta ) {

		this();
		numero = nconta;
		titular = nome;
		saldo = 0.0; // Conta em reais e zerada
	}

	@Override
	public Long getIdentificador() {

		return identificador;
	}

	public void setIdentificador(Long identificador) {

		this.identificador = identificador;
	}

	public int getNumero() {

		return numero;
	}

	public void setNumero(int numero) {

		this.numero = numero;
	}

	public Cliente getTitular() {

		return titular;
	}

	public void setTitular(Cliente titular) {

		this.titular = titular;
	}

	public Date getDataAbertura() {

		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {

		this.dataAbertura = dataAbertura;
	}

	public double getSaldo() {

		return saldo;
	}

	public void setSaldo(double saldo) {

		this.saldo = saldo;
	}

	public ArrayList getMovimento() {

		return movimento;
	}

	public void setMovimento(ArrayList movimento) {

		this.movimento = movimento;
	}

}
