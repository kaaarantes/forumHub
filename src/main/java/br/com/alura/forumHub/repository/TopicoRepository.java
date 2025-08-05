package br.com.alura.forumHub.repository;

import br.com.alura.forumHub.models.topico.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
