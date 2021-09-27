package com.trabalho.trabalho01.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_cliente")
public class Cliente {
    /* codigo interno, nome, cpf,telefone,email,
 */

 @Id
 @GeneratedValue(strategy= GenerationType.IDENTITY)
 private long cod;

 @Column(length = 100,nullable = false) // se não colocar name por padrão ele coloca o que está la
 private String nome;
 @Column(length = 11,nullable = false,unique = true)
 private String cpf;
 @Column(length = 12,nullable = false)
 private String telefone;
 @Column(length = 50,nullable = false, unique = true)
 private String email;

@OneToMany(mappedBy ="proprietario")
@JsonIgnoreProperties("proprietario")
private List<Banco> contas;

 public long getCod() {
    return cod;
}
public void setCod(long cod) {
    this.cod = cod;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getCpf() {
    return cpf;
}
public void setCpf(String cpf) {
    this.cpf = cpf;
}
public String getTelefone() {
    return telefone;
}
public void setTelefone(String telefone) {
    this.telefone = telefone;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public List<Banco> getContas() {
    return contas;
}
public void setContas(List<Banco> contas) {
    this.contas = contas;
}


}
