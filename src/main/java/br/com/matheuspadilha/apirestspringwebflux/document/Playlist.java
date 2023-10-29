package br.com.matheuspadilha.apirestspringwebflux.document;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Playlist {

    @Id
    private String id;

    private String name;
}
