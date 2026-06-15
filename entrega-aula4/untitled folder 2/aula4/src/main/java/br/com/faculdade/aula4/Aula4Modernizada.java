package br.com.faculdade.aula4;

import java.util.List;
import java.util.Optional;

public class Aula4Modernizada {

    public static void main(String[] args) {
        List<Motorista> motoristas = getMotoristasDaEmpresa();

        List<Motorista> habilitados = GestaoFrotas.motoristasHabilitadosPorTempoDeCasa(motoristas);
        habilitados.stream()
                .map(Motorista::resumo)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Habilitados com seguro ativo:");

        GestaoFrotas.motoristasHabilitadosComSeguroPorTempoDeCasa(motoristas)
                .stream()
                .map(Motorista::nome)
                .forEach(System.out::println);
    }

    private static List<Motorista> getMotoristasDaEmpresa() {
        return List.of(
                new Motorista("Ana", true, 4, Optional.of(new Seguro("APL-100", true))),
                new Motorista("Bruno", false, 8, Optional.of(new Seguro("APL-200", true))),
                new Motorista("Carla", true, 2, Optional.empty()),
                new Motorista("Diego", true, 6, Optional.of(new Seguro("APL-300", false))),
                new Motorista("Eduardo", true, 1, Optional.of(new Seguro("APL-400", true)))
        );
    }
}
