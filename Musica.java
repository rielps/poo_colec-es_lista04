import java.time.Duration;
import java.time.LocalDateTime;

public class Musica {

    private String titulo;
    private String artista;
    private String album;
    private LocalDateTime dataInclusao;
    private Duration duracao;

    public Musica(String titulo, String artista, String album, Duration duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.dataInclusao = LocalDateTime.now(); // A data de inclusão é definida como o momento da criação da música
        this.duracao = duracao;
    }

   
    @Override
    public String toString() {
        return "Título: " + titulo + ", Artista: " + artista + ", Álbum: " + album +
               ", Data de Inclusão: " + dataInclusao + ", Duração: " + formatarDuracao(duracao); //informacões da musica
    }

    
    private String formatarDuracao(Duration duracao) {
        long minutos = duracao.toMinutes();
        long segundos = duracao.getSeconds() % 60;
        return String.format("%02d:%02d", minutos, segundos);// formatar a duração
    }

   
    public Duration getDuracao() {
        return duracao;    // acessa os atributos, caso necessário
    }
}
