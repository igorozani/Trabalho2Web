/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author clauc
 */
@Entity
public class Site implements Serializable {
    
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)   
 private String email;
 private String senha;
 private String endereco;
 private String nome;
 private String telefone;
 
 
 public Site(String email, String senha, String endereco, String nome, String telefone) {
 this.email = email;	 
 this.senha = senha;
 this.endereco = endereco;
 this.nome = nome;
 this.telefone = telefone;
 }

 public String getEmail() {
 return email;
 }
 public void setEmail(String email) {
 this.email = email;
 }
 public String getSenha() {
 return senha;
 }
 public void setSenha(String senha) {
 this.senha = senha;
 }
 public String getEndereco() {
 return endereco;
 }
 public void setEndereco(String endereco) {
 this.endereco = endereco;
 }
 public String getNome() {
 return nome;
 }
 public void setNome(String nome) {
 this.nome = nome;
 }

 public String getTel() {
 return telefone;
 }
 public void setTel(String telefone) {
 this.telefone = telefone;
 }
    
}
