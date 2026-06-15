package br.com.faculdade.aula4;

import java.util.Objects;

public record Seguro(String apolice, boolean ativo) {

    public Seguro {
        apolice = Objects.requireNonNull(apolice, "apolice");
    }
}
