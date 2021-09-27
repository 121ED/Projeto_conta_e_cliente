package com.trabalho.trabalho01.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_conta")
public class Banco {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long numero;
    private long agencia;
    private long tipoConta;
    private double saldo;

    @ManyToOne
    @JoinColumn(name="Tit_da_conta")
    @JsonIgnoreProperties("contas")
    private Cliente proprietario;

    public long getNumero() {
        return numero;
    }
    public void setNumero(long numero) {
        this.numero = numero;
    }
    public long getAgencia() {
        return agencia;
    }
    public void setAgencia(long agencia) {
        this.agencia = agencia;
    }
    public long getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(long tipoConta) {
        this.tipoConta = tipoConta;
    }
       
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Cliente getProprietario() {
        return proprietario;
    }
    public void setProprietario(Cliente proprietario) {
        this.proprietario = proprietario;
    }
    

}
