package Exercicio01;
import java.util.Date;

public class Conta {

	private int numero;
	private String titular;
	private double saldo;
	private Date dataAbertura;

	public Conta(){
		dataAbertura = new Date();
	}
	public int getNumero(){
		return numero;
	}
	public void setNumero(int numero){
		this.numero = numero;
	}
	public String getTitular(){
		return titular;
	}
	public void setTitular(String titular){
		this.titular = titular;
	}
	public double getSaldo(){
		return saldo;
	}
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	public Date getDataAbertura(){
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura){
		this.dataAbertura = dataAbertura;
	}
}
