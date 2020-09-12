package br.com.treino.PT.models.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Builder
@Table(name = "TB_CLIENTE", schema = "aplicacao")
@NoArgsConstructor
@AllArgsConstructor
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

}
