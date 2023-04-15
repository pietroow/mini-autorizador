package br.com.vr.miniautorizador.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CartaoRepositoryJpa extends JpaRepository<Cartao, UUID> {

}
