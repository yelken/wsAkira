package br.com.akira.usuario;

import br.com.akira.basica.Basica;

public class Usuario extends Basica {
	 
  private String usuario;
  private Double senha; 
  private String nome;
  // private String facebook;
  //  private String google;

  public String getUsuario() {
	return usuario;
}
public void setUsuario(String usuario) {
	this.usuario = usuario;
}
public Double getSenha() {
	return senha;
}
public void setSenha(Double senha) {
	this.senha = senha;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
 	
}
