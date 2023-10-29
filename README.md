# API REST com Spring Webflux

Projeto desenvolvido durante o curso introdutório [Spring Webflux - Michelli Brito](https://www.youtube.com/watch?v=jW1YdAb3GZo&ab_channel=MichelliBrito).

### Requisitos: 
- SpringBoot 3.1.5
- Java 17
- Banco NoSql MongoDB

#### Para acessar o projeto basta acessar: [http://localhost:8080/playlist](http://localhost:8080/playlist)

### Observação: 
Foi utilizado o [Altas (Cloud MongoDB)](https://cloud.mongodb.com/), para subir uma instância do mongo sandbox utilizado nos testes. 

Necessário adicionar a URI no arquivo `src/resources/application.yml` na propriedade: `spring.data.mongodb.uri:`

Existe uma classe **DummyData** utilizada para popular o banco, localizada na raiz do projeto: `src/java/br/com/matheuspadilha/apirestwebflux/DummyData`.

#### Como executar? 
Basta descomentar o codigo e subir o projeto e o banco será populado.

#### Importante:
  - Após a executação, lembre-se de comentar novamente para que não fique apagando e recriando os dados.

Exemplo de estilo funcional com a implementação do Handler e Router.
- Localizado na raiz do projeto:
  - PlaylistHandler: `src/java/br/com/matheuspadilha/apirestwebflux/PlaylistHandler`
  - PlaylistRouter: `src/java/br/com/matheuspadilha/apirestwebflux/PlaylistRouter`

