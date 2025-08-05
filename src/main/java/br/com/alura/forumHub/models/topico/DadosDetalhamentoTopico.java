package br.com.alura.forumHub.models.topico;

import java.time.LocalDate;

public record DadosDetalhamentoTopico(Long id, String titulo, String mensagem, LocalDate dataCriacao, String autor, String curso, Boolean status) {
    public DadosDetalhamentoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataCriacao(), topico.getAutor(), topico.getCurso(), topico.getStatus());
    }
}
