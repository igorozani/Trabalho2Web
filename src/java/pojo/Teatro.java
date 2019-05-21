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
public class Teatro implements Serializable {
    
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)      
 private String email;
 private String senha;
 private String cidade;
 private String nome;
 private String cnpj;
 
 public Teatro(String email, String cidade, String nome, String cnpj) {
    this.email = email;	 
    this.cidade = cidade;
    this.nome = nome;
    this.cnpj = cnpj;
    
 }
 public Teatro(String email, String senha, String cidade, String nome, String cnpj) {
    this.email = email;	 
    this.cidade = cidade;
    this.nome = nome;
    this.cnpj = cnpj;
    this.senha = senha;
    
 }
 
 public Teatro(String cnpj) {
    this.cnpj = cnpj;
       
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
 public String getCidade() {
 return cidade;
 }
 public void setCidade(String cidade) {
 this.cidade = cidade;
 }
 public String getNome() {
 return nome;
 }
 public void setNome(String nome) {
 this.nome = nome;
 }

 public String getCnpj() {
 return cnpj;
 }
 public void setCNPJ(String cnpj) {
 this.cnpj = cnpj;
 }
    
}
