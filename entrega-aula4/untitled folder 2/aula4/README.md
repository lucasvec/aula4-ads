# Aula 4 - Java moderno e produtividade com IA

Atividade pratica sobre modernizacao de codigo Java legado para Java 21.

## Arquivos principais

- `PRODUTIVIDADE_IA.md`: entrega solicitada pela faculdade.
- `src/main/java/br/com/faculdade/aula4/Aula4Modernizada.java`: exemplo executavel.
- `src/main/java/br/com/faculdade/aula4/GestaoFrotas.java`: logica modernizada com Stream API.
- `src/main/java/br/com/faculdade/aula4/Motorista.java`: `record` com `Optional` de seguro.
- `src/main/java/br/com/faculdade/aula4/Seguro.java`: `record` simples para o seguro.

## Como compilar quando o JDK 21 estiver instalado

```bash
javac --release 21 -d out $(find src/main/java -name "*.java")
java -cp out br.com.faculdade.aula4.Aula4Modernizada
```
