package br.com.matheuspadilha.apirestspringwebflux.controller;

import br.com.matheuspadilha.apirestspringwebflux.document.Playlist;
import br.com.matheuspadilha.apirestspringwebflux.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/playlist")
public class PlaylistController {

    @Autowired
    private PlaylistService service;

    @GetMapping
    public Flux<Playlist> getPlaylist() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Playlist> getPlaylistId(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    public Mono<Playlist> save(@RequestBody Playlist playlist) {
        return service.save(playlist);
    }

    @GetMapping(value="/webflux", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Tuple2<Long, Playlist>> getPlaylistByWebflux(){

        System.out.println("---Start get Playlists by WEBFLUX--- " + LocalDateTime.now());
        Flux<Long> interval = Flux.interval(Duration.ofSeconds(10));
        Flux<Playlist> playlistFlux = service.findAll();

        return Flux.zip(interval, playlistFlux);

    }

    @GetMapping("/mvc")
    public List<String> getPlaylistByMvc() throws InterruptedException {

        System.out.println("---Start get Playlists by MVC--- " + LocalDateTime.now());

        List<String> playlistList = new ArrayList<>();
        playlistList.add("Java 8");
        playlistList.add("Spring Security");
        playlistList.add("Github");
        playlistList.add("Deploy de uma aplicação java no IBM Cloud");
        playlistList.add("Bean no Spring Framework");
        TimeUnit.SECONDS.sleep(15);

        return playlistList;

    }

}
