package br.com.treino.PT.models.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "TB_STATUS_CLIENTE", schema = "aplicacao")
@Builder
public class StatusCliente implements Serializable {

    @Id
    @Column(name = "CD_STATUS")
    @GeneratedValue
    private Long codigo;
    @Column(name = "DS_STATUS")
    private String status;

    public StatusCliente(){
    }

    public StatusCliente(Long codigo, String status) {
        this.codigo = codigo;
        this.status = status;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StatusCliente build(){
        return new StatusCliente(codigo,status);
    }
}
