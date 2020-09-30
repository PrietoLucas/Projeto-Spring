package br.com.treino.PT.models.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "TB_CLIENTE", schema = "aplicacao")
public class Cliente implements Serializable {

    @Id
    @Column(name = "CD_CLIENTE")
    @GeneratedValue
    private Long codigo;
    @Column(name = "NM_CLIENTE")
    private String nome;
    @Column(name = "CD_STATUS_CLIENTE")
    private Long status;
    @Column(name = "CD_ENDERECO")
    private Long endereco;
    @Column(name = "DS_EMAIL")
    private String email;

    public Cliente(){
    }

    public Cliente(Long codigo, String nome, Long status, Long endereco, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.status = status;
        this.endereco = endereco;
        this.email = email;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getEndereco() {
        return endereco;
    }

    public void setEndereco(Long endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static class Builder{
        private Long codigo;
        private String nome;
        private Long status;
        private Long endereco;
        private String email;

        public Builder codigo(Long codigo){
            this.codigo = codigo;

            return this;
        }

        public Builder nome(String nome){
            this.nome = nome;

            return this;
        }

        public Builder status(Long status){
            this.status = status;

            return this;
        }

        public Builder endereco(Long endereco){
            this.endereco = endereco;

            return this;
        }

        public Builder email(String email){
            this.email = email;

            return this;
        }

        public Cliente build(){
            Cliente cliente = new Cliente();
            cliente.codigo=this.codigo;
            cliente.nome=this.nome;
            cliente.status=this.status;
            cliente.endereco=this.endereco;
            cliente.email=this.email;

            return cliente;
        }
    }


}
