package br.com.matheuspadilha.apirestspringwebflux.repository;

import br.com.matheuspadilha.apirestspringwebflux.document.Playlist;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, String> {

}
