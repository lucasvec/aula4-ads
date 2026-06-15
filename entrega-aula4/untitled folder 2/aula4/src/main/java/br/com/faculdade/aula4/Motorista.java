package br.com.faculdade.aula4;

import java.util.Objects;
import java.util.Optional;

public record Motorista(
        String nome,
        boolean cnhAtiva,
        int anosEmpresa,
        Optional<Seguro> seguroAtivo
) {

    public Motorista {
        nome = Objects.requireNonNull(nome, "nome");
        seguroAtivo = seguroAtivo == null ? Optional.empty() : seguroAtivo;

        if (anosEmpresa < 0) {
            throw new IllegalArgumentException("anosEmpresa nao pode ser negativo");
        }
    }

    public boolean possuiSeguroAtivo() {
        return seguroAtivo.filter(Seguro::ativo).isPresent();
    }

    public String resumo() {
        return "%s - %d ano(s) de empresa".formatted(nome, anosEmpresa);
    }
}
