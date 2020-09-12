package br.com.treino.PT.models.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "TB_STATUS_CLIENTE", schema = "aplicacao")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StatusCliente implements Serializable {

    @Id
    @Column(name = "CD_STATUS")
    @GeneratedValue
    private Long codigo;
    @Column(name = "DS_STATUS")
    private String status;
}
