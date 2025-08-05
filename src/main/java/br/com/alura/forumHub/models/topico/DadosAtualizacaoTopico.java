package br.com.alura.forumHub.models.topico;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoTopico(
    @NotNull
    Long id,
    String titulo,
    String mensagem,
    String autor,
    String curso) {
}
