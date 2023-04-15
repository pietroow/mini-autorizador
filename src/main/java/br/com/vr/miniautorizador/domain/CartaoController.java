package br.com.vr.miniautorizador.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@RequestMapping("/cartoes")
public class CartaoController {

    private final CartaoService cartaoService;

}
