package br.com.faculdade.aula4;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public final class GestaoFrotas {

    private GestaoFrotas() {
    }

    public static List<Motorista> motoristasHabilitadosPorTempoDeCasa(
            List<Motorista> motoristas
    ) {
        return Objects.requireNonNull(motoristas, "motoristas")
                .stream()
                .filter(Objects::nonNull)
                .filter(Motorista::cnhAtiva)
                .sorted(Comparator.comparingInt(Motorista::anosEmpresa))
                .toList();
    }

    public static List<Motorista> motoristasHabilitadosComSeguroPorTempoDeCasa(
            List<Motorista> motoristas
    ) {
        return Objects.requireNonNull(motoristas, "motoristas")
                .stream()
                .filter(Objects::nonNull)
                .filter(Motorista::cnhAtiva)
                .filter(Motorista::possuiSeguroAtivo)
                .sorted(Comparator.comparingInt(Motorista::anosEmpresa))
                .toList();
    }
}
