package br.com.vr.miniautorizador.domain;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_cartao")
public class Cartao {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String numero;

    private String senha;

}
