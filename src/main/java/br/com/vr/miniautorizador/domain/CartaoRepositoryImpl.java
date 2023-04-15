package br.com.vr.miniautorizador.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CartaoRepositoryImpl implements CartaoRepository {

    private CartaoRepositoryJpa cartaoRepositoryJpa;

}
